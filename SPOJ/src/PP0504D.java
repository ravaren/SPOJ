/*
Napisz funkcję

void printfloat(float);

która dla zadanej liczby typu float wypisze jej reprezentację szesnastkową.
Wejście

W pierwszej linii liczba testów t, w kolejnych t wierszach jedna liczba 
zmiennoprzecinkowa w zakresie typu float.
Wyjście

W kolejnych t wierszach odzielone pojedynczymi spacjami bajty reprezenacji 
kolejnych liczb, w kolejności od najstarszego bajtu.
Przykład

Wejście:
5
1 
-1 
0 
123.125 
-345

Wyjście:
3f 80 0 0 
bf 80 0 0 
0 0 0 0 
42 f6 40 0 
c3 ac 80 0 

 */
import java.io.*;

public class PP0504D {
    static void printFloat(float liczba){
        //String wynik = "";
        
        int bits = Float.floatToIntBits(liczba);
        byte[] bytes = new byte[4];
        bytes[0] = (byte)(bits & 0xff);
        bytes[1] = (byte)((bits >> 8) & 0xff);
        bytes[2] = (byte)((bits >> 16) & 0xff);
        bytes[3] = (byte)((bits >> 24) & 0xff);
        for(byte el: bytes){
            System.out.println(el);
        }
        //System.out.println(wynik);
    }
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        
        for(int x=0;x<t;x++){
            float liczba = Float.parseFloat(reader.readLine());
            printFloat(liczba);
        }
    }
}
