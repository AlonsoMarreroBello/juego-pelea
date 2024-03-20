import net.alonsecs.characters.PlayeableCharacter;
import net.alonsecs.characters.Skill;

public class App {
  public static void main(String[] args) {
    Skill[] skills = new Skill[4];
    for (int i = 0; i < skills.length; i++) {
      skills[i] = new Skill(10, "habilidad");
    }
    PlayeableCharacter personaje1 = new PlayeableCharacter(100, 100, "diego", skills);
    personaje1.useSkill(2);
  }
}
