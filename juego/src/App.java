import net.alonsecs.characters.allies.Diego;
import net.alonsecs.characters.PlayeableCharacter;
import net.alonsecs.characters.Skill;

public class App {
  public static void main(String[] args) {
    Diego diego = new Diego();
    System.out.println(diego.toString());
    diego.recibeDamage(15);
    System.out.println(diego.toString());
    
    /* Skill[] skills = new Skill[4];
    Skill[] skills2 = new Skill[4];
    skills2[0] = new Skill(10,20,"Puño");
    skills2[1] = new Skill(10,20,"Escupitajo al ojo");
    skills2[2] = new Skill(10,20,"Dedo mojado");
    skills2[3] = new Skill(85,70,"Retorcida de pezon nazi");
    for (int i = 0; i < skills.length; i++) {
      skills[i] = new Skill(10,20,"habilidad");
    }
    PlayeableCharacter personaje1 = new PlayeableCharacter(100, 100, "Diego", skills);
    PlayeableCharacter personaje2 = new PlayeableCharacter(100, 100, "Pepa", skills2);
    System.out.println(personaje1.toString());
    System.out.println(personaje2.toString());
    personaje2.recibeDamage(personaje1.useSkill(2));
    System.out.println(personaje1.toString());
    System.out.println(personaje2.toString()); */
  }
}
