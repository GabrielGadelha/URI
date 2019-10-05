import java.util.Scanner;
import java.text.DecimalFormat; 
import java.text.NumberFormat;
import java.util.Locale;

class Main{
    public static void main (String args[]){
    
        double r,area;
        String entrada,saida;
        final double pi = 3.14159;
        Scanner scan = new Scanner(System.in);
        entrada = scan.next();
        r = Double.parseDouble(entrada);
        
        area = pi*(r*r);
        
        NumberFormat df = NumberFormat.getCurrencyInstance(Locale.US); 
        ((DecimalFormat)df).applyPattern("#.0000");
        
        saida = Double.toString(area);
        
        System.out.println( "A="+df.format(area)); 
    
    }

}
