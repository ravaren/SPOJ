/*
Napisz funkcję:

 int nwd(int a, int b);

która oblicza największy wspólny dzielnik liczb a i b,

 0 <= a,b <= 1000000

Input

 

W pierwszej linii liczba testów t, w kolejnych liniach po dwie liczby w każdym wierszu.
Output

W każdej linii jedna liczba - wynik działania funkcji nwd
Example

Input:
5
1 4
4 1
12 48
48 100
123456 653421

Output:
1
1
12
4
3

*/
import java.io.*;

public class PP0501A {
    static int nwd(int a, int b){
        int c;
        if(b>a){
            a=a+b;
            b=a-b;
            a=a-b;
        }
        while(b!=0){
            c=a%b;
            a=b;
            b=c;    
        }        
        return a;
    }
    
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        
        for(int x=0;x<t;x++){
            String input = reader.readLine();
            int pauza = input.indexOf(" ");
            int a = Integer.parseInt(input.substring(0, pauza));
            int b = Integer.parseInt(input.substring(pauza+1));
            
            System.out.println(nwd(a,b));
        }
    }
}
