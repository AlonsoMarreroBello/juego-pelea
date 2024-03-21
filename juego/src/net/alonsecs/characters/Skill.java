package net.alonsecs.characters;

public class Skill {
  protected int damage;
  protected int cost;
  protected String name;

  public Skill(int damage, int cost, String name) {
    this.damage = damage;
    this.cost = cost;
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

  public int getCost() {
    return cost;
  }

  @Override
  public String toString() {
    return "Skill [damage=" + damage + ", cost=" + cost + ", name=" + name + "]";
  }

}
