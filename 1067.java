import java.util.Scanner;

class Main{
    public static void main (String ... args){
        int x;
        
        Scanner scan = new Scanner(System.in);
        
        x = scan.nextInt();
        
        for (int i=1;i<=x; i = i+2){
            System.out.println(i);
        }
    
    }

}
