/*
Dana jest lista punktów na płaszczyżnie. Posortuj je względem odległości od 
środka układu współrzędnych w metryce euklidesowej.
Wejście

W pierwszej linii liczba testów t (t < 100). Dla każdego testu najpierw 
n (1 ≤ n ≤ 1000) - liczba punktów i w kolejnych n liniach opis każdego punktu w 
formacie:
nazwa x y
gdzie nazwa jest unikalnym dla każdego testu ciągiem co najwyżej 10 liter alfabetu 
łacińskiego, a x i y są współrzędnymi punktu. Obie współrzędne są całkowite oraz 
-1000 ≤ x, y ≤ 1000. Kolejne testy oddzielone są jednym pustym wierszem. Żadne 2 
punkty nie leżą w tej samej odległości od środka układu współrzędnych.
Wyjście

Dla każdego przypadku testowego w kolejnych n liniach posortowane punkty. 
Po każdym przypadku testowym jedna linia odstępu.
Przykład

Wejście:
2
3
A 0 0
C 5 5
B 1 -1

1 
X 1 1

Wyjście:
A 0 0
B 1 -1
C 5 5

X 1 1


 */
import java.io.*;

public class PP0506A {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine()); //ILOSC TESTOW
        for(int x=0;x<t;x++){
            int n = Integer.parseInt(reader.readLine()); //ILOSC PUNKTOW
            String[][] punkty = new String [n][3];
            int[][] odleglosci = new int[n][2];
            for(int y=0;y<n;y++){       //DLA KAZDEGO PUNKTU
                String input = reader.readLine();
                odleglosci[y][0]=y;
                for(int z=0;z<3;z++){   //WCZYTANIE CZESCI SKLADOWYCH PUNKTU  "NAZWA - X - Y"
                    int pauza = input.indexOf(" ");
                    if(z<2){
                        punkty[y][z] = input.substring(0, pauza);
                        input = input.substring(pauza+1);
                    }
                    else{
                        punkty[y][z] = input.substring(0);
                    }
                }
                //DOPISYWANIE WARTOSCI ODLEGLOSCI W DODATKOWA TABLICE
                double a = Math.abs(Double.parseDouble(punkty[y][1]));
                double b = Math.abs(Double.parseDouble(punkty[y][2]));
                double wynik = Math.sqrt((a*a) + (b*b));
                Double odleglosc = new Double(wynik);
                odleglosci[y][1] = odleglosc.intValue();                              
            }
            for(int y=0;y<n-1;y++){ //SORTOWANIE DODATKOWEJ TABLICY
                if(odleglosci[y][1]>odleglosci[y+1][1]&&y!=n-1){
                    odleglosci[y][1]+=odleglosci[y+1][1];
                    odleglosci[y+1][1]=odleglosci[y][1]-odleglosci[y+1][1];
                    odleglosci[y][1]-=odleglosci[y+1][1];
                    
                    odleglosci[y][0]+=odleglosci[y+1][0];
                    odleglosci[y+1][0]=odleglosci[y][0]-odleglosci[y+1][0];
                    odleglosci[y][0]-=odleglosci[y+1][0];
                    y=-1;
                }
            }
            for(int y=0;y<n;y++){ //WYPISYWANIE POSORTOWANYCH PUNKTOW
                System.out.println(punkty[odleglosci[y][0]][0] + " " + punkty[odleglosci[y][0]][1] + " " + punkty[odleglosci[y][0]][2]);
            }
            if(x!=t-1){System.out.println(reader.readLine());} //POŻERANIE JEDNEJ LINII WEJŚCIA NA KONIEC TESTU
        }
    }
}
