import net.alonsecs.utils.Menu;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    final Scanner KEYBOARD = new Scanner(System.in);
    Menu.characterSelector(KEYBOARD);
    System.out.println(Menu.ALIES[0].toString());
    System.out.println(Menu.ALIES[1].toString());
    System.out.println(Menu.ALIES[2].toString());
    System.out.println(Menu.ALIES[3].toString());
    
    /* Diego diego = new Diego();
    System.out.println(diego.toString());
    diego.recibeDamage(15);
    System.out.println(diego.toString());
    
    Pepe pepe = new Pepe();
    System.out.println(pepe.toString());
    pepe.recibeDamage(15);
    System.out.println(pepe.toString()); */
    
    
  }
}
