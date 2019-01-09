
import java.util.Scanner;

public class PRIME_Tbis {
    public static void main(String [] args){
        
        Scanner reader = new Scanner(System.in);
        int n;
        do{
           n = reader.nextInt(); 
        }while (!(n>0 && n<100000));
        
        String[] answers = new String [n];
        for(int x=0; x<n; x++){
            Scanner reader2 = new Scanner(System.in);
            int y = reader2.nextInt();
            
            if(y==1){answers[x]="NIE";}
            else{
                for(int z=2;z<y;z++){
                    if(y%z==0){
                        answers[x] = "NIE";
                        break;
                    }
                    else{
                        if(z==y-1){answers[x] = "TAK";}
                    }
                }
            }
        }
        for(int x=0; x<n;x++){
            System.out.println(answers[x]);
        }
            
            
        
        
    }
}
