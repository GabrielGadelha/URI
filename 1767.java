import java.util.Scanner;

class Viagem{

    int qtdPacotes;
    int qtdPorPacote[];
    int pesoPorPacote[];
    int z[][] ;
    int sol[];
    int qtdSol;
    int pesoSol;
    int sobraramSol;
    
}
public class Mochila{
    static final int  PESO = 50;
    public static void main(String args[]){
        int viagens;
        Scanner scan = new Scanner(System.in);
        viagens = scan.nextInt();
       
       
        //em cada viagem eu coloco uma instância do problema e uma solução
        Viagem conjuntoProblemaSolucao[] = new Viagem[viagens];
        
        for (int i=0;i<viagens;i++){
            //os dados de cada viagem sçao armazenados em um objeto
            Viagem v = new Viagem();
            //quantos pacotes em determinada viagem
            v.qtdPacotes = scan.nextInt();
            v.qtdPorPacote = new int[v.qtdPacotes+1];
            v.pesoPorPacote  = new int[v.qtdPacotes+1];
               
           for (int j=1;j<=v.qtdPacotes;j++){
                
              v.qtdPorPacote[j] = scan.nextInt();
              v.pesoPorPacote[j]  = scan.nextInt();
          }
          conjuntoProblemaSolucao[i] = v;            
        }
        
        for (int i=0;i<viagens;i++){
            Viagem v = conjuntoProblemaSolucao[i];
            encontrarMaiorPeso(v); 
            System.out.println(v.qtdSol+ " brinquedos");
            System.out.println("Peso: "+ v.pesoSol + " kg");
            System.out.println("sobra(m) "+v.sobraramSol+" pacote(s)");
            System.out.println();
        }
    }
    static void encontrarMaiorPeso (Viagem v){
        v.z = new int[v.qtdPacotes+1][PESO+1];
        v.sol = new int[v.qtdPacotes+1];
        for (int i=0; i<=v.qtdPacotes;i++) v.sol[i]=0;
        
        for (int i=0;i<=v.qtdPacotes;i++) v.z[i][0]=0;
        for (int i=0;i<=PESO;i++) v.z[0][i]=0;
        for (int i=1;i<=v.qtdPacotes;i++){
            for (int j=1;j<=PESO;j++){
                if (v.pesoPorPacote[i] <= j){
                    if(v.z[i-1][j] >= (v.z[i-1][j-v.pesoPorPacote[i]] + v.qtdPorPacote[i]))
                             v.z[i][j] = v.z[i-1][j];
                    else 
                        v.z[i][j] = v.z[i-1][j-v.pesoPorPacote[i]] + v.qtdPorPacote[i];
                
                }
                else
                {
                    v.z[i][j] = v.z[i-1][j];
                }
            }
            
        }
        
        solucao(v.qtdPacotes, PESO, v);
        
        v.qtdSol=0;
        v.pesoSol=0;
        v.sobraramSol=0;
        for (int j=1;j<= v.qtdPacotes;j++){
           if(v.sol[j]==1){
                 v.qtdSol = v.qtdSol + v.qtdPorPacote[j];
                 v.pesoSol = v.pesoSol + v.pesoPorPacote[j];
           }
           else
                v.sobraramSol++;
        }
         
    }
    static void solucao (int pacs, int p, Viagem v){
    
        if(pacs>0){
            if(v.z[pacs][p] == v.z[pacs-1][p])
            {
                v.sol[pacs] = 0;
                solucao(pacs-1,p, v);
            }
            else
            {
                v.sol[pacs] = 1;
                solucao(pacs-1,p-v.pesoPorPacote[pacs],v);
            }
        }
    }

}
