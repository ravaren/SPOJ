/*
Dla liczb całkowitych n i k, 0 <= k <= n <= 1000, wyznacz liczbę różnych k-elementowych podzbiorów zbioru n-elementowego. Liczby n i k będą dobrane tak, aby wynik nie przekroczył 1 000 000 000.
Input

T [ liczba testów, T <= 10000 ]
n_1 k_1
n_2 k_2
...
n_T k_T
Output

wynik_1
wynik_2
...
wynik_T
Przykład

Input:
3
0 0
7 3
1000 2

Output:
1
35
499500
 */
import java.io.*;

public class BINOMS {
    
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        for(int t=0;t<T;t++){
            String input = reader.readLine();
            int pauza = input.indexOf(" ");
            long n = Long.parseLong(input.substring(0,pauza));
            long k = Long.parseLong(input.substring(pauza+1));
            long silniaN =1;
            long silniaK =1;
            long silniaNminusK=1;
            if(n==0) {
                silniaN=1;
            }
            else{
                for (int j=1; j<=n;j++){
                    silniaN = silniaN * j;
                }
            }
            if(k==0) {
                silniaK=1;
            } 
            else{
                for (int l=1; l<=k;l++){
                    silniaK = silniaK * l;
                }
            }
            if ((n==0) && (k == 0)) { 
                silniaNminusK=1;
            } 
            else{
                for (int h=1; h<=n-k;h++){
                    silniaNminusK = silniaNminusK * h;
                }
            }
            long wynik = silniaN/(silniaK*silniaNminusK);
            System.out.format("%d%n", wynik);
            /*
            if(k>=0&&n>=k){
                if(k+k>n){k=n-k+1;}
                double dzielna=1; 
                double dzielnik=1;
                if(n==k){System.out.println(1);}
                else{
                    for(double x = 1;x<=k;x++){
                        dzielna*=n;
                        dzielnik*=x;
                        n--;
                    }
                    double wynik = dzielna/dzielnik;
                    //System.out.printf("% 4d",wynik);
                    System.out.format("%.0f%n", wynik);
                }
            }
            
            else{System.out.println(0);}
            */
        }
    }
}
