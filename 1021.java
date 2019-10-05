import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

class Main{

    public static void main (String ... args){
        double ent;
        int qtdN100, qtdN50, qtdN20, qtdN10, qtdN5, qtdN2, qtdM1, qtdM50, qtdM25, qtdM10, qtdM5, qtdM1C, restinho;
        String entrada;
        
        Scanner scan = new Scanner(System.in);
        entrada = scan.next();
        ent = Double.parseDouble(entrada);
        restinho = Integer.parseInt(entrada.substring(entrada.length()-2,entrada.length()));
        qtdN100 = (int)ent/100;
        qtdN50 = ((int)ent%100)/50;
        qtdN20 = ((int)ent%100%50/20);
        qtdN10 = ((int)ent%100%50%20)/10;
        qtdN5 = ((int)ent%100%50%20%10)/5;
        qtdN2 = ((int)ent%100%50%20%10%5)/2;
        qtdM1 = ((int)ent%100%50%20%10%5%2);
        qtdM50 = restinho/50;
        qtdM25 = (restinho%50)/25;
        qtdM10 = (restinho%50%25)/10;
        qtdM5 = (restinho%50%25%10)/5;
        qtdM1C = restinho%50%25%10%5;
        
         System.out.println("NOTAS:" +"\n"+ 
        qtdN100+ " nota(s) de R$ 100.00"+"\n"+ 
        qtdN50 +" nota(s) de R$ 50.00"+"\n"+
        qtdN20 +" nota(s) de R$ 20.00"+"\n"+
        qtdN10 +" nota(s) de R$ 10.00"+"\n"+
        qtdN5 +" nota(s) de R$ 5.00"+"\n"+
        qtdN2 +" nota(s) de R$ 2.00"+"\n"+
       "MOEDAS:" +"\n"+
        qtdM1 + " moeda(s) de R$ 1.00"+"\n"+
        qtdM50 + " moeda(s) de R$ 0.50" +"\n"+
        qtdM25 + " moeda(s) de R$ 0.25" +"\n"+
        qtdM10 +" moeda(s) de R$ 0.10" +"\n"+
        qtdM5 + " moeda(s) de R$ 0.05" +"\n"+
        qtdM1C + " moeda(s) de R$ 0.01"
        );
       
     
    }

}
