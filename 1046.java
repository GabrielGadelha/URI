import java.util.Scanner;

class Main{
    public static void main(String ... args){
        int ini, fim, duracao=0;
        Scanner scan = new Scanner(System.in);
        
        ini = scan.nextInt();
        fim = scan.nextInt();
        
        if (ini > fim ) duracao = (24 -ini)   + fim;
        if (ini == fim) duracao =24;
        if (ini < fim) duracao = fim-ini;
        
        System.out.println("O JOGO DUROU "+duracao+" HORA(S)");
    }

}
