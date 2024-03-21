package net.alonsecs.characters.allies;

import net.alonsecs.characters.PlayeableCharacter;
import net.alonsecs.characters.Skill;

public class Diego extends PlayeableCharacter {
  private Skill[] personalSkills = new Skill[4];
  
  public Diego() {
    super(100, 100, "Diego");
    this.personalSkills[0] = new Skill(10, 20, "Puñaladita de colegas");
    this.personalSkills[1] = new Skill(10, 20, "Puñaladita de colegas");
    this.personalSkills[2] = new Skill(10, 20, "Puñaladita de colegas");
    this.personalSkills[3] = new Skill(10, 20, "Puñaladita de colegas");
    setSkills(personalSkills);
  }
  
}
