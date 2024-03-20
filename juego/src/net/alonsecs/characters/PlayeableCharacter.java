package net.alonsecs.characters;

import java.util.Arrays;

public class PlayeableCharacter {
  protected int hp;
  protected int pp;
  protected String name;
  protected Skill[] skills;

  public PlayeableCharacter(int hp, int pp, String name, Skill[] skills) {
    this.hp = hp;
    this.pp = pp;
    this.name = name;
    this.skills = skills;
  }

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

  public void recibeDamage(int damage) {
    this.hp =this.hp - damage;
    if (this.hp < 0) {
      this.hp = 0;
    }
  }

  public void useSkill(int index) {
    skills[index].use();
  }

  @Override
  public String toString() {
    return "Character [hp=" + hp + ", pp=" + pp + ", name=" + name + ", skills=" + Arrays.toString(skills) + "]";
  }

  
}
