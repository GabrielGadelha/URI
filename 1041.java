import java.util.Scanner;

class Main{
    public static void main (String ... args){
        double a,b;
        String a1,b1;
        
        Scanner scan = new Scanner (System.in);
        
        a1 = scan.next();
        b1 = scan.next();
        
        a = Double.parseDouble(a1);
        b = Double.parseDouble(b1);
        
        if (a==b && a==0) System.out.println("Origem");
        if(a==0 && b!=0) System.out.println("Eixo Y");
        if(a!=0 && b==0) System.out.println("Eixo X");
        if(a>0 && b>0) System.out.println("Q1");
        if(a<0 && b>0) System.out.println("Q2");
        if(a<0 && b<0) System.out.println("Q3");
        if(a>0 && b<0) System.out.println("Q4");
    }

}
