package net.alonsecs.characters;

public class Character {
  protected int hp;
  protected int pp;
  protected String name;
  protected Skill[] skills;

  public int getHp() {
    return hp;
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

  
}
