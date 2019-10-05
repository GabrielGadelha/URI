import java.util.Scanner;
import java.text.DecimalFormat;

class Main{

    public static void main (String args[]){
    
        double a,b,c, r;
        
        String p1,p2,p3;
        
        Scanner scan = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        
        p1 = scan.next();
        p2 = scan.next();
        p3 = scan.next();
        
        a = Double.parseDouble(p1);
        b = Double.parseDouble(p2);
        c = Double.parseDouble(p3);
        
        r = (2*a+3*b+5*c)/10;
        
        System.out.println("MEDIA = " + df.format(r));
        
    
    }

}
