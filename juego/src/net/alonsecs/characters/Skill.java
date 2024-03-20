package net.alonsecs.characters;

public class Skill {
  protected int damage;
  protected String name;

  public Skill(int damage, String name) {
    this.damage = damage;
    this.name = name;
  }

  public void use() {
    System.out.println("habilidad usada");
  }

  public int getDamage() {
    return damage;
  }

  public String getName() {
    return name;
  }

}
