#include <stdio.h>
#include <math.h>
 
int main(void) {
        int n,qtdM, soma = 0, ultimoVal=0;
        double mdiv;
        int a=1;
        
        
        scanf ("%d", &qtdM);
       
        
        int moedas[qtdM];
        int i;
        for (i=0;i<qtdM;i++)
        {
        		
            scanf ("%d", &moedas[i]);
        }
        scanf ("%d", &n);
        soma = moedas[qtdM-1];
        //ultimoVal = moedas[qtdM-1];
        int k;
        for (k=qtdM-1;k>=0;k = k-n){
                if((k>=0) && (k!=qtdM-1)){
                    soma = soma + moedas[k];
                //    ultimoVal = moedas[i];
                }
        
        }
        mdiv = sqrt(soma);
        //System.out.println(maxdiv);
        int maxd = (int) (mdiv + 1);
        int j;
        for (j=2;j<=maxd;j++){
            if(soma==j){
            }
            else{
                if(soma%j==0){
                    printf("Bad boy! I'll hit you.");
                    a=0;
                    break;
                }
            }
        }
        if(soma==1){printf("Bad boy! I'll hit you.");}
        else{
            if(a)  printf("You're a coastal aircraft, Robbie, a large silver aircraft.");
       }
   //getch();
	return 0;
}
