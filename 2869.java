

import java.util.Scanner;
import java.lang.Math;

class Main{
    public static void main (String ... args){
        int n,a[],b[] ,div=0, inib=0, ultimo=0,aux=0;
        int p2=0,p3=0,p5=0,p7=0,p11=0,p13=0,p17=0,p19=0,p23=0,p29=0,p31=0,p37=0,p41=0, p43=0,p47=0, p53=0;
        b = new int[101];
        
       
        
        Scanner scan = new Scanner(System.in);
        
       n = scan.nextInt();
       a = new int[n];
       for (int i = 0; i<n;i++){
            a[i] = scan.nextInt();
        }
        b[1]=1; b[2]=2; b[3]=4; b[4]=6; b[5]=16; b[6]=12; b[7]=64;
        b[8]=24; b[9]=36; b[10]=48; b[11]=1024; b[12]=60; b[13]=4096;
        b[14]=192; b[15]=144;b[16]=120;b[17]=65536; b[18]=180;b[100]=45360;
        b[99]=230400;b[98]=233280;b[97]=873523211;b[96]=27720;
        b[90]=25200;b[91]=2985984;b[92]=62914560;b[93]=663676353;b[94]=231055250;b[95]=21233664;
        
        b[19]=262144;
        b[23]=4194304;
        b[29]=268435456;
        b[31]=73741817; b[37]=719476260;b[30]=720;b[32]=840;b[33]=9216;b[34]=196608;b[35]=5184;b[36]=1260;b[38]=786432;b[39]=36864;
        b[41]=511620083; b[43]=46480318;b[47]=743685088;b[40]=1680;b[42]=2880;b[44]=15360;b[45]=3600;b[46]=12582912;b[48]=2520;b[49]=46656;
        b[53]=595845303; b[59]=134099126; b[50]=6480;b[51]=589824;b[52]=61440;b[54]=6300;b[55]=82944;b[56]=6720;b[57]=2359296;b[58]=805306368;
        b[61]=536396504;b[67]=329376018; b[60]=5040;b[62]=221225451;b[63]=14400;b[64]=7560;b[65]=331776;b[66]=46080;b[68]=983040;b[69]=37748736;
        b[71]=270016253; b[73]=80065005; b[79]=124160285; b[70]=25920;b[72]=10080; b[74]=158428766;b[75]=32400;b[76]=3932160;b[77]=746496;b[78]=184320;
        b[83]=986564553; b[89]=140130951;b[80]=15120;b[81]=44100;b[82]=534860242;b[84]=20160;b[85]=5308416;b[86]=139440954;b[87]=415919090;b[88]=107520;
        
       // for (int i=14;i<101;i++){b[i]=0;}
        
        for (int i = 0; i<n;i++){
            int j=0;
            if(b[a[i]]!=0){
                System.out.println(b[a[i]]%1000000007);
            }
            else{
            
                       
                aux = 2*a[i];
                
                do{
                    j=aux;
                    //System.out.println(j);
                    while(j%53==0){
                        p53++;
                        j = j/53;
                    }
                     while(j%47==0){
                        p47++;
                        j = j/47;
                    }
                    while(j%43==0){
                        p43++;
                        j = j/43;
                    }
                     while(j%41==0){
                        p41++;
                        j = j/41;
                    }
                    while(j%37==0){
                        p37++;
                        j = j/37;
                    }
                     while(j%31==0){
                        p31++;
                        j = j/31;
                    }
                    while(j%29==0){
                        p29++;
                        j = j/29;
                    }
                     while(j%23==0){
                        p23++;
                        j = j/23;
                    }
                     while(j%19==0){
                        p19++;
                        j = j/19;
                    }
                     while(j%17==0){
                        p17++;
                        j = j/17;
                    }
                     while(j%13==0){
                        p13++;
                        j = j/13;
                    }
                     while(j%11==0){
                        p11++;
                        j = j/11;
                    }
                    while(j%7==0){
                        p7++;
                        j = j/7;
                    }
                     while(j%5==0){
                        p5++;
                        j = j/5;
                    }
                    while(j%3==0){
                        p3++;
                        j = j/3;//System.out.println("entrou 3");
                    }
                     while(j%2==0){
                        p2++;
                        j = j/2;//System.out.println("entrou 2");
                       // System.out.println(aux);
                    }
                    
                    div = (p2+1)*(p3+1)*(p5+1)*(p7+1)*(p11+1)*(p13+1)*(p17+1)*(p19+1)*(p23+1)*(p29+1)*
                    (p31+1)*(p37+1)*(p41+1)*(p47+1)*(p53+1);
                   
                    
                    if(div!=a[i]){
                        aux++;
                        p2=0;p3=0;p5=0;p7=0;p11=0;p13=0;p17=0;p19=0;p23=0;p29=0;p31=0;p37=0;p41=0; p43=0;p47=0; p53=0;
                    }
                   
                }while(div!=a[i]);
                
                System.out.println(aux%1000000007);
            }
        }
    }

}

/*
 do{
                    for (int k=1;k<=j;k++){
                        if(j%k==0) div++;
                    }
                    if(b[ultimo+1]>j && ((ultimo+1)==div)) {
                        ultimo++;
                        b[ultimo]=j;
                       
                        if(div<a[i]){
                            div = 0;
                            j++;
                        }
                        else break;
                         
                        
                    }
                    if(div<a[i]||div>a[i]){
                            div = 0;
                            j++;
                    }
                        
                } while(div!=a[i]);
                 System.out.println(j%1000000007+"/"+div);
             
            } 
        
        }
*/

