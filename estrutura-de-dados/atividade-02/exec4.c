// 4-Os programas (trechos de código) abaixo possuem erros. Qual(is)? Como deveriam ser?

// a)

void main() {
int x, *p;
x = 100;
p = x;
printf(“Valor de p: %d.\n”, *p);
}

// O erro está na linha 8, pois p é um ponteiro e deve receber o endereço de memória de x. O correto seria usar p = &x.

// b)

void troca (int *i, int *j) {
int *temp;
*temp = *i;
*i = *j;
*j = *temp;
}

/* 
A ideia dessa função é tentar trocar entre si os valores dos ponteiros, utilizando uma variável temporária na transição.
Porém foi utilizado incorretamente ao definir a variável temp como ponteiro, afinal ela é o intermediário para armazenar
o valor dos ponteiros, assim ela tentaria armazenar o endereço de memória do valor i, o que daria erro.
*/

// c)

char *a, *b;
a = “abacate”;
b = “uva”;
if (a < b)
printf (“%s vem antes de %s no dicionário”, a, b);
else
printf (“%s vem depois de %s no dicionário”, a, b);

/*
O erro está em if (a < b), pois essa comparação verifica apenas os endereços de memória dos ponteiros. Para comparar 
strings corretamente deve-se usar a função strcmp() da biblioteca <string.h>.
*/
