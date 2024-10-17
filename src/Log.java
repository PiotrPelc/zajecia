import java.util.Scanner;

public class Log {
    public static void login() {
        Scanner scanner = new Scanner(System.in);

        String poprawnyLogin = "użytkownik";
        String poprawneHaslo = "haslo123";

        System.out.print("Podaj login: ");
        String login = scanner.nextLine();

        System.out.print("Podaj hasło: ");
        String haslo = scanner.nextLine();

        if (login.equals(poprawnyLogin) && haslo.equals(poprawneHaslo)) {
            System.out.println("Logowanie udane!");
        } else {
            System.out.println("Niepoprawny login lub hasło.");
        }

        scanner.close();
    }
}
