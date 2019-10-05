import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.NumberFormat;

class Main{

    public static void main (String ... args){
        String s1,s2,s3,s4,s5;
        double n1,n2,n3,n4,n5,media,mediaFinal;
        Scanner scan = new Scanner(System.in);
        
        s1 = scan.next();
        s2 = scan.next();
        s3 = scan.next();
        s4 = scan.next();
        
        n1 = Double.parseDouble(s1);
        n2 = Double.parseDouble(s2);
        n3 = Double.parseDouble(s3);
        n4 = Double.parseDouble(s4);
    
        media = (n1*2+n2*3+n3*4+n4)/10;
        
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        ((DecimalFormat) nf).applyPattern("0.0");
        
        System.out.println("Media: "+nf.format(media));
        
        if(media>=7.0){
            System.out.println("Aluno aprovado.");
        
        }
        else {
            if(media < 5.0) System.out.println("Aluno reprovado.");
            else {
                System.out.println("Aluno em exame.");
                s5 = scan.next();
                n5 = Double.parseDouble(s5);
                System.out.println("Nota do exame: "+nf.format(n5));
                
                mediaFinal = (media+n5)/2;
                
                if(mediaFinal>=5.0){
                    System.out.println("Aluno aprovado.");
                    System.out.println("Media final: "+ nf.format(mediaFinal));
                
                }
                else {
                    System.out.println("Aluno reprovado.");
                    System.out.println("Media final: "+ nf.format(mediaFinal));
                }
            }
            
        }
    }
}
