import java.util.Scanner;
import java.util.Vector;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.lang.Math;
class Fatorial{
    int x;
    double val;
}

class Main{
   
    static long num = 1000000007;
    public static void main(String ...args){
        String a;
        int repete[] = new int[26];
        
        Scanner scan = new Scanner(System.in);
        a = scan.next();
        for (int i=0;i<26;i++)
            repete[i]=0;
        
        for (int i=0;i<a.length();i++){
            switch (a.charAt(i)){
                case 'a': repete[0]++; break;
                case 'b': repete[1]++; break;
                case 'c': repete[2]++; break;
                case 'd': repete[3]++; break;
                case 'e': repete[4]++; break;
                case 'f': repete[5]++; break;
                case 'g': repete[6]++; break;
                case 'h': repete[7]++; break;
                case 'i': repete[8]++; break;
                case 'j': repete[9]++; break;
                case 'k': repete[10]++; break;
                case 'l': repete[11]++; break;
                case 'm': repete[12]++; break;
                case 'n': repete[13]++; break;
                case 'o': repete[14]++; break;
                case 'p': repete[15]++; break;
                case 'q': repete[16]++; break;
                case 'r': repete[17]++; break;
                case 's': repete[18]++; break;
                case 't': repete[19]++; break;
                case 'u': repete[20]++; break;
                case 'v': repete[21]++; break;
                case 'w': repete[22]++; break;
                case 'x': repete[23]++; break;
                case 'z': repete[24]++; break;
                case 'y': repete[25]++; break;
            }
        }
        int maior = 0, maiori=0,count=0;
         for (int i=0;i<26;i++){
            
                if(repete[i]>=maior){
                    
                    maior = repete[i];
                    maiori=i;
                }
            }
        
       if(maior==a.length()) System.out.println(1);
        else System.out.println(fatorial(a.length(),repete));
     
        
    }
   
