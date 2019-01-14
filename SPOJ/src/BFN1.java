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
        
        String cyferki = "01234567890";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        
        masterLoop:        
        for(int x=0;x<t;x++){
            String liczba = reader.readLine();
            int n = Integer.parseInt(liczba);
            int licznik=0;
            int wynik;            
            int[] tab = new int[10];
            while(true){
                if(n<10){
                System.out.println(n + " " + licznik);
                continue masterLoop;
                }
                int parzyste = 0;
                int nieparzyste = 0;
                for(int y=0;y<liczba.length();y++){
                    for(int z=0;z<10;z++){
                        if(liczba.substring(y,y+1).equals(cyferki.substring(z,z+1))){tab[z]++;}
                    }
                }
                for(int el: tab){
                    if(el%2==0 && el!=0){parzyste++;}
                    else{nieparzyste++;}
                    el = 0;
                }
                //TUTAJ DOKOŃCZYĆ
                licznik++;
            }
        }
    }
}