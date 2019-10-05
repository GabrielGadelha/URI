import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.NumberFormat;

class Main{
    static final double I1 = 4.0;
    static final double I2 = 4.5;
    static final double I3 = 5.0;
    static final double I4 = 2.0;
    static final double I5 = 1.5;
    public static void main (String ... args){
        int a,b;
        double total=0.0;
        Scanner scan = new Scanner (System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        
        switch (a){
        case 1: {total = b*I1;break;}
        case 2: {total=b*I2;break;}
        case 3: {total = b*I3;break;}
        case 4: {total = b*I4;break;}
        case 5: {total = b*I5;break;}
        
        }
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        ((DecimalFormat) nf).applyPattern("0.00");
        System.out.println("Total: R$ "+ nf.format(total));
    }
}
