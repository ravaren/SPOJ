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
    static int charToInt(char szukana){
		int wynik = 0;
		char[] cyfry = {0,1,2,3,4,5,6,7,8,9};
		for(int x=0;x<10;x++){
			if(szukana==cyfry[x]){
				wynik = x;
				break;
			}
		}
		
		return wynik;	
	}
	
static String mnozenie(String a, String b){
	String wynik = "";
	int suma=0;
	char[]tabA = new char[a.length()];
	char[]tabB = new char[b.length()];
		
	for(int x=0;x<a.length();x++){
		tabA[x] = a.charAt(x);
	}
	for(int x=0;x<b.length();x++){
		tabB[x] = b.charAt(x);
	}
		
	for(int x=0;x<a.length();x++){
		for(int y=0;y<a.length();y++){
			suma+=(charToInt(tabA[x])*charToInt(tabB[y]))*Math.pow(10,x);
				
		}
	}
		
        return wynik;
    }
    static String silniaZnakowa(String n){
        String wynik ="";
        if(n.equals("0")||n.equals("1")){return "1";}
        else{return wynik;}
    }
    
    static long silniaLiczbowa(long x){
        if(x>1){return x*silniaLiczbowa(x-1);}
        else{return 1L;}
    }
    
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        for(int t=0;t<T;t++){
            String input = reader.readLine();
            int pauza = input.indexOf(" ");
            String n = input.substring(0,pauza);
            String k = input.substring(pauza+1);
            
            //System.out.println(silnia(n)/(silnia(k)*silnia(n-k)));
            //System.out.println(silnia(n) + " " + silnia(k));
        }
    }
}
