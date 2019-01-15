/*
Odwróć kolejność elementów w tablicy.
Wejście

Najpierw liczba testów t (t ≤ 100). Następnie dla każdego testu liczba n (n ≤ 100) i n liczb oddzielonych spacjami.
Wyjście

Dla każdego testu n liczb w porządku odwrotnym niż na wejściu.
Przykład

Wejście:
2
7 1 2 3 4 5 6 7
3 3 2 11

Wyjście:
7 6 5 4 3 2 1
11 2 3

 */
import java.io.*;

public class PP0502B {
    static public void main(String[] args) throws java.lang.Exception{
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        
        for(int x=0;x<t;x++){
            String input = reader.readLine();
            int end = input.indexOf(" ");
            int licznik = Integer.parseInt(input.substring(0,end));
            input = input.substring(end+1);
            int[] tab = new int[licznik];
            for(int y=1;y<=licznik;y++){
                if(y!=licznik){
                end = input.indexOf(" ");
                tab[licznik-y] = Integer.parseInt(input.substring(0,end));
                input = input.substring(end+1); 
                }
                else{tab[licznik-y]= Integer.parseInt(input);}
            }
            for(int el: tab){
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}
