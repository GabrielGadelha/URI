import java.util.Scanner;

class Main{
    public static void main(String arg[]){
    
        int hini, hfim, mini, mfim, durh=0, durm=0;
        
        Scanner s = new Scanner(System.in);
        
        hini = s.nextInt();
        mini = s.nextInt();
        hfim = s.nextInt();
        mfim = s.nextInt();
        
        if (hini == hfim){
            if (mini == mfim ){
                durh = 24; durm=0;
            }
            if(mfim > mini){
                durh = 0; durm= mfim - mini;
            
            }
            if(mini > mfim) {
                durh = 23; durm=60-mini+mfim;
            }
        }
        
        if (hini > hfim){
            if( mfim>mini){
                durh = 24 - hini +hfim;
                durm = mfim-mini;
            
            }
            if (mfim == mini){
                 durh = 24 - hini +hfim;
                durm = 60;
            }
            if( mfim<mini){
                durh = 24 - hini +hfim-1;
                durm = 60-mini+mfim;            
            }
        }
         if (hini < hfim){
            if( mfim>mini){
                durh = hfim-hini;
                durm = mfim-mini;
            
            }
            if (mfim == mini){
                durh = hfim-hini;
                durm = 60;
            }
            if( mfim<mini){
                durh = hfim-hini-1;
                durm = 60-mini+mfim;            
            }
        }
        System.out.println("O JOGO DUROU "+durh+" HORA(S) E "+durm+" MINUTO(S)");
    
    }

}
