/*
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

public class FLAMASTEbis {
    public static void main(String[] args) throws java.lang.Exception{
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(reader.readLine());
        
        for(int x=0;x<C;x++){
            String text = reader.readLine();
            String[] literki = new String[text.length()];
            int [] liczniki = new int[text.length()];
            
            int nrTab = 0;
            literki[0] = text.substring(0,1);
            liczniki[0] = 0;
            for(int y=0;y<text.length();y++){
                
                if(literki[nrTab].equals(text.substring(y,y+1))){
                    liczniki[nrTab]++;
                }
                else{
                    nrTab++;
                    literki[nrTab] = text.substring(y,y+1);
                    liczniki[nrTab] = 1;
                }
            }
            for(int z=0;z<=nrTab;z++){
                if(liczniki[z]==1){
                        System.out.print(literki[z]);
                    }
                    if(liczniki[z]==2){
                        System.out.print(literki[z]+literki[z]);
                    }
                    if(liczniki[z]>2){
                        System.out.print(literki[z]+liczniki[z]);
                    }
            }
            System.out.println();
        }
    }
}
