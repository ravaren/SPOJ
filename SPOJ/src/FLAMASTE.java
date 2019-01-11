/*
Flamaster
Kasia niedawno poznała wszystkie literki w szkole. Z wielką pasją potrafiła całe dnie spędzać na pisaniu 
długich słów swoim ulubionym flamastrem. Pisała i pisała "tasiemce" tak długo, aż flamaster wypisał się. 
Kasia posmutniała. Z trudem, ale udało jej się uprosić swoją mamę, aby kupiła jej nowy pisak. Musiała jednak 
obiecać, że tym razem będzie bardziej oszczędna przy jego używaniu żeby wystarczył na dłużej. 
Kasia zaczęła zastanawiać się w jaki sposób będzie mogła zrealizować obietnicę daną mamie.

Postanowiła, że aby zaoszczędzić wkład flamastra będzie wypisywała skróconą wersję wymyślanych wyrazów. 
Jeśli miała zamiar napisać więcej niż dwie takie same literki obok siebie w wyrazie, to teraz napisze literkę 
a następnie liczbę, określającą ilość wystąpień tej literki.
Zadanie
Twoim zadaniem jest dla zadanego wyrazu, który wymyśliła Kasia, podanie skróconej wersji tego wyrazu.
Wejście
W pierwszej linijce wejścia znajduje się liczba naturalna C, 1 ≤ C ≤ 50, oznaczająca ilość zestawów danych. 
W kolejnych C wierszach wejścia znajdują się zestawy danych. Każdy zestaw składa się z niepustego wyrazu złożonego 
z samych dużych liter alfabetu amerykańskiego. Długość wyrazu nie przekracza 200 znaków.
Wyjście
Dla każdego zestawu danych, dla zadanego wyrazu, na wyjściu powinna znaleźć się jego skrócona wersja.
Przykład
Dla danych wejściowych:

4
OPSS
ABCDEF
ABBCCCDDDDEEEEEFGGHIIJKKKL
AAAAAAAAAABBBBBBBBBBBBBBBB

prawidłowym rozwiązaniem jest:

OPSS
ABCDEF
ABBC3D4E5FGGHIIJK3L
A10B16
*/
import java.io.*;

class FLAMASTE{
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(reader.readLine());
        for(int x=0;x<C;x++){
            String text = reader.readLine();
            int licznik = 0;
            String literka = "";
            int y=0;
            do{
                if(literka.equals(text.substring(y,y+1))){
                    licznik++;
                }
                else{
                    if(licznik==1){
                        System.out.print(literka);
                        literka=text.substring(y,y+1);
                    }
                    if(licznik==2){
                        System.out.print(literka+literka);
                        literka=text.substring(y,y+1);
                    }
                    if(licznik>2){
                        System.out.print(literka+licznik);
                        literka=text.substring(y,y+1);
                    }
                    licznik=0;
                }
                
            y++;           
            }while(y<text.length());
            
            /*
            for(int y=0;y<text.length();y++){
                
                if(licznik==0){
                    literka=text.substring(y,y+1);
                    licznik=1;
                    System.out.print(literka);
                    continue;
                }
             
                if(licznik==1){
                    if(literka.equals(text.substring(y,y+1))){
                        licznik=2;
                        if(y==text.length()-1){
                            System.out.println(literka);
                            break;
                        }
                        if(!((y+2)==text.length())){continue;}
                    }
                    else{
                        licznik=1;
                        literka=text.substring(y,y+1);
                        System.out.print(literka);
                        //continue;
                    }
                }
                if(licznik==2){
                    if(literka.equals(text.substring(y,y+1))){
                        
                        if(y==text.length()-1){
                            System.out.println(licznik+1);
                            break;
                        }
                        
                        licznik=3;
                        continue;
                    }
                    else{
                        licznik=1;
                        System.out.print(literka);
                        literka=text.substring(y,y+1);
                        System.out.print(literka);
                        //continue;
                    }
                }
                if(licznik>2){
                    if(literka.equals(text.substring(y,y+1))){
                        if(y==text.length()-1){
                            System.out.println(licznik);
                            break;
                        }
                        licznik++;
                        //continue;
                    }
                    else{
                        System.out.print(licznik-1);
                        licznik=1;
                        literka=text.substring(y,y+1);
                        System.out.print(literka);
                        //continue;
                    }
                }
                if(y==text.length()-1){
                        System.out.println();
                }
            }
            */
        }
    }
}