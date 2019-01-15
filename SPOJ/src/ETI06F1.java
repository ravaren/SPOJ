/*


Wyznacz pole koła, którego okrąg jest przecięciem dwóch identycznych sfer o promieniu r. 
Odległość pomiędzy środkami sfer wynosi d. Wartości r oraz d podane na wejściu są 
liczbami zmiennoprzecinkowymi. Można założyć, że 1 <= d < 2 * r <= 2000.

Ilustracja pomocnicza treści
Wejście

Na wejściu podane są dwie liczby zmiennoprzecinkowe r d oddzielone spacją, 
oznaczające odpowiednio promień sfery i odległość między środkami sfer.
Wyjście

Należy wypisać pojedynczą liczbę zmiennoprzecinkową S oznaczającą pole koła. 
Dopuszczalny błąd wyniku wynosi 0.01.

Uwaga. W roli separatora dziesiętnego należy używać kropki (nie: przecinka). 
Można przyjąć, że stosunek obwodu koła do jego średnicy wynosi 3.141592654.

Liczba punktów za zadanie jest równa liczbie poprawnie rozwiązanych testów / 5. 
Testów jest 20.
Przykład

Przykład 1

Wejście:
10 10

Wyjście:
235.62

Przykład 2

Wejście:
1000 1500

Wyjście:
1374446.79


P=(r^{2}-\frac{d^{2}}{4})\pi
 */
import java.io.*;
import java.util.Locale;

public class ETI06F1 {
    static public void main(String[] args) throws java.lang.Exception{
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int end = input.indexOf(" ");
        double r = Float.parseFloat(input.substring(0,end));
        double d = Float.parseFloat(input.substring(end+1));    
        final double pi = 3.141592654D;
        
        double S =( (r*r) - ((d*d)/4) )* pi;
        System.out.format(Locale.ENGLISH,"%.2f%n", S);
    }
}
