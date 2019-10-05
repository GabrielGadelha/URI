import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.NumberFormat;

class Main{
    public static void main (String ...a){
        final double pi = 3.14159;
        double r, volume;
        
        Scanner scan = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        
        ((DecimalFormat) nf).applyPattern("0.000");
        
        r = scan.nextDouble();
        
        volume = (4.0/3)*pi*r*r*r;
        
        System.out.println("VOLUME = "+nf.format(volume));
    
    }

}
