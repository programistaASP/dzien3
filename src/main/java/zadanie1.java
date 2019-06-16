import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        int liczbaWierszy = wczytajLiczbeWierszy();
        char choinkaPusta[][] = deklaracjaChoinki(liczbaWierszy);
        char choinkaWypelniona[][] = wypelnienieGwiazdkami(choinkaPusta);
        char calaChoinka[][] = wypiszCalaChoinke(choinkaWypelniona);
        wypiszCalaChoinke(wypelnienieGwiazdkami(deklaracjaChoinki(wczytajLiczbeWierszy())));
    }

    public static int wczytajLiczbeWierszy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę wierszy:");
        int liczbaWierszy = scanner.nextInt();
        return liczbaWierszy;
    }

    public static char[][] deklaracjaChoinki(int liczbaWierszy) {
        char[][] choinkaPusta = new char[liczbaWierszy][];
        return choinkaPusta;
    }

    public static char[][] wypelnienieGwiazdkami(char[][] choinkaPusta) {
        char[][] choinkaWypelniona = choinkaPusta;
        for (int i = 0; i < choinkaPusta.length; i++) {
            choinkaPusta[i] = new char[2 * i + 1];
            for (int j = 0; j < choinkaWypelniona[i].length; j++) // tablica2D[i].lenght - ilość kolumn dla konkretnego wiersza [i]
            {
                choinkaWypelniona[i][j] = '*';
            }
        }
        return choinkaWypelniona;
    }

    public static char[][] wypiszCalaChoinke(char[][] choinkaWypelniona) {
        char[][] calaChoinka = choinkaWypelniona;
        for (int i = 0; i < calaChoinka.length; i++) {
            for (int j = 0; j < (calaChoinka.length - 1) - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < calaChoinka[i].length; j++) // tablica2D[i].lenght - ilość kolumn dla konkretnego wiersza [i]
            {
                System.out.print(calaChoinka[i][j]);
            }
            System.out.println();
        }
        return calaChoinka;
    }
}