    static long fatorial(int a, int repete[]){
        Scanner scan = new Scanner(System.in);
        int maior = 0, maiori=0,count=0,indiceMaior=0;
        if(a>1){
            
            for (int i=0;i<26;i++){
            
                if(repete[i]>=maior){
                    
                    maior = repete[i];
                    maiori=i;
                }
            }
            repete[maiori]=1; 
            long k[] = new long[a+1];
            
            long acumu1=1,acumu2=1; 
            
            for (int i=0;i<=a;i++) k[i]=i;
            k[0]=1;
            //até aqui está correto e igual ao algoritmo do corretor
            for(int i=maior; i>=0;i--) k[i]=1;
            
            
            
            System.out.println("Começo a fatorar daqui : "+ (maior+1)+" até tamanho total "+a);
            
            //encontrar o novo maior para tentar zerá-lo
            for (int j=0;j<26;j++){
                if(repete[j]>repete[indiceMaior]){
                    indiceMaior = j;
                }
            }
            //só vou fatorar o próximo, quando zerar o primeiro ou o repete
            int ini = maior+1;
            while (k[ini] < 2 && repete[indiceMaior] < 2){
                
                //cortanto primeiro os maiores não funciona...agora vou experimentar cortando primeiro os menores
                
                int fator=2;
                System.out.println("Próximo a reduzir no k "+ ini+ "indice do próximo a reduzir no repete " + indiceMaior+ " valor a reduzir: "+ repete[indiceMaior]);  
                //se fator ficar maior que um desses, não da pra fazer a fatoração
                if((repete[indiceMaior]%fator==0) && (k[ini]%fator==0)){
                
                    while((repete[indiceMaior]%fator==0) && (k[ini]%fator==0)){
                        k[ini]=k[ini]/fator;
                        repete[indiceMaior] = repete[indiceMaior]/fator;
                        while((repete[indiceMaior]%fator!=0) && (k[ini]%fator!=0) && (fator<=repete[indiceMaior]) && (fator<=k[ini]) ){
                            fator++;
                            if((fator==repete[indiceMaior]) || (fator==k[ini])){
                                if((repete[indiceMaior]%fator==0) && (k[ini]%fator==0)) break;
                                else{
                                    fator=2;
                                    //procuro outro repete
                                    if(k[ini]>1 && repete[indiceMaior]<2){
                                        for (int j=0;j<26;j++){
                                            if(repete[j]>repete[indiceMaior]){
                                                indiceMaior = j;
                                            }
                                        }
                                    }
                                    //procuro outro k[ini]
                                    if(k[ini]<2 && repete[indiceMaior]>1){
                                        while(k[ini]==1 && k[ini]<=a) ini++ ;
                                    }
                                    if(k[ini]>1 && repete[indiceMaior]>1){
                                        for (int j=0;j<26;j++){
                                            if(repete[j]>repete[indiceMaior]){
                                                indiceMaior = j;
                                            }
                                        }
                                    
                                    }
                                }
                            
                            }
                            
                            
                        }
                    }
                }
                else{
                    while((repete[indiceMaior]%fator!=0) && (k[ini]%fator!=0) && (fator<=repete[indiceMaior]) && (fator<=k[ini]) ){
                        fator++;
                        while((repete[indiceMaior]%fator==0) && (k[ini]%fator==0)){
                            k[ini]=k[ini]/fator;
                            repete[indiceMaior] = repete[indiceMaior]/fator;
                        }                    
                    }
                }
                //tentei de tudo nesse conjunto ini/indiceMaior
                System.out.println("Tentei de tudo neste conjunto: indice k "+ini+"  restou "+k[ini]+" repete inidice "+ inidiceMaior+" sobrou "+repete[indiceMaior] );
                //procuro outro repete
                if(k[ini]>1 && repete[indiceMaior]<2){
                    for (int j=0;j<26;j++){
                        if(repete[j]>repete[indiceMaior]){
                            indiceMaior = j;
                        }
                    }
                }
                //caso não exista repete maior 1, acabou
                if(repete[indiceMaior]<2) break;
                
                //procuro outro k[ini]
                if(k[ini]<2 && repete[indiceMaior]>1){
                    while(k[ini]==1 && k[ini]<=a) ini++ ;
                }
                //se não existe k[ini]>1, acabou
                if(k[ini]<2) break;
                
                if(k[ini]>1 && repete[indiceMaior]>1)
                
                
                //buscar próximos a tentar
                
                
                
                
                
                //segundo conjunto de reduções;
            
        for(int i=0;i<26;i++) System.out.print("/"+repete[i]);
            System.out.println("#################################### \n");
            long result = 1;
            for(int i=0;i<=a;i++) {result=((result%1000000007)*(k[i]%1000000007)%1000000007);
                System.out.println(k[i]);
            }
            return result;
            
                /*if(repete[j]>1){
                    int reduzir[] = new int[repete[j]];
                        for (int i=reduzir.length;i>0;i--){
                            //reduzir[1]=2 . leve em consideração, abaixo
                            reduzir[i-1]=i;
                        }
                */
                
                        
                         /*   
                            
                            
                            acumu1 = ((acumu1%1000000007)*(k[u]%1000000007)%1000000007);
                            
                            System.out.println("Acumu antes de reduzir acumu1 :"+acumu1);
                            if(acumu1>1){
                                //System.out.println(u);
                                acumu2 = ((acumu2%1000000007)*(reduzir[t]%1000000007)%1000000007);
                                
                                
                               
                                
                                
                                while(t<(reduzir.length-1)){
                                    if(acumu2>acumu1) break;
                                    System.out.println(acumu2+"//"+reduzir[t]+"//"+t);
                                   
                                   
                                    if(acumu2<10){
                                        while((acumu2<10) && (t<(reduzir.length-1))){
                                        
                                                t++;
                                                
                                                acumu2 = ((acumu2%1000000007)*(reduzir[t]%1000000007)%1000000007);
                                                
                                        }
                                    }
                                    else t++;
                                    
                                    System.out.println("Acumu antes de reduzir acumu2 :"+acumu2);
                                    
                                    if(acumu2>1){//quer dizer que tenho, pelo menos o 2 para reduzir
                                        fator=2;
                                        
                                        if(acumu1<10000 && acumu2<10000){
                                            while(fator<=acumu1){
                                            
                                                if(acumu1%acumu2==0){
                                                    acumu1=acumu1/acumu2;
                                                    acumu2=1;
                                                    break;
                                                }
                                                else{
                                                    while((acumu1%fator==0 && acumu2%fator==0) ){
                                                    // System.out.println("vai reduzir: "+k[u]+" e "+reduzir[t]);
                                                        acumu1 = acumu1/fator;
                                                        acumu2 = acumu2/fator;
                                                    }
                                                    fator++;
                                                }
                                            }
                                        }
                                        else{
                                            while(fator<= Math.sqrt(acumu1) && fator<=acumu2){
                                                if(acumu1%acumu2==0){
                                                    acumu1=acumu1/acumu2;
                                                    acumu2=1;
                                                    break;
                                                }
                                                else{
                                                    while((acumu1%fator==0 && acumu2%fator==0) ){
                                                    // System.out.println("vai reduzir: "+k[u]+" e "+reduzir[t]);
                                                        acumu1 = acumu1/fator;
                                                        acumu2 = acumu2/fator;
                                                    }
                                                    fator++;
                                                }
                                            }
                                    }
                                }
                                
                             System.out.println("depois de dividir:"+acumu1+"/"+ acumu2);
                            } System.out.println(acumu1+" / "+acumu2);
                        }
                    }
                }
            }
           
       
        //não houve repetição de palavra
        if(acumu1==1 && acumu2==1){
            for (int u=maior; u<=a;u++){
                acumu1 = ((acumu1%1000000007)*(k[u]%1000000007)%1000000007);
            }
            
        
        }
        System.out.println("#####################################");
        System.out.println(acumu1+" / "+acumu2);
        return acumu1/acumu2;
        
                /*
                for (int u=a; u>maior;u--){
                    //pode já ter sido reduzido
                    if(k[u]>1){
                        //System.out.println(u);
                        for (int t=(reduzir.length-1);t>0;t--){
                            if(reduzir.length>1){//quer dizer que tenho, pelo menos o 2 para reduzir
                                fator=2;
                                while(fator<= Math.sqrt(k[u]) && fator<=reduzir.length ){
                                    if(k[u]%reduzir[t]==0){
                                        k[u]=k[u]/reduzir[t];
                                        reduzir[t]=1;
                                        break;
                                    }
                                    else{
                                        if(k[u]%fator==0 && reduzir[t]%fator==0){
                                           // System.out.println("vai reduzir: "+k[u]+" e "+reduzir[t]);
                                            k[u] = k[u]/fator;
                                            reduzir[t] = reduzir[t]/fator;
                                            fator++;
                                           // System.out.println("sobrou: "+k[u]+" e "+reduzir[t]);
                                        }
                                        else fator++;
                                    }
                                }
                            }
                        }
                       // System.out.println(k[u]+"/"+ repete[j]);
                    }
                }
        */
       }
       else return 1;
            
    }
}
