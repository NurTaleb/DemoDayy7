import java.util.Scanner;

public class Choises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vad vill du göra?");
        System.out.println("1. Gå till höger");
        System.out.println("2. Gå till vänster");
        System.out.println("3. Gå rakt fram");

        int choise = scanner.nextInt();

        if (choise == 1) {
            System.out.println("Rätt! Fortsätt");
        } else if (choise == 2) {
            System.out.println("Fel väg, GAME OVER!");
        } else if(choise == 3) {
            System.out.println("Fel väg hörru, prova igen GAME OVER");
        } else {
            System.out.println("Det är inte ett godkänt val.");
        }

        System.out.println("Spelet är slut.");

    }
}
