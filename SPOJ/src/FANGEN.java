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
            boolean prawoskret;
            if(r<0){prawoskret=false;}
            else{prawoskret=true;}
            r = Math.abs(r);
            int n = 2*r;
            char[][] fan = new char[n][n];
            //WYPEŁNIANIE * i ?
            for(int x=0;x<n;x++){
                for(int y=0;y<n;y++){
                    if(y==x){fan[x][y]='*';}
                    else{
                        if(x+y==n-1){fan[x][y]='*';}
                        else{fan[x][y]='?';}
                    }
                }
            }
            
            //PETLA DLA KAZDEGO "OKREGU"
            if(prawoskret){ //DLA LEWOSKRETU (r>0)
                for(int R=1;R<r;R++){
                    //ustalenie licznika dla znakow . *
                    int licznik = 0; 
                    boolean gwiazdka = true;
                    
                    //LEWO
                    for(int x=n-R-1;x>=R;x--){
                        if(gwiazdka){
                            fan[x][n-R]='*';
                            licznik++;
                        }
                        else{
                            fan[x][n-R]='.';
                            licznik++;
                        }
                        if(licznik==r-R){
                            gwiazdka=!gwiazdka;
                            licznik=0;
                        }                        
                    }
                    //DOL
                
                    for(int y=n-R-1;y>=R;y--){
                        if(gwiazdka){
                            fan[R-1][y]='*';
                            licznik++;
                        }
                        else{
                            fan[R-1][y]='.';
                            licznik++;
                        }
                        if(licznik==r-R){
                            gwiazdka=!gwiazdka;
                            licznik=0;
                        }                       
                    }
                     //PRAWO               
                    for(int x=R;x<n-R;x++){
                        if(gwiazdka){
                            fan[x][R-1]='*';
                            licznik++;
                        }
                        else{
                            fan[x][R-1]='.';
                            licznik++;
                        }
                        if(licznik==r-R){
                            gwiazdka=!gwiazdka;
                            licznik=0;
                        }
                    }
                    //GORA
                    for(int y=R;y<n-R;y++){
                        if(gwiazdka){
                            fan[n-R][y]='*';
                            licznik++;
                        }
                        else{
                            fan[n-R][y]='.';
                            licznik++;
                        }
                        if(licznik==r-R){
                            gwiazdka=!gwiazdka;
                            licznik=0;
                        }
                    }                   
                }               
            }
            else{ //DLA PRAWOSKRETU r<0
                for(int R=1;R<r;R++){
                    //ustalenie licznika dla znakow . *
                    int licznik = 0; 
                    boolean gwiazdka = true;
                    //GORA
                    for(int y=R;y<n-R;y++){
                        if(gwiazdka){
                            fan[R-1][y]='*';
                            licznik++;
                        }
                        else{
                            fan[R-1][y]='.';
                            licznik++;
                        }
                        if(licznik==r-R){
                            gwiazdka=!gwiazdka;
                            licznik=0;
                        }
                    }
                    //PRAWO               
                    for(int x=R;x<n-R;x++){
                        if(gwiazdka){
                            fan[x][n-R]='*';
                            licznik++;
                        }
                        else{
                            fan[x][n-R]='.';
                            licznik++;
                        }
                        if(licznik==r-R){
                            gwiazdka=!gwiazdka;
                            licznik=0;
                        }
                    }
                    //DOL
                
                    for(int y=n-R-1;y>=R;y--){
                        if(gwiazdka){
                            fan[n-R][y]='*';
                            licznik++;
                        }
                        else{
                            fan[n-R][y]='.';
                            licznik++;
                        }
                        if(licznik==r-R){
                            gwiazdka=!gwiazdka;
                            licznik=0;
                        }
                    }
                
                    //LEWO
                    for(int x=n-R-1;x>=R;x--){
                        if(gwiazdka){
                            fan[x][R-1]='*';
                            licznik++;
                        }
                        else{
                            fan[x][R-1]='.';
                            licznik++;
                        }
                        if(licznik==r-R){
                            gwiazdka=!gwiazdka;
                            licznik=0;
                         }
                    }
                }
            }
            
            
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
