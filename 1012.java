import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.NumberFormat;

class Main{
    public static void main (String ... args){
        final double pi = 3.14159;
        double a,b,c,areaT,areaC,areaTrap,areaQ,areaR;
        String sa,sb,sc;
        
        
        Scanner scan = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        
        ((DecimalFormat)nf).applyPattern("0.000");
        sa = scan.next();
        sb = scan.next();
        sc = scan.next();
        
        a = Double.parseDouble(sa);
        b = Double.parseDouble(sb);
        c = Double.parseDouble(sc);
        areaT = a*c/2;
        areaC = pi*c*c;
        areaTrap = ((a+b)/2*c);
        areaQ = b*b;
        areaR = a*b;
        
        System.out.println("TRIANGULO: "+ nf.format(areaT));
        System.out.println("CIRCULO: "+ nf.format(areaC));
        System.out.println("TRAPEZIO: "+ nf.format(areaTrap));
        System.out.println("QUADRADO: "+ nf.format(areaQ));
        System.out.println("RETANGULO: "+ nf.format(areaR));
    
    }

}

