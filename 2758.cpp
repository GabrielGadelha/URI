#include <stdio.h>
#include <string>

int main(){
    float a1,b2;
    double c3,d4;
    
    
   while( scanf( "%f %f %lf %lf", &a1, &b2, &c3,&d4) == 4 ){
       printf("A = %.6f", a1); printf(", B = %.6f", b2); printf("\n");
       printf("C = %.6lf", c3); printf(", D = %.6lf", d4); printf("\n");
       printf("A = %.1f", a1); printf(", B = %.1f", b2); printf("\n");
       printf("C = %.1lf", c3); printf(", D = %.1lf", d4); printf("\n");
       printf("A = %.2f", a1); printf(", B = %.2f", b2); printf("\n");
       printf("C = %.2lf", c3); printf(", D = %.2lf", d4); printf("\n");
       printf("A = %.3f", a1); printf(", B = %.3f", b2); printf("\n");
       printf("C = %.3lf", c3); printf(", D = %.3lf", d4); printf("\n");
       printf("A = %.3E", a1); printf(", B = %.3E", b2); printf("\n");
       printf("C = %.3E", c3); printf(", D = %.3E", d4); printf("\n");
       printf("A = %.0f", a1); printf(", B = %.0f", b2); printf("\n");
       printf("C = %.0lf", c3); printf(", D = %.0lf", d4); printf("\n");
        
    }
}   
