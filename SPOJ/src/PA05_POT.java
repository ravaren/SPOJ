import java.util.*;

public class PA05_POT {
    

  
    static public void main(String[] args) throws java.lang.Exception {
        
        
        Scanner reader =  new Scanner(System.in); 
        int D = reader.nextInt();
        
        
        for(int x=0;x<D;x++){
            String input = reader.nextLine();
            int pauza = input.indexOf(" ");
            long a = Long.parseLong(input.substring(0, pauza));
            long b = Long.parseLong(input.substring(pauza));
            System.out.println(a);
            System.out.println(b);
            
        }
        /*
        for(long el: tab){
            
            if(el==0 || el==1){System.out.println(0 + " " + 1);}
            if(el==2){System.out.println(0 + " " + 2);}
            if(el==3){System.out.println(0 + " " + 6);}
            if(el==4){System.out.println(2 + " " + 4);}
            if(el==5 || el==6){System.out.println(2 + " " + 0);}
            if(el==7){System.out.println(4 + " " + 0);}
            if(el==8){System.out.println(2 + " " + 0);}
            if(el==9){System.out.println(8 + " " + 0);}
            if(el>9){System.out.println(0 + " " + 0);}
        
        }
        */
    }
}