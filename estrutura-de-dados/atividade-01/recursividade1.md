## Exemplo em C: Potência (recursão)

```c
#include <stdio.h>

int potencia(int x, int y) {
    if (y == 0) {
        return 1;
    } else {
        return potencia(x, y - 1) * x;
    }
}

int main(void) {
    int x = 0;
    int y = 0;

    printf("Digite a base: ");
    scanf("%d", &x);

    printf("Digite o expoente: ");
    scanf("%d", &y);

    printf("Resultado: %d", potencia(x, y));

    return 0;
}
```
