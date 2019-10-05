import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.NumberFormat;

class Main{
    public static void main (String ... args){
        double sal, imp;
        String ssal;
        
        Scanner scan = new Scanner(System.in);
        
        ssal = scan.next();
        sal = Double.parseDouble(ssal);
        
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        ((DecimalFormat)nf).applyPattern("0.00");
        if(sal>=0.00 && sal<=2000.00){
            System.out.println("Isento");
        
        }
        if(sal>2000.00 && sal<=3000.00){
                imp = (sal-2000.00)*0.08;
                System.out.println("R$ "+nf.format(imp));
        
        }
        if(sal>3000.00 && sal<=4500.00){
             imp = 1000.00*0.08+ (sal-3000)*0.18 ;
             System.out.println("R$ "+nf.format(imp));
        }
        if(sal>4500.00){
            imp = 1000.00*0.08+ 1500*0.18+(sal-4500.00)*0.28;
            System.out.println("R$ "+nf.format(imp));
        }
        
    
    }

}
