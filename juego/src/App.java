import net.alonsecs.characters.PlayeableCharacter;
import net.alonsecs.characters.Skill;

public class App {
  public static void main(String[] args) {
    Skill[] skills = new Skill[4];
    for (int i = 0; i < skills.length; i++) {
      skills[i] = new Skill(10,20,"habilidad");
    }
    PlayeableCharacter personaje1 = new PlayeableCharacter(100, 100, "Diego", skills);
    PlayeableCharacter personaje2 = new PlayeableCharacter(100, 100, "Pepa", skills);
    System.out.println(personaje1.toString());
    System.out.println(personaje2.toString());
    personaje2.recibeDamage(personaje1.useSkill(2));
    System.out.println(personaje1.getHp());
    System.out.println(personaje2.getHp());
    System.out.println(personaje1.getPp());
    System.out.println(personaje2.getPp());
  }
}
