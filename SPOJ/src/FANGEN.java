/*


Wiatraczek (lewo- lub prawoskrętny) rzędu n >= 1 jest macierzą znaków o rozmiarze 2n x 2n. Każdy element wiatraczka jest albo kropką ('.'), albo gwiazdką ('*'). Wiatraczki definiujemy rekurencyjnie:

    Wszystkie (cztery) elementy wiatraczka rzędu 1 są gwiazdkami, niezależnie od jego skrętności:

    **
    **

    Dla n ≥ 1, wiatraczek rzędu n + 1 konstruujemy następująco (przykłady ilustrują kolejne kroki konstruowania lewo- i prawoskrętnego wiatraczka o rozmiarze 2, '?' - znak do ustalenia):

        W macierz wklejamy wycentrowany w pionie i w poziomie wiatraczek rzędu n o tej samej skrętności:

        ????    ????
        ?**?    ?**?
        ?**?    ?**?
        ????    ????

        We wszystkie narożniki nowego wiatraczka wstawiamy gwiazdki:

        *??*    *??*
        ?**?    ?**?
        ?**?    ?**?
        *??*    *??*

        Odwiedzamy kolejno wszystkie nie ustalone jeszcze znaki (jest ich dokładnie 8n), startując z dowolnego narożnika i poruszając się wzdłuż brzegu macierzy. Jeśli konstruujemy wiatraczek prawoskrętny, poruszamy się zgodnie z ruchem wskazówek zegara; jeśli lewoskrętny - przeciwnie. Wzdłuż każdej mijanej krawędzi stawiamy n kolejnych gwiazdek, a następnie n kolejnych kropek:

        *.**    **.*
        ***.    .***
        .***    ***.
        **.*    *.**

Twój program powinien wcztywać kolejne liczby całkowite. Dla każdej wczytanej liczby r:

    jeśli r > 0, generujemy wiatraczek lewoskrętny rzędu r, a następnie pusty wiersz,
    jeśli r < 0, generujemy wiatraczek prawoskrętny rzędu -r, a następnie pusty wiersz,
    r = 0 oznacza koniec wejścia, program powinien się zakończyć (wczytanego zera nie przetwarzamy).

Wejście

r1 [ -200 ≤ r1 ≤ 200, r1 <> 0; pierwsza liczba do przetworzenia ]
...
ri [ jw.; i-ta liczba do przetworzenia ]
0

[ można założyć, że przynajmniej pierwsza wartość będzie niezerowa, tj. że i ≥ 1 ]
Wyjście

[ wiatraczek wygenerowany dla r1 - dokładnie 2|r1| wierszy tekstu, w każdym wierszu dokładnie 2|r1| znaków (nie licząc '\n') ]
[ pusty wiersz ]
...
[ wiatraczek wygenerowany dla ri ]
[ pusty wiersz ]
Przykład

Wejście:
3
-4
0

Wyjście:
*..***
**.**.
****..
..****
.**.**
***..*

****...*
.***..**
..**.***
...*****
*****...
***.**..
**..***.
*...****


 */
import java.io.*;

public class FANGEN {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(reader.readLine());
        while(r!=0){
            int n = 2*Math.abs(r);
            char[][] fan = new char[n][n];
            //WYPEŁNIANIE * i ?
            for(int x=0;x<n;x++){
                for(int y=0;y<n;y++){
                    if( (x==r-1||x==r)&&(y==r-1||y==r) ){fan[x][y] = '*';}
                    else{
                        if( (x==n-1||x==0)&&(y==n-1||y==0) ){fan[x][y] = '*';}
                        else{fan[x][y] = '?';}
                    }
                }
            }
            
            for(int R=Math.abs(r);R>1;R--){
                
            }
            
            /*
            //WYPEŁNIANIE . i * PRAWOSKRĘT
            boolean gwiazdkaKropka = true;
            for(int R=0;R<r;R++){
                int licznik = 0;
                //POZIOMA GÓRNA
                int x = R;
                for(int Y=R;Y<n-R;Y++){
                    if(fan[x][Y]=='?' && gwiazdkaKropka){
                        fan[x][Y]='*';
                        if(licznik==r){
                            gwiazdkaKropka = !gwiazdkaKropka;
                            licznik=0;
                        }
                        else{licznik++;}
                    }
                    else{
                        if(fan[x][Y]=='?' && !gwiazdkaKropka){
                        fan[x][Y]='.';
                        if(licznik==r){
                            gwiazdkaKropka = !gwiazdkaKropka;
                            licznik=0;
                        }
                        else{licznik++;}
                        }
                    }
                }
                //PIONOWA PRAWA
                int y = R+1;
                for(int X=R;X<n-R;X++){
                    if(fan[X][y]=='?' && gwiazdkaKropka){
                        fan[X][y]='*';
                        if(licznik==r){
                            gwiazdkaKropka = !gwiazdkaKropka;
                            licznik=0;
                        }
                        else{licznik++;}
                    }
                    else{
                        if(fan[X][y]=='?' && !gwiazdkaKropka){
                        fan[X][y]='.';
                        if(licznik==r){
                            gwiazdkaKropka = !gwiazdkaKropka;
                            licznik=0;
                        }
                        else{licznik++;}
                        }
                    }
                }
            }
            */
            //RYSOWANIE
            for(int x=0;x<n;x++){
                for(int y=0;y<n;y++){
                    System.out.print(fan[x][y]);
                    if(y==n-1){System.out.println();}
                }
            }
            System.out.println();
            r = Integer.parseInt(reader.readLine());
        }
    }
}
