public class tablica2d {
    public static void main(String[] args) {
        int [][] tablica2d = new int [6][10];
        for (int i=0; i<6; i++) {
            System.out.println();
            for (int j=0;j<10;j++) {
                tablica2d[i][j] = i*j;
                System.out.print(tablica2d[i][j]+ " ");
            }
        }
        int iloscWierszy = 16, iloscKolumn = 10;
        int[][] tablica2D = new int[iloscWierszy][iloscKolumn];
        for(int i=0; i<tablica2D.length; i++) {
            for (int j = 0; i<tablica2D[i].length; j++) {
                tablica2D[i][j] = i*j;
            }
        }
    }
}
