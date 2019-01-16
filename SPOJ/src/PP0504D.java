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
        
        int bits = Float.floatToIntBits(liczba);
        byte[] bytes = new byte[4];
        int ints[] = new int [4];
        bytes[0] = (byte)(bits & 0xff);
        ints[0] = bytes[0];
        bytes[1] = (byte)((bits >> 8) & 0xff);
        ints[1] = bytes[1];
        bytes[2] = (byte)((bits >> 16) & 0xff);
        ints[2] = bytes[2];
        bytes[3] = (byte)((bits >> 24) & 0xff);
        ints[3] = bytes[3];
        
        for(int x=3;x>=0;x--){
            String hex = Integer.toHexString(ints[x]);
            if(hex.length()>2){System.out.print(hex.substring(hex.length()-2));}
            else{System.out.print(hex);}
            if(x>0){System.out.print(" ");}
            else{System.out.println();}
        }
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
