import java.util.Scanner;
class Pessoa{
        int bel;
        int fort;
        int doa;
        int []conflits;
        public Pessoa(int qtd){
            conflits = new int[qtd];
        }
    
    }
class Main{
    
    public static void main (String args[]){
        int qtd;
        Pessoa [] pessoas;
        Pessoa[] doadores;
        
        Scanner scan = new Scanner(System.in);
        
        qtd = scan.nextInt();
        pessoas = new Pessoa[qtd];
        //conflitos=new Pessoa[qtd];
        doadores = new Pessoa[qtd];
        
        for (int i=0;i<qtd;i++){
            pessoas[i] = new Pessoa(qtd);
            pessoas[i].bel=scan.nextInt();
            pessoas[i].fort = scan.nextInt();
            pessoas[i].doa = scan.nextInt();
        
        }
        
        
        for (int i=0;i<qtd;i++){
            for (int j=0;j<qtd;j++){
                if((pessoas[i].bel > pessoas[j].bel && pessoas[i].fort > pessoas[j].fort) || (pessoas[i].bel < pessoas[j].bel && pessoas[i].fort < pessoas[j].fort)
                || (pessoas[i].bel == pessoas[j].bel && pessoas[i].fort == pessoas[j].fort) ){
                
                }
                else{
                    pessoas[i].conflits[j]=1;
                    pessoas[j].conflits[i]=1;
                    System.out.println(i+"/"+j);
                
                }
            
            }
        
        }
        
        //isso aqui não funciona. tem que aplicar programação dinâmica
        int doaMais=0;
        for (int i=0;i<qtd;i++){
             for (int j=0;j<qtd;j++){
                if(pessoas[i].conflits[j]==1){
                    if(pessoas[i].doa>=pessoas[j].doa){
                        doaMais=i;
                    }
                    else doaMais=j;
                }
            }
            if(doaMais==0) doadores[i]=pessoas[i];
            else doadores[i]=pessoas[doaMais];
        }
        
        int soma = 0;
        for(int i=0;i<qtd;i++){
            if (doadores[i]!=null)
                soma = soma + doadores[i].doa;
        }
        System.out.println(soma);
    
    }

}
