import java.util.Scanner;

public class newTable {
    public static void TablicaDwuwymiarowaUzytkownik() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość wierszy tablicy.");
        int wiersze = scan.nextInt();

        char [][] tablica = new char[wiersze][];
        for (int i = 0; i < tablica.length; i++) {

            tablica[i] = new char[(2 * i) + 1];
        }
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                tablica[i][j] = '*';
            }
        }
        int przerwa = tablica[tablica.length-1].length - tablica.length;
        for (int i = 0; i < tablica.length; i++) {

            for (int j = przerwa; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < tablica[i].length; j++) {
                System.out.print(tablica[i][j]);
            }
            System.out.println();
            przerwa--;
        }
    }
}
