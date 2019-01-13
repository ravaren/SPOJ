/*
Twoim zadaniem jest dodać wszystkie liczby całkowite podane na wejściu.
Wejście

W pierwszym wierszu znajduje się liczba t testów (0 < t < 100) Każdy test 
opisany jest w następujący sposób. W pierwszym wierszu dana jest 
liczba n - liczba liczb do zsumowania. Następnie podanych jest n liczb 
pooddzielanych spacją.
Przykład

Input:
2
5
1 2 3 4 5
2
-100 100

Output:
15
0
*/

import java.io.*;

public class RNO_DOD {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        for(int x=0;x<t;x++){
            int n = Integer.parseInt(reader.readLine());
            int suma = 0;
            String input = reader.readLine();
            for(int y=0;y<n;y++){
            
                
                int end = input.substring(0).indexOf(" ");
                if(y==n-1){
                    suma += Integer.parseInt(input.substring(0));
                }
                else{
                    suma += Integer.parseInt(input.substring(0,end));
                    input = input.substring(end+1);
                }
            }
            System.out.println(suma);
        }
    }
}