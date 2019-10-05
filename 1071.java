import java.util.Scanner;

class Main{
    public static void main (String ... args){
        int x,y, soma=0;
        
        Scanner scan = new Scanner(System.in);
        
        x = scan.nextInt();
        y = scan.nextInt();
        if(x<y){
            for (int i = x+1; i<y;i++){
                if(i%2!=0){
                    soma = soma +i;
                }
            
            }
        } else{
            for (int i = y+1; i<x;i++){
                if(i%2!=0){
                    soma = soma +i;
                }
            
            }
        }
       System.out.println(soma);
    
    }

}
