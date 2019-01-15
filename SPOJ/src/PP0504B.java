/*
Napisz funkcję:

char* string_merge(char *, char *);

która sklei ze sobą dwa łańcuchy biorąc na przemian po jednym znaku z każdego 
łańcucha i umieści w nowej dynamicznie alokowanej tablicy znaków, do której 
zwróci wskaźnik. Należy wziąć po tyle znaków ile jest w krótszym łańcuchu.

Input

W pierwszej linii liczba testów t, w kolejnych liniach po dwa łańcuchy znaków 
odzielone spacją.
Output

W każdej linii jeden łańcuch, wynik działania funkcji string_merge.
Example

Input:
4
a bb
abs sfd
ewr w
wqeqweqweq eqweqwe
Output:
ab
asbfsd
ew
weqqewqewqewqe


 */
import java.io.*;

public class PP0504B {
   static String stringMerge(String txt1, String txt2){
       String wynik = "";
       int licznik1 = 0;
       int licznik2 = 0;
       int end = 0;
       if(txt1.length()>txt2.length()){end = txt2.length();}
       else{end = txt1.length();}
       
       for(int x=0;x<end;x++){
           wynik+=txt1.substring(x,x+1);
           wynik+=txt2.substring(x,x+1);
       }
       return wynik;
   }
   
   public static void main(String [] args) throws java.lang.Exception{
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int t = Integer.parseInt(reader.readLine());
       
       for(int x=0;x<t;x++){
           String input = reader.readLine();
           int pauza = input.indexOf(" ");
           
           String txt1 = input.substring(0,pauza);
           String txt2 = input.substring(pauza+1);
           
           System.out.println(stringMerge(txt1, txt2));
       }
   }
}
