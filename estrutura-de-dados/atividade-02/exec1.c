// 1- Qual o valor de y no final do programa? 

#include <stdio.h>  
main() {  
int y, *p, x;  
y = 0;  
p = &y;  
x = *p;  
x = 4;  
++(*p);  
x–;  
(*p) += x++;  
printf (“y = %d\n”, y);  
}

// RESPOSTA: valor final de y será 4.
