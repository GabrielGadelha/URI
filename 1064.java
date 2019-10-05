import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;
import java.text.DecimalFormat;

class Main{

    public static void main (String args[]){
        double n,media, soma=0;
        String s;
        int count = 0;
        Scanner scan = new Scanner(System.in);
        for (int i=1;i<=6;i++){
            s= scan.next(); 
            n=Double.parseDouble(s);
            if (n>0.0) {count++;soma=soma +n;} 
        
        }
        media = soma/count;
        
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        ((DecimalFormat)nf).applyPattern("0.0");
        
        System.out.println(count + " valores positivos"+"\n"+ nf.format(media));
    
    }
}
