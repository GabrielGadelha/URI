import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;
import java.text.DecimalFormat;

class Main{
    public static void main (String ... args){
        int km;
        double consumo, media;
        String cons;
        
        Scanner scan = new Scanner (System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        ((DecimalFormat) nf).applyPattern("0.000");
        
        km = scan.nextInt();
        cons = scan.next();
        
        consumo = Double.parseDouble(cons);
        
        media = km/consumo;
        
        System.out.println(nf.format(media)+ " km/l");
        
    
    }


}

