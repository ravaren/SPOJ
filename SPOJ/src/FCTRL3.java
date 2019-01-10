/*

Zadanie: Silnia
Niech n będzie nieujemną liczbą całkowitą. Liczbę n! (czytaj n-silnia) definiuje się następująco. Jeśli n ≤ 1, to n! = 1. Dla n > 1, n! jest równe iloczynowi wszystkich liczb od 1 do n, czyli n! = 1 * 2 * ... * n. Na przykład 4! = 1*2*3*4 = 24.

Zadanie
Napisz program, który:

    wczyta ze standardowego wejścia nieujemną liczbę całkowitą n,
    policzy cyfrę dziesiatek oraz cyfrę jedności w zapisie dziesiętnym liczby n!,
    wypisze wynik na standardowe wyjście.

Wejście
W pierwszej linii wejścia znajduje się jedna liczba całkowia D (1≤D≤30), oznaczjąca liczbę przypadków do rozważenia. Opis każdego przypadku składa się z jednej linii, w której znajduje się jedna nieujemna liczba całkowita n (0 ≤ n ≤ 1 000 000 000).

Wyjście
Dla każdego przypadku z wejścia. Twój program powinien wypisać w osobnej linii dokładnie dwie cyfry (oddzielone pojedynczą spacją): cyfrę dziesiątek i cyfrę jedności liczby n! zapisanej w systemie dziesiętnym.

Przykład
Dla danych wejściowych:

2
1
4

poprawną odpowiedzią jest:

0 1
2 4


 */
import java.util.Scanner;

public class FCTRL3 {
    
    static int silnia(int n){
        int wynik=n;
        if(n>1){wynik*=silnia(n-1);}
        return wynik;
    }
    
    
    static public void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int D;
        do{
           D = reader.nextInt(); 
        }while (!(D>=1&&D<=30));
        
        int tab[] = new int[D];
        for(int x=0;x<D;x++){
            int n = -1;
            do{
                n = reader.nextInt(); 
            }while (!(n>=1&&n<=1_000_000_000));  
            tab[x] = n;
        }
        
        for(int el: tab){
            if(el==1){System.out.println(0 + " " + 1);}
            else{
                int y = silnia(el);
                System.out.println( (y/10) + " " + (y-((y/10)*10)));
            }    
        }
    }
}
