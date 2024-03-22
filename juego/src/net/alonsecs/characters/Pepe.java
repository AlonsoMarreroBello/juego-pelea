package net.alonsecs.characters;

import net.alonsecs.abilities.Skill;

public class Pepe extends PlayeableCharacter {
  private Skill[] personalSkills = new Skill[4];
  
  public Pepe() {
    super(100, 100, "Pepe");
    this.personalSkills[0] = new Skill(10,20,"golpe de pectoteta");
    this.personalSkills[1] = new Skill(10,20,"Escupitajo al ojo");
    this.personalSkills[2] = new Skill(10,20,"Dedo mojado");
    this.personalSkills[3] = new Skill(85,70,"Retorcida de pezon nazi");
    setSkills(personalSkills);
  }
}
