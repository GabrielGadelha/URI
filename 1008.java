import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;


class Main{

    public static void main (String args[]){
        int n,h;
        double val,sal;
        String e;
        
        Scanner scan = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        ((DecimalFormat) nf).applyPattern("0.00");
        
        n = scan.nextInt();
        h = scan.nextInt();
        e = scan.next();
        
        val = Double.parseDouble(e);
        
        sal = h*val;
        
        System.out.println("NUMBER = " + n);
        System.out.println("SALARY = U$ " + nf.format(sal));
    
    
    }

}
