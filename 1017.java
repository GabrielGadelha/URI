import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.NumberFormat;

class Main{
    public static void main (String ... args){
        int tempo, vm, km;
        double combustivel;
        
        Scanner scan = new Scanner (System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        ((DecimalFormat)nf).applyPattern("0.000");
        
        tempo = scan.nextInt();
        vm = scan.nextInt();
        km = tempo*vm;
        combustivel = km/12.0;
        
        System.out.println(nf.format(combustivel));
    
    }

}
