import java.util.Scanner;

class Main{
    public static void main (String ... args){
        int entrada, ano, mes, dias;
        
        Scanner scan = new Scanner(System.in);
        
        entrada = scan.nextInt();
        
        ano = entrada/365;
        mes = (entrada%365)/30;
        dias = entrada - ano*365 - mes*30;
        
        System.out.println(ano + " ano(s)" + "\n"+
                        mes + " mes(es)" + "\n" + dias + " dia(s)");
    
    }

}
