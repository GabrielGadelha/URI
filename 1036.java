import java.util.Scanner;
import java.lang.Math;
import java.util.Locale;
import java.text.NumberFormat;
import java.text.DecimalFormat;

class Main{
    public static void main (String ... args){
        String a,b,c;
        double da,db,dc, delta, r1,r2;
        Scanner scan = new Scanner(System.in);
        a = scan.next();
        b = scan.next();
        c = scan.next();
        
        da = Double.parseDouble(a);
        db = Double.parseDouble(b);
        dc = Double.parseDouble(c);
        delta = db*db - 4*da*dc;
        if ((2*da)==0){
            System.out.println("Impossivel calcular");
        }
        else{
            if (Math.sqrt(delta)>0){
            
                r1 = (-db + Math.sqrt(delta))/(2*da);
                r2 = (-db - Math.sqrt(delta))/(2*da);
                
                NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
                ((DecimalFormat) nf).applyPattern("0.00000");
                System.out.println("R1 = "+nf.format(r1)+"\n"+"R2 = "+nf.format(r2));
            }else System.out.println("Impossivel calcular");
        }
        
        
        
        
    }

}
