import java.util.Scanner;

class Main{

    public static void main (String args[]){
        int hora,min,seg, tot;
        
        Scanner scan = new Scanner (System.in);
        tot = scan.nextInt();
        
        hora = tot/3600;
        min = (tot - hora*3600)/60;
        seg = (tot - hora*3600 - min*60);
        
        System.out.println(hora+":"+min+":"+seg);
        
    
    
    }

}
