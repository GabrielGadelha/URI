import java.util.Scanner;
import java.util.Iterator;
import java.util.Vector;
class Matriz{
    int linhas;
    int colunas;
    
    public Matriz(int a, int b){
        linhas = a;
        colunas = b;
    }
}
class CT{
    int tam;
    Matriz m[];
    int resultado[][];
    int aux[][];
    boolean maisDeUm=false;
    
    public CT(int qtd){
        tam = qtd;
        m = new Matriz[qtd];
        resultado = new int[qtd][qtd];
        aux = new int[qtd][qtd];
    }

}
public class Matrizes{

    static Vector<CT> todosCT = new Vector<CT>();
    
    public static void main (String args[]){
            //efetua a leitura de todos os casos de teste
            ler();
            calcularPD();
            mostrar();
    }
    static void ler(){
        Scanner scan = new Scanner (System.in);
        int qtdCT, lin,col;
        //recebo a quantidade de matrizes do caso de teste
        qtdCT = scan.nextInt();
        
        //vou ficar lendo casos de teste até receber 0;
        while (qtdCT!=0){
            //iniciei a leitura do meu caso de teste
            CT ct = new CT(qtdCT);
            
            for (int i=0; i<qtdCT;i++){
                lin = scan.nextInt();
                col = scan.nextInt();
                Matriz m = new Matriz(lin,col);
                //cada caso de testes tem um conjunto de matrizes
                ct.m[i] = m;            
            }
        //neste ponto, finalizei o conjunto de matrizes do caso de testes
        //basta adicionar o ct no Vector e ler o novo caso de teste
            todosCT.add(ct);
            qtdCT = scan.nextInt();
        }


    }
     static void calcularPD(){
        //percorrer meus casos de teste pra pegar os dados necessários
        Iterator<CT> iter = todosCT.iterator();
        
        while(iter.hasNext()){ 
        
            CT ct = iter.next();
            
            int tam = ct.tam, temp,h;
            //começo ininializando o caso base
            for (int i=0;i<tam;i++) ct.resultado[i][i] = 0;
            
            
            for (int i=1;i<tam;i++){
                for (int j=0;j<tam-i;j++){
                    h = i+j;
                    ct.resultado[j][h] = Integer.MAX_VALUE;
		   // if(h-j>1){
                    	for (int k=j;k<h;k++){
                          
                          	temp = ct.resultado[j][k] + ct.resultado[k+1][h] + ct.m[j].linhas*ct.m[k+1].linhas*ct.m[h].colunas;
                                if(temp == ct.resultado[j][h]) ct.maisDeUm = true;
				if (temp< ct.resultado[j][h])
                          	{                        
                                	ct.resultado[j][h] = temp;
                                	ct.aux[j][h] = k;     
                         	 }
                        
                    	}
		   // }
		   /* else{
			temp = ct.m[j].linhas*ct.m[j].colunas*ct.m[h].colunas;
			if(temp<ct.resultado[j][h])
			{
				ct.resultado[j][h] = temp;
				ct.aux[j][h] = 0;
			}
			
		    }*/
                }
                
            }
                
        }
    }
    
     static void mostrar(){
        //percorrer meus casos de teste pra pegar os dados necessários
        Iterator<CT> iter = todosCT.iterator();
        
        while(iter.hasNext()){ 
        
            CT ct = iter.next();
            if(!ct.maisDeUm)
            {
                resultado(ct,0,ct.tam-1);
	System.out.println();
            //    System.out.println("RESULTADO: "+ ct.aux[0][ct.tam-1]); 
            }
            else {System.out.println(ct.resultado[0][ct.tam-1]);}
         //   System.out.println();
           /* for (int i=0;i<ct.tam;i++){
                for (int j=0;j<ct.tam;j++)
                {
                    System.out.print(ct.aux[i][j] + " ");
                }System.out.println();}
                System.out.println();
        */}
    
    }
     static void resultado(CT ct, int p, int u){
        if(p==u)
            System.out.print("A"+(p+1));
            else
            {
                System.out.print("(");
                resultado(ct, p, ct.aux[p][u]);
                resultado(ct, ct.aux[p][u]+1,u );
                System.out.print(")");
                
            }
    }
}
