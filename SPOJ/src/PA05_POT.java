import java.io.*;

public class PA05_POT {
    

  
    static public void main(String[] args) throws java.lang.Exception {
        
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));        
        int D = Integer.parseInt(reader.readLine());
        
        for(int x=0;x<D;x++){
            String input = reader.readLine();
            int pauza = input.indexOf(" ");
            long a = Long.parseLong(input.substring(0, pauza));
            long b = Long.parseLong(input.substring(pauza+1));
            
            if(a%10==0){System.out.println(0);}
            if(a%10==1){System.out.println(1);}
            if(a%10==2){
                if(b%4==1){System.out.println(2);}
                if(b%4==2){System.out.println(4);}
                if(b%4==3){System.out.println(8);}
                if(b%4==0){System.out.println(6);}
            }
            if(a%10==3){
                if(b%4==1){System.out.println(3);}
                if(b%4==2){System.out.println(9);}
                if(b%4==3){System.out.println(7);}
                if(b%4==0){System.out.println(1);}
            }
            if(a%10==4){
                if(b%2==1){System.out.println(4);}
                if(b%2==0){System.out.println(6);}
            }
            if(a%10==5){System.out.println(5);}
            if(a%10==6){System.out.println(6);}
            if(a%10==7){
                if(b%4==1){System.out.println(7);}
                if(b%4==2){System.out.println(9);}
                if(b%4==3){System.out.println(3);}
                if(b%4==0){System.out.println(1);}
            }
            if(a%10==8){
                if(b%4==1){System.out.println(8);}
                if(b%4==2){System.out.println(4);}
                if(b%4==3){System.out.println(2);}
                if(b%4==0){System.out.println(6);}
            }
            if(a%10==9){
                if(b%2==1){System.out.println(9);}
                if(b%2==0){System.out.println(1);}
            }
        }
    }
}