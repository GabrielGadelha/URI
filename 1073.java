import java.util.Scanner;

class Main{
    public static void main (String ... args){
        int n;
        
        Scanner scan = new Scanner(System.in);
        
        n = scan.nextInt();
        for (int i=2;i<=n;i=i+2){
            System.out.println(i+"^2"+ " = "+ i*i);
        }
    
    }

}
