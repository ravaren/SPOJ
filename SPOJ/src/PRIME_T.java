
import java.util.Scanner;

public class PRIME_T {
    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);
        int n;
        
        do{
           n = reader.nextInt(); 
        }while (!(n>0 && n<100000));
        
        int[] tab = new int[n];
        
        for(int x=0; x<n;x++){
            tab[x] = reader.nextInt();
        }
        
        for(int el: tab){
            boolean flag = true;
            if(el==1)flag=false;
            for(int x=2; x<el; x++){
                if(el%x==0)flag=false;               
            }
            if(flag==true){System.out.println("TAK");}
            else{System.out.println("NIE");}
            
            
            
        }
        
    }
}
