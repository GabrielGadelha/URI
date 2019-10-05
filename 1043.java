import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;
import java.text.DecimalFormat;

class Main{

    public static void main (String ... args){
        double a,b,c, perimetro, area;
        String s1,s2,s3;
        
        Scanner scan = new Scanner(System.in);
        
        s1 = scan.next();
        s2 = scan.next();
        s3 = scan.next();
        
        a = Double.parseDouble(s1);
        b = Double.parseDouble(s2);
        c = Double.parseDouble(s3);
        
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        ((DecimalFormat) nf).applyPattern("0.0");
        
        if(((a+b)>c) && ((a+c)>b) && ((c+b)>a)){
            perimetro = a+b+c;
            System.out.println("Perimetro = "+nf.format(perimetro));
        }
        else{
        
            area = ((a+b)/2)*c;
            System.out.println("Area = "+nf.format(area));
        }    
    
    }
}
