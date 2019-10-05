import java.util.Scanner;

class Main{

    public static void main (String args[]){
        int n, contPar=0, contImpar=0, contPos=0, contNeg=0;
        
        Scanner scan = new Scanner(System.in);
        
        for (int i=0;i<5;i++){
            n = scan.nextInt();
            if(n%2==0) contPar++;
            else contImpar++;
            if(n>0) contPos++;
            if(n<0) contNeg++;
        }
        System.out.println(contPar +" valor(es) par(es)" + "\n"+
                           contImpar +" valor(es) impar(es)" + "\n"+
                           contPos +" valor(es) positivo(s)" + "\n"+
                           contNeg +" valor(es) negativo(s)");
    
    }

}
