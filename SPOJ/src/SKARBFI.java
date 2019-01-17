/*
Pewien bardzo znany poszukiwacz skarbów, pan Skardfinder, właśnie odkrył kolejną 
w swoim życiu tajemniczą mapę określającą położenie skarbu. Mapa jest bardzo 
specyficzna, zawiera jedynie szereg liczb, po dwie w wierszu, których jest bardzo dużo. 
Po wielu miesiącach uważnego studiowania mapy i okoliczności jej zdobycia, 
pan Skardfinder wreszcie odkrył, co liczby te oznaczają. Otóż każda para jest 
pojedynczą wskazówką, gdzie pierwsza liczba w wierszu oznacza kierunek, w którym 
należy iść, a druga ilość kroków, które trzeba wykonać w tym kierunku. Kierunki 
te są zakodowane następująco:

        0 - północ
        1 - południe
        2 - zachód
        3 - wschód
      

Kolejnym odkryciem było to, że liczenie kroków trzeba rozpocząć od pewnej studni. 
Teraz nie pozostało nic innego, jak tylko pojechać tam i zacząć chodzić, jak mapa 
wskazuje, a potem odkopać skarb. Ale... tych wskazówek może być nawet 100000, 
a kroków w każdej z nich nawet do 10000. Nikt rozsądny oczywiście nie będzie 
chodził tyle pieszo, a na pewno nie tak znany poszukiwacz skarbów, jak pan 
Skardfinder. Dał Ci więc zadanie napisania dla niego programu, który wskaże, 
jak osiągnąć skarb robiąc jak najmniej kroków (oczywiście poruszając się tylko 
zgodnie z etykietą poszukiwaczy skarbów tzn. tylko w kierunkach północ-południe, 
lub wschód-zachód), lub powie, że skarb znajduje się we wspomnianej studni 
(jeśli kroki zaprowadzą nas do punktu, z którego zaczynaliśmy liczyć). 
Teren, na którym szukamy skarbu jest pustym polem i w zasięgu mapy nie ma na nim 
żadnych przeszkód, które uniemożliwiałyby robienie kroków w którymkolwiek z kierunków.
Specyfikacja wejścia

Pierwsza linia wejścia zawiera liczbę całkowitą D (1 ≤ D ≤ 50), oznaczającą liczbę 
zestawów danych. Pierwsza linia każdego zestawu zawiera jedną liczbę całkowitą N (0 ≤ N ≤ 100000), 
oznaczającą liczbę wskazówek - par określających kierunek i ilość kroków do wykonania. 
Kolejnych N linii składa się z liczb a i b (0 ≤ a ≤ 3; 1 ≤ b ≤ 10000), które oznaczają pojedynczą wskazówkę.
Specyfikacja wyjścia

Dla każdego zestawu danych należy wypisać najkrótszą drogę zgodną z zasadami etykiety poszukiwaczy skarbów, 
lub słowo studnia, jeśli skarb znajduje się w studni. Drogę oznaczamy tak samo jak na mapie, przez 
pary kierunek i ilość kroków w tym kierunku wypisanych w jednej linii. Jeśli do skarbu prowadzi prosta droga, 
należy wypisać tylko jedną linię z kierunkiem i ilością kroków. Jeśli droga musi skręcać, to wtedy pan Skardfinder 
po przeprowadzeniu na miejscu wizji lokalnej prosił, aby najpierw kroki wykonywać w orientacji północ-południe, 
a dopiero gdy znajdziemy się na odpowiedniej wysokości w tej orientacji, zacząć robić kroki w orientacji 
wschód-zachód.
Przykład
Wejście

3
3
1 1
0 2
3 1
4
0 1
2 1
1 1
3 1
2
0 1
0 2

Wyjście

0 1
3 1
studnia
0 3


 */
import java.io.*;

public class SKARBFI {
    public static void main(String[] args) throws java.lang.Exception{
        int x = 0;
        int y = 1;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int D = Integer.parseInt(reader.readLine());
        for(int d=0;d<D;d++){
            int N = Integer.parseInt(reader.readLine());
            if(N==0){System.out.println("studnia");}
            else{
                int[] punkt = new int[2];
                for(int n=0;n<N;n++){
                    String input = reader.readLine();
                    int pauza = input.indexOf(" ");
                    int kierunek = Integer.parseInt(input.substring(0,pauza));
                    int kroki = Integer.parseInt(input.substring(pauza+1));
                    if(kierunek==0){punkt[y]+=kroki;}
                    if(kierunek==1){punkt[y]-=kroki;}
                    if(kierunek==2){punkt[x]-=kroki;}
                    if(kierunek==3){punkt[x]+=kroki;}
                }
                if(punkt[y]==0 && punkt[x]==0){System.out.println("studnia");continue;}
                if(punkt[y]>0){System.out.println("0 " + punkt[y]);}
                if(punkt[y]<0){System.out.println("1 " + (punkt[y]*-1));}
                if(punkt[x]>0){System.out.println("3 " + punkt[x]);}
                if(punkt[x]<0){System.out.println("2 " + (punkt[x]*-1));}                
            }
        }
    }
}
