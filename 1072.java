import java.util.Scanner;

class Main{
    public static void main (String ... args){
        int n,a, count=0;
        
        Scanner scan = new Scanner(System.in);
        
       n = scan.nextInt();
       for (int i = 0; i<n;i++){
            a = scan.nextInt();
            if(a>=10 && a<=20){
                count ++;
            }
            
        }
        System.out.println(count+ " in" + "\n" + (n-count)+" out");
    
    }

}
