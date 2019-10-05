import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;
import java.text.DecimalFormat;

class Main{
    public static void main (String ...args){
        int a;
        float b;
        char c;
        String d, sb;
        
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextInt();
        sb = sc.next();
        c = sc.next().charAt(0);
        d = sc.nextLine();
        d = d.substring(1,d.length());
        
        b = Float.parseFloat(sb);
        
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        ((DecimalFormat) nf).applyPattern("0.000000");
        
        System.out.printf("%s%s%s%s\n", a, nf.format(b), c, d);
        System.out.printf("%s\t", a);
        System.out.printf("%s\t",  nf.format(b));
         System.out.printf("%s\t",  c);
          System.out.printf("%s\t\n",  d);
        System.out.printf("%10s%10s%10s%10s\n", a,nf.format(b),c,d);
    }

}
