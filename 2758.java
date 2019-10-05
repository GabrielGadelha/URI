 import java.util.Scanner;
 import java.util.Locale;
 import java.text.DecimalFormat;
 import java.text.NumberFormat;
 
 
 class Main{
 
    public static void main (String ... args){
        float a1,b2;
        double c3,d4;
        String s1,s2,s3,s4;
        Scanner scan = new Scanner(System.in);
        
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        ((DecimalFormat) nf).applypattern("0.0");
        
        while(scan.hasNext()){ //acho que o problema está por aqui
         
            s1 = scan.next();
            s2 = scan.next();
            s3 = scan.next();
            s3 = scan.next();
            a1 = Float.parseFloat(s1);
            b2 = Float.parseFloat(s2);
            c3 = Double.parseDouble(s3);
            d4 = Double.parseDouble(s4);
        
        }
        
        String saida = "A = "+var+", B = " + var "\n" +
                        "C = "+var+", D = "  + var "\n" +
                        "A = "+var+", B = " + var "\n" +
                        "C = " + var+ ", D = " var "\n" +
                         "A = "+var+", B = " + var "\n" +
                        "C = "+var+", D = "  + var "\n" +
                        "A = "+var+", B = " + var "\n" +
                        "C = " + var+ ", D = " var "\n" +
                        "A = "+var+", B = " + var "\n" +
                        "C = "+var+", D = "  + var "\n" +
                        "A = "+var+", B = " + var "\n" +
                        "C = " + var+ ", D = " var "\n" +
        
    

    
    }
 
 }

 
 
  
