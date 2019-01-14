/*
Przykładowo, mając daną liczbę 28, Piotruś stwierdzi, że nie jest ona palindromem
i wykona dodawanie 28 + 82 = 110. 
Liczba 110 wciąż nie jest palindromem, zatem Piotruś wykona jeszcze dodawanie 
110 + 011 = 110 + 11 = 121. Wynik tego dodawania jest już palindromem, więc 
obliczenia zostaną zakończone.

Twoim zadaniem jest napisać program, który dla każdej liczby rozważanej przez 
Piotrusia wypisze palindrom (wynik obliczeń Piotrusia), oraz liczbę dodawań 
prowadzących do wyniku.
Wejście

Pierwsza linia wejścia zawiera liczbę t (t <= 80), określającą ile liczb znajduje
się na kartce Piotrusia. Każda z następnych t linii zawiera dokładnie jedną liczbę 
naturalną n (1 <= n <= 80), dla której Piotruś musi wykonać obliczenia.
Wyjście

Dla kolejnych liczb podanych na kartce wypisz po jednej linijce zawierającej dwie
liczby całkowite oddzielone spacją. Pierwsza oznacza palindrom otrzymany przez 
Piotrusia, druga -- liczbę dodawań wykonanych, by go otrzymać.
Przykład

Wejście:
3
28
68
5

Wyjście:
121 2
1111 3
5 0

*/

import java.io.*;

class BFN1 {
    static public void main(String[] args) throws java.lang.Exception{
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        
        masterLoop:
        for(int x=0;x<t;x++){
            String liczba = reader.readLine();
            int n = Integer.parseInt(liczba);
            int licznik = 0;
            while(true){
                if(n<10){
                System.out.println(n + " " + licznik);
                break;
                }
                String liczbaOdwrotnie = "";
                for(int i = liczba.length() - 1; i >= 0; i--)
                    {
                    liczbaOdwrotnie = liczbaOdwrotnie + liczba.charAt(i);
                }
                if(liczba.equals(liczbaOdwrotnie)){
                    System.out.println(liczba + " " + licznik);
                    break;
                }
                else{
                    n+=Integer.parseInt(liczbaOdwrotnie);
                    liczba = Integer.toString(n);
                    licznik++;
                }
            }
        }
    }
}