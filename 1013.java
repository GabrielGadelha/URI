import java.util.Scanner;
import java.lang.Math;

class Main{

    public static void main (String ... args){
        int a,b,c, maiorAB, maiorFinal;
        
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        maiorAB = (a+b+ Math.abs(a-b))/2;
        maiorFinal=(maiorAB+c + Math.abs(c - maiorAB))/2;
        
        System.out.println(maiorFinal + " eh o maior");
    }

}
