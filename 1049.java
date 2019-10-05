import java.util.Scanner;

class Main{
    public static void main (String ... args){
        String p1,p2,p3;
        
        Scanner scan = new Scanner(System.in);
        
        p1 = scan.next();
        p2 = scan.next();
        p3 = scan.next();
        
        
        switch (returnIndex(p1, "vertebrado", "invertebrado")){
        
            case 0:
                 switch (returnIndex(p2, "ave", "mamifero")){
                    case 0:
                        switch (returnIndex(p3, "carnivoro", "onivoro")){
                            case 0: System.out.println("aguia"); break;
                            case 1: System.out.println("pomba");break;
                        } break;
                    case 1:
                        switch (returnIndex(p3, "onivoro", "herbivoro")){
                            case 0: System.out.println("homem"); break;
                            case 1: System.out.println("vaca");break;
                        } break;
                } break;
            case 1:
                switch (returnIndex(p2, "inseto", "anelideo")){
                    case 0:
                        switch (returnIndex(p3, "hematofago", "herbivoro")){
                            case 0: System.out.println("pulga"); break;
                            case 1: System.out.println("lagarta");break;
                        } break;
                    case 1:
                        switch (returnIndex(p3, "hematofago", "onivoro")){
                            case 0: System.out.println("sanguessuga"); break;
                            case 1: System.out.println("minhoca");break;
                        } break;
                } break;
        }
        
    
    }
     public static int returnIndex(String toIndex, String... args) {
        for (int i=0; i<args.length; i++) {
            if (toIndex.equals(args[i] ) ) 
                return i;
        }
        return -1;
    }

}
