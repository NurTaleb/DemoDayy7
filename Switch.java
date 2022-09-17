import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vad vill du göra?");
        System.out.println("1. Gå till höger");
        System.out.println("2. Gå till vänster");
        System.out.println("3. Gå rakt fram");

        int choise = scanner.nextInt();

        switch (choise) {
            case 1:
                System.out.println("Rätt! Fortsätt");
                break;
            case 2:
                System.out.println("Fel väg, GAME OVER!");
                break;
            case 3:
                System.out.println("Du klickade på 3");
                break;
            default:
                System.out.println("Inget godkänt val!");
        }
        System.out.println("Efter switch");
    }
}
