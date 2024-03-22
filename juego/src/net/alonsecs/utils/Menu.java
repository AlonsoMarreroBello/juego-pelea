package net.alonsecs.utils;

import java.util.Scanner;

import net.alonsecs.characters.*;
import net.alonsecs.characters.PlayeableCharacter;

public class Menu {
  public final static PlayeableCharacter[] ALIES = new PlayeableCharacter[4];
  public final static String PC = """
    1 - Diego
    2 - Pepe
  """;

  public static void characterSelector(Scanner scanner) {
    int counter = 0;
    while (counter<4) {
      System.out.println(PC);
      int election = scanner.nextInt();
      scanner.nextLine();
      switch (election) {
        case 1:
          System.out.println("¿Está seguro de que quiere elegir al veneco?");
          if (scanner.nextLine().equalsIgnoreCase("y")) {
            ALIES[counter] = new Diego();
            counter++;
          }
          break;
        case 2:
          System.out.println("¿Está seguro de que quiere elegir al Sr.Pectoteta?");
          if (scanner.nextLine().equalsIgnoreCase("y")) {
            ALIES[counter] = new Pepe();
            counter++;
          }
          break;
        case 3:

          break;
        case 4:

          break;
        case 5:

          break;
        case 6:

          break;
        case 7:

          break;
      
        default:
          break;
      }
    }
  }
}
