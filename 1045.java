import java.util.Scanner;

class Main{
    
    static double vetFinal[];
    static void ordenar (double vet[],int ini, int fim){
        int meio = 0;
        if (ini < fim){
            meio = (ini + fim)/2;
        
            ordenar(vet, ini, meio);
            ordenar (vet, meio+1, fim);
            juntar (vet, ini, meio, fim);
        }
        
    }
    static void juntar(double vet[],int ini, int meio, int fim){
        
        int com1 = ini, com2 = meio+1, comAux = 0, tam = fim-ini+1;
        double vetAux[] = new double[tam];
        while(com1 <= meio && com2 <= fim){
            if(vet[com1] >= vet[com2]) {
                vetAux[comAux] = vet[com1];
                com1++;
            } else {
                vetAux[comAux] = vet[com2];
                com2++;
            }
            comAux++;
        }

        while(com1 <= meio){  //Caso ainda haja elementos na primeira metade
            vetAux[comAux] = vet[com1];
            comAux++;
            com1++;
        }

        while(com2 <= fim) {   //Caso ainda haja elementos na segunda metade
            vetAux[comAux] = vet[com2];
            comAux++;
            com2++;
        }

        for(comAux = ini; comAux <= fim; comAux++){    //Move os elementos de volta para o vetor original
            vetFinal[comAux] = vetAux[comAux-ini];
        }
            
    }
    
    public static void main (String args[]){
        String s1,s2,s3;
        double a,b,c, aux;
        Scanner scan;
       double vet[] = new double[3];
        
        scan = new Scanner(System.in);
        s1 = scan.next();
        s2 = scan.next();
        s3 = scan.next();
        a = Double.parseDouble(s1);
        b = Double.parseDouble(s2);
        c = Double.parseDouble(s3);
        vet[0]=a;
        vet[1]=b;
        vet[2]=c;
       
        if (vet[0]>=vet[1] && vet[0]>=vet[2])
        {
            if(vet[2]>vet[1]){
                aux =  vet[2];
                vet[2] = vet[1];
                vet[1] = aux;
            
            }
        
        }
        if (vet[1]>=vet[0] && vet[1]>=vet[2])
        {
            aux =  vet[1];
            vet[1] = vet[0];
            vet[0] = aux;
            
            if(vet[1]<vet[2]){
                aux =  vet[2];
                vet[2] = vet[1];
                vet[1] = aux;
                
            }        
        }
        if (vet[2]>=vet[0] && vet[2]>=vet[1])
        {
             aux =  vet[2];
            vet[2] = vet[0];
            vet[0] = aux;
            
            if(vet[1]<vet[2]){
                aux =  vet[2];
                vet[2] = vet[1];
                vet[1] = aux;
                
            }        
        
        }
        if(vet[0]>= vet[1]+vet[2]){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else{
            if((vet[0]*vet[0])==(vet[1]*vet[1]+vet[2]*vet[2])){
                System.out.println("TRIANGULO RETANGULO");
            }
            if((vet[0]*vet[0])>(vet[1]*vet[1]+vet[2]*vet[2])){
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if((vet[0]*vet[0])<(vet[1]*vet[1]+vet[2]*vet[2])){
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if((vet[0]==vet[1] && vet[0]==vet[2])){
                System.out.println("TRIANGULO EQUILATERO");
            }
             if(((vet[0]==vet[1] || vet[0]==vet[2]) && (vet[1]!=vet[2]))
             ||((vet[0]==vet[1] || vet[1]==vet[2]) && (vet[0]!=vet[2]))
             ||((vet[0]==vet[2] || vet[1]==vet[2]) && (vet[1]!=vet[0]))){
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
    

}
