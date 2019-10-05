import java.util.Scanner;

class Main{

    public static void main (String args[]){
        int n, cont=0;
        
        Scanner scan = new Scanner(System.in);
        
        for (int i=0;i<5;i++){
            n = scan.nextInt();
            if(n%2==0) cont++;
        }
        System.out.println(cont +" valores pares");
    
    }

}
