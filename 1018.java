import java.util.Scanner;

class Main{
    public static void main (String ... args){
        int val, notCem, notCinq, notVint, notDez, notCinc, notDois, notUm;
        Scanner scan = new Scanner (System.in);
        val = scan.nextInt();
        notCem = val/100;
        notCinq = val%100/50;
        notVint = val%100%50/20;
        notDez = val%100%50%20/10;
        notCinc = val%100%50%20%10/5;
        notDois = val%100%50%20%10%5/2;
        notUm = val%100%50%20%10%5%2;
        
        
        System.out.println(val +"\n"+ 
        notCem+ " nota(s) de R$ 100,00"+"\n"+ 
        notCinq +" nota(s) de R$ 50,00"+"\n"+
        notVint +" nota(s) de R$ 20,00"+"\n"+
        notDez +" nota(s) de R$ 10,00"+"\n"+
        notCinc +" nota(s) de R$ 5,00"+"\n"+
        notDois +" nota(s) de R$ 2,00"+"\n"+
        notUm+" nota(s) de R$ 1,00");
        
    }
}
