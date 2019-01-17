/*


Dany jest ciąg xn określony rekurencyjnie:
x0=s,
xn+1=3*xn+1, jeśli xn jest nieparzyste i
xn+1=xn/2, jeśli xn jest parzyste

Napisz program, który oblicza pierwsze takie n, dla którego xn=1.

Wejście

 

W pierwszej linii liczba testów t. W każdym z t kolejnych wierszy jedna liczba całkowita s, 1 <= s <= 10000.
Wyjście

W każdej linii jedna liczba - obliczona wartość n.
Przykład

Wejście:
5
1 
2
8
3
567
Wyjście:
0
1
3
7
61
 */
import java.io.*;

public class PTCLTZ {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        
        for(int t=0; t<T; t++){
            int n = 0;
            int liczba = Integer.parseInt(reader.readLine());
            while(true){
                if(liczba==1){System.out.println(n);break;}
                else{
                    if(liczba%2==0){
                        liczba/=2;
                    }
                    else{
                        liczba = ((3*liczba) +1);
                    }
                    n++;
                }
            }
        }
    }
}
