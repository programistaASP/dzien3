public class Kalkulator {
    public static void main(String[] args) {
    System.out.println(dodaj(21,33,54,3,43,51,5));
    System.out.println(odejmij(21,33,54,3,4));
    }
    public static int dodaj(int...liczba) {
        int suma = 0;
        for (int i = 0; i < liczba.length; i++)
        {
            suma += liczba[i];
        }
        return suma;
    }

    public static int odejmij(int...cyfra) {
        int roznica = 0;
        for (int i = 0; i < cyfra.length; i++)
        {
            roznica -= cyfra[i];
        }
        return roznica;

    }


}
