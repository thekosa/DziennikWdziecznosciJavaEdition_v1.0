package pl.kosieradzki.dw;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Diary {
    private static final Entry entry = new Entry();

    private static byte getBoundry() {
        System.out.println("Dla jakiego celu chcesz wprowadzić notkę (p-podstawowy, w-wyjazdowy): ");
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.nextLine();
        if (letter.equals("p")) {
            return 3;
        } else if (letter.equals("w")) {
            return 1;
        } else {
            System.out.println("Chyba żeśmy się nie zrozumieli! Spadówa, mam robotę! ");
            throw new IllegalArgumentException();
        }
    }

    private static void save() throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter("DziennikWdziecznosci.txt", true));
        printWriter.println(entry.getEntry());
        printWriter.close();
    }

    public static void main(String[] args) throws IOException {
        byte boundry = getBoundry();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= boundry; i++) {
            System.out.println("Podaj " + i + ". notkę: ");
            entry.addThankfulness(scanner.nextLine());
        }
        save();
        System.out.println("Dziękuję za uwagę!");
    }
}
