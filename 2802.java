import java.util.Scanner;
import java.lang.Math;

class Main{
    public static void main(String ... agrs){
        long n;
        long result=1l, part1=1l,part2=1l;
        boolean foiN=false; 
        
        Scanner scan = new Scanner(System.in);
        n = scan.nextLong();
         int t=1;
        if(n>100){
            if(n%2==0){
                part1 = (n/2l)*(n-1l) +1l;
            }
            else{
                part1 = (n)*((n-1l)/2l) +1l;
            }
            
            long v[] = new long[4];
            v[0]=n;
            v[1] = n-1;
            v[2] = n-2;
            v[3] = n-3;
            int fator = 2;
            int denominador = 4*3*2;
            while (denominador != 1){
                int i = 0;
                while(denominador%fator!=0) fator++;
                while(v[i]%fator!=0) {i++;}
                while (v[i]%fator==0 && denominador%fator ==0){
                    denominador = denominador/fator;
                    v[i] = v[i]/fator;
                }
            }
           // System.out.println(v[0]+"/"+v[1]+"/"+v[2]+"/"+v[3]+ "/" + (v[0]*v[1])+ "/" + (v[0]*v[1]*v[2])+  "/" + (v[0]*v[1]*v[2]*v[3])+ "/"+Long.MAX_VALUE);
            part2 = v[0]*v[1]*v[2]*v[3];
            result = part1+part2;
            
        }
        else {
            if(n>5) result =1+ (n*(n-1))/2 + (n*(n-1)*(n-2)*(n-3))/(2*3*4);
            else result = (long) Math.pow(2,n-1);
            
        }
        System.out.println(result);
    
    }

}
