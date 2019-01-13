/*Wejście
Dane podawane są na standardowe wejście. W pierwszym wierszu podana jest liczba N (1<=N<=20) zestawów danych. 
Dalej podawane są zestawy danych zgodnie z poniższym opisem:

Jeden zestaw danych
W pierwszym i jedynym wierszu zestawu danych znajdują się dwie liczby całkowite a i b (10<=a,b<=30), 
oddzielone pojedynczą spacją, oznaczające odpowiednio liczbę przedszkolaków w grupach, z których jedna 
zostanie przydzielona pani Agnieszce.

Wyjście
Wyniki programu powinny być wypisywane na standardowe wyjście. W kolejnych wierszach należy podać odpowiedzi 
obliczone dla kolejnych zestawów danych. Wynikiem dla jednego zestawu jest liczba cukierków, jaką powinna 
zakupić przedszkolanka.


Przykład

dane wejściowe:
2
12 15
11 22

wynik:
60
22
*/
import java.io.*;

public class PRZEDSZK {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        for(int x=0;x<N;x++){
            String input = reader.readLine();
            int pauza = input.indexOf(" ");
            int a = Integer.parseInt(input.substring(0, pauza));
            int b = Integer.parseInt(input.substring(pauza+1));
            
            if(b>a){
                b=b+a;
                a=b-a;
                b=b-a;
            }
            
            int wynik = a;
            while(true){
                if(wynik%b==0){
                    break;                    
                }
                else{wynik+=a;}
            }
            System.out.println(wynik);          
        }
    }
}
