import java.util.Scanner;

class Main{
    public static void main (String ... args){
        int x, cont=0,i;
        
        Scanner scan = new Scanner(System.in);
        
        x = scan.nextInt();
        i = x;
        while (cont <6){
            if(i%2!=0){
                System.out.println(i);
                cont++;
            }
            i++;
        }
    
    }

}
