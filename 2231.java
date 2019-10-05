import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
class Ct{
    int qtdAlunos;
    int [][] relacoes;
    int [][] consultas;
    String respostas[];
    public Ct(int qtdA, int cons){
        qtdAlunos = qtdA;
        relacoes = new int [qtdA+1][qtdA+1];
        //consultas = new int [qtd][qtd];
        respostas = new String[cons];
    }
    public int relacao(int a, int b, int res){
        
      
        if(a>qtdAlunos|| b>qtdAlunos) return 0;
        
        if(relacoes[a][b]==1||relacoes[b][a]==1){
            return 1;
                  
        }
        else{
            for (int i=1;i<=qtdAlunos;i++){
             
                if(relacoes[a][i]==1||relacoes[i][a]==1){
                    if(i==res) return 0;
                    else{
                        return  relacao(i,b, a);
                    }
                }
            }
            return 0;
        }
       
    }
}
class Main{
    static List<Ct> ct  = new ArrayList<Ct>();
    public static void main (String args[]){
        int qtdAluno, qtdRel, qtdC;
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
         
            qtdAluno = scan.nextInt();
            qtdRel = scan.nextInt();
            qtdC = scan.nextInt();
            Ct ctt = new Ct(qtdAluno, qtdC);
            int a1,a2;
            for (int i=0;i<qtdRel;i++){
                   a1 =  scan.nextInt();
                   a2 = scan.nextInt();
                   if(a1<=qtdAluno && a2<=qtdAluno)
                    ctt.relacoes[a1][a2]=1;
            }
            for (int i=0;i<qtdC;i++){
                   a1 =  scan.nextInt();
                   a2 = scan.nextInt();
                  // if(ctt.relacao(a1,a2,0)==1){
                 if(1==1){
                        ctt.respostas[i]="S";
                  }
                  else{
                        ctt.respostas[i]="N";
                  }
            }
            ct.add(ctt);
            
       }
        Iterator<Ct> it = ct.iterator();
        while(it.hasNext()){
            Ct ctt2 = it.next();
            for (int i=0;i<ctt2.respostas.length;i++){
                System.out.println(ctt2.respostas[i]);
                
            }
            System.out.println();
        }
    }
}
