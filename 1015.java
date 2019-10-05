import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.lang.Math;

class Main{
    public static void main (String ... args){
        double distancia,x1,x2,y1,y2;
        String xs1,xs2,ys1,ys2;
        Scanner scan = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        ((DecimalFormat)nf).applyPattern("0.0000");
        
        xs1 = scan.next();
        ys1 = scan.next();
        xs2 = scan.next();
        ys2 = scan.next();
        
        x1 = Double.parseDouble(xs1);
        y1 = Double.parseDouble(ys1);
        x2 = Double.parseDouble(xs2);
        y2 = Double.parseDouble(ys2);
        
        
        
        distancia = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        
        System.out.println(nf.format(distancia));
    }

}
