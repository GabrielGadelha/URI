import java.util.Scanner;
import java.lang.Math;

class Main{
    public static void main(String ...args){
        int moedas [];
        int n,qtdM, soma = 0, ultimoVal=0;
        double maxdiv;
        boolean a=true, t=false;
        
        
        Scanner scan = new Scanner(System.in);
        qtdM = scan.nextInt();
        
        moedas = new int[qtdM];
        
        for (int i=0;i<qtdM;i++)
        {
            moedas[i] = scan.nextInt();
        }
        n = scan.nextInt();
        soma = moedas[qtdM-1];
        //ultimoVal = moedas[qtdM-1];
        for (int i=qtdM-1;i>=0;i = i-n){
                if((i>=0) && (i!=qtdM-1)){
                    soma = soma + moedas[i];
                //    ultimoVal = moedas[i];
                }
        
        }
        
        if(scan.hasNextInt()){
            t = true;
        }
        maxdiv = Math.sqrt(soma);
        //System.out.println(maxdiv);
        int max = (int) (maxdiv + 1);
        for (int i=2;i<=max;i++){
            if(soma==i){
            }
            else{
                if(soma%i==0){
                    System.out.println("Bad boy! I\'ll hit you.");
                    a=false;
                    break;
                }
            }
        }
        if(soma==1){System.out.println("Bad boy! I\'ll hit you.");}
        else{
            if(a)  System.out.println("You\'re a coastal aircraft, Robbie, a large silver aircraft.");
       }
       if(t) System.out.println("Bad boy! I\'ll hit you.");
    }

}
