import java.util.Scanner;

class Main{
    public static void main (String ... args){
        int n,a[];
        String desc="";
        
        Scanner scan = new Scanner(System.in);
        
       n = scan.nextInt();
       a = new int[n];
       for (int i = 0; i<n;i++){
            a[i] = scan.nextInt();
        }
        for (int i = 0; i<n;i++){
            if(a[i]==0){ desc = "NULL";}
            else{
                if(a[i]%2==0)
                    desc = desc + "EVEN";
                else
                    desc = desc + "ODD";
                if(a[i]>0) desc = desc + " POSITIVE";
                if(a[i]<0) desc = desc + " NEGATIVE";
            }
            System.out.println(desc);
            desc = "";
        }
        
    
    }

}
