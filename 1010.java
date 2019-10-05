import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.NumberFormat;

class Main{

    public static void main (String ... a){
        int cod1,cod2,qtd1,qtd2;
        double val1,val2,tot;
        String valS1,valS2;
        
        Scanner scan = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        ((DecimalFormat) nf).applyPattern("0.00");
        
        cod1 = scan.nextInt();
        qtd1 = scan.nextInt();
        valS1 = scan.next();
        cod2 = scan.nextInt();
        qtd2 = scan.nextInt();
        valS2 = scan.next();
        val1 = Double.parseDouble(valS1);
        val2 = Double.parseDouble(valS2);
        tot = qtd1*val1 + qtd2*val2;
        
        System.out.println("VALOR A PAGAR: R$ "+nf.format(tot));
        
    }
}
