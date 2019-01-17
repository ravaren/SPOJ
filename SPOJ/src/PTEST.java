/*
PTEST - Zadanie próbne

Napisać program do dodawania dwóch liczb całkowitych. Na wejściu podane są w 
oddzielnych liniach dwie liczby naturalne A oraz B mniejsze od 200. Na wyjściu 
należy wypisać wartość ich sumy, A + B.
Przykład

 

Wejście
2
3

Wyjście
5

 */
import java.io.*;

public class PTEST {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        System.out.print(a+b);
    }
}
