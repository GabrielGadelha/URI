import java.util.Scanner;

class Main{
    public static void main(String ... args){
        double a;
        String b;
        
        Scanner scan = new Scanner(System.in);
        b = scan.next();
        a = Double.parseDouble(b);
        if(a>=0&& a<=25) System.out.println("Intervalo [0,25]"); 
        
        if(a>25 && a<=50) System.out.println("Intervalo (25,50]");
        
        if(a>50 && a<=75) System.out.println("Intervalo (50,75]");
        
        if(a>75 && a<=100) System.out.println("Intervalo (75,100]");
        
        if(a<0 || a>100) System.out.println("Fora de intervalo");
    
    }

}
