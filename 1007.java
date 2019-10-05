import java.util.Scanner;

class Main{

    public static void main (String k[]){
    
        int a,b,c,d,r;
        
        Scanner scan = new Scanner(System.in);
        
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();
        
        r = (a*b) - (c*d);
        
        System.out.println("DIFERENCA = "+ r);
    
    }

}
