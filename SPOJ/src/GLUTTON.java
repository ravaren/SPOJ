/*
Zadanie

Mając daną liczbę obżartuchów zaproszonych na Zlot oraz czas jedzenia pojedynczego 
ciastka (podany w sekundach) przez każdego z nich Twój program powinien policzyć 
ile należy kupić pudełek z ciastkami.
Specyfikacja wejścia

W pierwszej linii wejścia znajduje się jedna dodatnia liczba całkowita, oznaczająca 
liczbę zestawów testowych, które dalej pojawią się na wejściu. Każdy zestaw ma 
następującą postać. W pierwszej linii znajdują się dwie liczby całkowite N i M 
oddzielone pojedynczą spacją (1 ≤ N ≤ 10.000, 1 ≤ M ≤ 1.000.000.000). Oznaczają 
one odpowiednio liczbę zaproszonych obżartuchów na Zlot oraz liczbę ciastek w 
jednym pudełku. Kolejne N wierszy zestawu zawiera po jednej liczbie całkowitej 
dodatniej niewiększej niż 100.000. Są to czasy (w sekundach) jedzenia pojedynczego 
ciastka przez kolejnych obżartuchów.
Specyfikacja wyjścia

Dla każdego zestawu danych pojawiającego się na wejściu należy wypisać dokładnie 
jedną liczbę całkowitą (każdą w osobnej linii), oznaczającą liczbę pudełek z ciastkami, 
jaką organizatorzy muszą kupić na Zlot.
Przykład
Wejście

2
2 10
3600
1800
3 356
123
32999
10101

Wyjście

8
2
 */
import java.io.*;

public class GLUTTON {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        int doba = 86400;
        for(int x=0;x<t;x++){
            String input = reader.readLine();
            int pauza = input.indexOf(" ");
            int N = Integer.parseInt(input.substring(0,pauza));
            int M = Integer.parseInt(input.substring(pauza+1));
            int ciastka =0;
            for(int y=0;y<N;y++){
                ciastka +=doba/Integer.parseInt(reader.readLine());
            }
            int pudelka = ciastka/M;
            if(pudelka*M<ciastka){System.out.println(pudelka+1);}
            else{System.out.println(pudelka);}
        }
    }
}
