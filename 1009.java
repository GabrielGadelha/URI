import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Locale;

class Main{
    public static void main (String ... a){
        final double comissao = 0.15;
        String nome,val1,val2;
        double sal, vendas, receber;
        Scanner scan = new Scanner(System.in);
        
        nome = scan.next();
        val1 = scan.next();
        val2 = scan.next();
        
        sal = Double.parseDouble(val1);
        vendas = Double.parseDouble(val2);
        
        receber = sal + vendas*comissao;
        
       NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
       ((DecimalFormat) nf).applyPattern("0.00");
       
       System.out.println("TOTAL = R$ " + nf.format(receber));
        
    }

}
