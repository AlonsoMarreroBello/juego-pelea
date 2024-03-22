package net.alonsecs.characters;

public class PlayeableCharacter {
  protected int hp;
  protected int pp;
  protected String name;
  protected Skill[] skills;

  public PlayeableCharacter(int hp, int pp, String name) {
    this.hp = hp;
    this.pp = pp;
    this.name = name;
  }

  public PlayeableCharacter(int hp, int pp, String name, Skill[] skills) {
    this.hp = hp;
    this.pp = pp;
    this.name = name;
    this.skills = skills;
  }

  public int getHp() {
    return hp;
  }
  public String showHp() {
    String message = "[";
    for (int i = 0; i < this.hp/5; i++) {
      message += "#";
    }
    for (int i = 20; i > this.hp/5; i--) {
      message += "-";
    }
    message += "]";
    return message;
  }
  public void setHp(int hp) {
    this.hp = hp;
  }
  public int getPp() {
    return pp;
  }
  public void setPp(int pp) {
    this.pp = pp;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Skill[] getSkills() {
    return skills;
  }
  public void setSkills(Skill[] skills) {
    this.skills = skills;
  }

  public void recibeDamage(int damage) {
    this.hp = this.hp - damage;
    if (this.hp < 0) {
      this.hp = 0;
    }
  }

  public int useSkill(int index) {
    this.pp = this.pp - skills[index].getCost();
    return skills[index].getDamage();
  }

  public String showSkillsList() {
    String message = ""; 
    for (Skill skill : skills) {
      message += "\t" + skill.toString();
    }
    return message;
  }

  @Override
  public String toString() {
    return getName() + 
    "\n------------------------------------------------------\n"  +
    showHp() + "\n" + getHp() + " HP \n" + 
    getPp() + " PP" + 
    "\nHabilidades: \n" + 
    showSkillsList() + 
    "------------------------------------------------------\n";
  }


}
