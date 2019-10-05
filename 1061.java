import java.util.Scanner;

class Main{
public static void main(String ... args){
    String sda, sha,sma,ssa,sdf, shf,smf,ssf;
    int  da,ha,ma,sa,df,hf,mf,sf, qtdD=0,qtdH, qtdM,qtdS;
    Scanner scan = new Scanner(System.in);
    scan.next(); sda = scan.next(); sha = scan.next();
    scan.next(); sma = scan.next(); scan.next(); ssa = scan.next();
    scan.next(); sdf = scan.next(); shf = scan.next();
    scan.next(); smf = scan.next(); scan.next(); ssf = scan.next();
   
    da = Integer.parseInt(sda);
    df = Integer.parseInt(sdf);
      
    ha=Integer.parseInt(sha);
    ma=Integer.parseInt(sma);
    sa=Integer.parseInt(ssa);
    
    hf=Integer.parseInt(shf);
    mf=Integer.parseInt(smf);
    sf=Integer.parseInt(ssf);
    
    
    if(da==df){
    
        qtdD = df-da;
        
        if(sa>sf){
            qtdS = 60-sa+sf;
        
            if(ma>mf){
                qtdM = 60-ma+mf-1;
                if(hf==ha) qtdH = hf-ha;
                else qtdH = hf-ha-1;
            }
            else{
                if(mf==ma){
                    qtdM = mf - ma;
                    qtdH = hf-ha;
                }
                else{
                    qtdM = mf - ma-1;
                    qtdH = hf-ha;
                }
            }
        }
        else {
            qtdS = sf-sa;
            if(ma>mf){
                qtdM = 60-ma+mf;
                if(hf==ha) qtdH = hf-ha;
                else qtdH = hf-ha-1;
            }
            else {
                qtdM = mf - ma;
                qtdH = hf-ha;
           }
        }
        
    }
    else {
        if(sa>sf){
            qtdS = 60-sa+sf;
            
            if(ma>mf){
                qtdM = 60-ma+mf-1;
                if(ha>hf){
                    qtdH = 24-ha+hf-1;
                    qtdD = df-da-1;
                }
                else {
                    if(hf==ha) {qtdH = 23; qtdD = df-da-1;}
                    else {qtdH = hf-ha-1; qtdD=df-da;}
                }
            }
            else {
                if(mf==ma){
                
                    qtdM = mf - ma;
                    if(ha>hf){
                        qtdH = 24-ha+hf;
                        qtdD = df-da-1;
                    }
                    else qtdH = hf-ha;
                } 
                else{
                    qtdM = mf - ma-1;
                    if(ha>hf){
                        qtdH = 24-ha+hf;
                        qtdD = df-da-1;
                    }
                    else qtdH = hf-ha;
                }
            }
            
        }
        else {
            qtdS = sf-sa;
            if(ma>mf){
                qtdM = 60-ma+mf;
                if(ha>hf){
                    qtdH = 24-ha+hf-1;
                    qtdD = df-da-1;
                }
                else {
                    if(hf==ha) {qtdH = 23;qtdD = df-da-1;}
                    else {qtdH = hf-ha-1;qtdD = df-da;}
                
                }
            }
            else {
                qtdM = mf - ma;
                if(ha>hf){
                    qtdH = 24-ha+hf;
                    qtdD = df-da-1;
                }
                else {qtdH = hf-ha;qtdD = df-da;}
            }
        }
    
   }
    
   
    System.out.println(qtdD+" dia(s)"+"\n"+
                        qtdH+" hora(s)"+"\n"+
                        qtdM+" minuto(s)"+"\n"+
                        qtdS+" segundo(s)");
    
}}
