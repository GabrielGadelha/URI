import java.util.Scanner;

class Main{

    public static void main (String args[]){
        double n;
        String s;
        int count = 0;
        Scanner scan = new Scanner(System.in);
        for (int i=1;i<=6;i++){
            s= scan.next(); 
            n=Double.parseDouble(s);
            if (n>0.0) count++;
        
        }
        System.out.println(count + " valores positivos");
    
    }
}
