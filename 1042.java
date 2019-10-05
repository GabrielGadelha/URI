import java.util.Scanner;

class Main{
    public static void main (String ... args){
    
        int vet[] = new int[3];
        int a,b,c,aux;
        Scanner scan = new Scanner (System.in);
        
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        
        vet[0] = a;
        vet[1] = b;
        vet[2] = c;
        if (vet[0]>vet[1] && vet[0]>vet[2])
        {
            aux =  vet[0];
            vet[0] = vet[2];
            vet[2] = aux;
            
            if(vet[0]>vet[1]){
                aux =  vet[0];
                vet[0] = vet[1];
                vet[1] = aux;
            
            }
        
        }
        if (vet[1]>vet[0] && vet[1]>vet[2])
        {
            aux =  vet[1];
            vet[1] = vet[2];
            vet[2] = aux;
            
            if(vet[0]>vet[1]){
                aux =  vet[0];
                vet[0] = vet[1];
                vet[1] = aux;
                
            }        
        }
        if (vet[2]>vet[0] && vet[2]>vet[1])
        {
            if(vet[0]>vet[1]){
                aux =  vet[0];
                vet[0] = vet[1];
                vet[1] = aux;
            
            }
        
        }
        
        
        for (int i=0; i<3;i++)
        {
            System.out.println(vet[i]);
        
        }
        System.out.println();
        
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
    
    }

}
