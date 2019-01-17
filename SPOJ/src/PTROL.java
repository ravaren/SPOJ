/*


Przesuń elementy tablicy cyklicznie w lewo.
Wejście

Najpierw liczba testów t (t ≤ 100). Następnie dla każdego testu liczba n (1 < n ≤ 100) i n liczb.
Wyjście

Dla każdego testu n liczb w zmienionym porządku.
Przykład

Wejście:
2
7 1 2 3 4 5 6 7 
3 2 1 10

Wyjście:
2 3 4 5 6 7 1 
1 10 2


 */
import java.io.*;

public class PTROL {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        
        for(int t=0;t<T;t++){
            String input = reader.readLine();
            int pauza = input.indexOf(" ");
            int N = Integer.parseInt(input.substring(0,pauza));
            input=input.substring(pauza+1);
            int[] tab = new int [N];
            boolean pierwszy = true;
            for(int n=0;n<N-1;n++){                
                if(n==0 && pierwszy){
                    pauza = input.indexOf(" ");
                    tab[N-1]=Integer.parseInt(input.substring(0,pauza));
                    input=input.substring(pauza+1);
                    n=0;
                    pierwszy = false;
                }
                if(n==N-2){
                    tab[n] = Integer.parseInt(input);
                }
                else{
                    pauza = input.indexOf(" ");
                    tab[n] = Integer.parseInt(input.substring(0,pauza));
                    input=input.substring(pauza+1);
                }
            }
            for(int n=0;n<N;n++){
                if(n==N-1){System.out.println(tab[n]);}
                else{System.out.print(tab[n] + " ");}
            }
        }
    }
}
