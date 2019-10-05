import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.NumberFormat;

class Main{
    public static void main (String args[]){
        double sal, novoSal=0.0;
        int percentual=0;
        String ssal;
        
        Scanner scan = new Scanner(System.in);
        
        ssal = scan.next();
        
        sal = Double.parseDouble(ssal);
        
        if(sal<=400.0){
            percentual = 15;
            novoSal = sal + sal*0.15;
        }
        
        if (sal>400.0 && sal<= 800.0){
            percentual =12;
            novoSal = sal+sal*0.12;
        }
        if (sal>800.0 && sal<=1200.0){
            percentual = 10;
            novoSal = sal+sal*.10;
        }
        if(sal>1200.0 && sal <=2000.0){
            percentual =7;
            novoSal = sal+sal*0.07;
        }
        if(sal>2000.0){
            percentual = 4;
            novoSal = sal+sal*0.04;
        }
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        ((DecimalFormat)nf).applyPattern("0.00");
        System.out.println("Novo salario: "+ nf.format(novoSal)+"\n"+
                           "Reajuste ganho: " + nf.format(novoSal-sal)+"\n"+
                           "Em percentual: "+percentual+ " %");
        
    
    }

}
