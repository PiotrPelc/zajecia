import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Rejestracja {
    public void rejestracja() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swoje imię: ");
        String imie = scanner.nextLine();

        System.out.print("Podaj swoje nazwisko: ");
        String nazwisko = scanner.nextLine();

        System.out.print("Podaj swój adres e-mail: ");
        String email = scanner.nextLine();

        String dane = "Imię: " + imie + "\nNazwisko: " + nazwisko + "\nE-mail: " + email;

        // Zapisz dane do pliku
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("rejestracja.txt", true))) {
            writer.write(dane);
            writer.newLine();
            System.out.println("Dane zostały zapisane do pliku rejestracja.txt.");
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas zapisywania do pliku: " + e.getMessage());
        }

        scanner.close();
    }
}
