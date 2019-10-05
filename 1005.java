import java.util.Scanner; 
import java.text.DecimalFormat;


class Main{

    public static void main (String args[]){
    
        double a,b,r;
        String p1,p2;
        
        Scanner scan = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat("0.00000");
        
        p1 = scan.next();
        p2 = scan.next();
        
        a = Double.parseDouble(p1);
        b = Double.parseDouble(p2);
        
        r = (3.5*a+7.5*b)/11;
        
        System.out.println("MEDIA = " + df.format(r));
    
    
    }

}
