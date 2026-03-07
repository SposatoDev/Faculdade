# Atividade — TAD (Tipo Abstrato de Dados)

## 1) O que é um Tipo Abstrato de Dados (TAD) e qual a característica fundamental na sua utilização?

Um **Tipo Abstrato de Dados (TAD)** é uma forma de definir um tipo de dado **pelo comportamento** (operações que podem ser realizadas) e **pela interface** (o que o usuário do tipo pode chamar), sem expor os detalhes internos de como ele é implementado.

**Característica fundamental:** **encapsulamento/abstração**.  
Ou seja, quem usa o TAD conhece **o que** ele faz (funções/operações) mas não precisa conhecer **como** ele faz (estrutura interna, variáveis, representação em memória).

---

## 2) Quais as vantagens de se programar com TADs?

Principais vantagens:

- **Organização e modularidade:** separa interface (uso) de implementação (detalhes internos).
- **Reutilização de código:** o TAD pode ser reutilizado em outros programas.
- **Facilidade de manutenção:** mudar a implementação interna não exige mudar quem usa o TAD, desde que a interface permaneça igual.
- **Redução de erros:** limita o acesso direto aos dados, evitando estados inválidos.
- **Mais clareza:** o código fica mais legível, pois expressa melhor a intenção (ex.: `depositar(conta, valor)`).

---

## 3) Crie um TAD que implemente o controle de uma conta bancária (inicializar, depositar, sacar e imprimir saldo)

A seguir um exemplo em C usando um TAD `ContaBancaria` com interface em `.h` e implementação em `.c`.

### Arquivo: `conta_bancaria.h`
```c
#ifndef CONTA_BANCARIA_H
#define CONTA_BANCARIA_H

typedef struct {
    int numero;
    char titular[100];
    double saldo;
} ContaBancaria;

/* Inicializa uma conta já existente (alocada pelo usuário) */
void conta_inicializar(ContaBancaria *c, int numero, const char *titular, double saldo_inicial);

/* Deposita um valor (assumindo valor > 0) */
void conta_depositar(ContaBancaria *c, double valor);

/* Saca um valor. Retorna 1 se conseguiu, 0 se não (saldo insuficiente/valor inválido). */
int conta_sacar(ContaBancaria *c, double valor);

/* Imprime os dados/saldo da conta */
void conta_imprimir(const ContaBancaria *c);

#endif
```

### Arquivo: `conta_bancaria.c`
```c
#include <stdio.h>
#include <string.h>
#include "conta_bancaria.h"

void conta_inicializar(ContaBancaria *c, int numero, const char *titular, double saldo_inicial) {
    c->numero = numero;
    strncpy(c->titular, titular, sizeof(c->titular) - 1);
    c->titular[sizeof(c->titular) - 1] = '\0';
    c->saldo = saldo_inicial;
}

void conta_depositar(ContaBancaria *c, double valor) {
    if (valor > 0) {
        c->saldo += valor;
    }
}

int conta_sacar(ContaBancaria *c, double valor) {
    if (valor <= 0) return 0;
    if (valor > c->saldo) return 0;

    c->saldo -= valor;
    return 1;
}

void conta_imprimir(const ContaBancaria *c) {
    printf("Conta: %d\n", c->numero);
    printf("Titular: %s\n", c->titular);
    printf("Saldo: R$ %.2f\n", c->saldo);
}
```

Exemplo simples de uso:

```c
#include <stdio.h>
#include "conta_bancaria.h"

int main(void) {
    ContaBancaria c;

    conta_inicializar(&c, 10, "Maria", 100.0);
    conta_depositar(&c, 50.0);

    if (!conta_sacar(&c, 200.0)) {
        printf("Saque não realizado (saldo insuficiente).\n");
    }

    conta_sacar(&c, 30.0);
    conta_imprimir(&c);

    return 0;
}
```

---

## 4) Utilizando alocação dinâmica de memória, crie uma função para criar uma nova conta bancária

Aqui criamos uma função que **aloca** uma nova conta com `malloc` e retorna um ponteiro para ela.

### Atualização no `conta_bancaria.h`
```c
#include <stdlib.h>

/* Cria (aloca) uma nova conta e inicializa. Retorna NULL se falhar. */
ContaBancaria* conta_criar(int numero, const char *titular, double saldo_inicial);

/* Libera a memória da conta criada dinamicamente */
void conta_destruir(ContaBancaria *c);
```

### Implementação no `conta_bancaria.c`
```c
#include <stdlib.h>
#include "conta_bancaria.h"

ContaBancaria* conta_criar(int numero, const char *titular, double saldo_inicial) {
    ContaBancaria *c = (ContaBancaria*) malloc(sizeof(ContaBancaria));
    if (c == NULL) return NULL;

    conta_inicializar(c, numero, titular, saldo_inicial);
    return c;
}

void conta_destruir(ContaBancaria *c) {
    free(c);
}
```

### Exemplo de uso com alocação dinâmica
```c
#include <stdio.h>
#include "conta_bancaria.h"

int main(void) {
    ContaBancaria *c = conta_criar(1, "João", 250.0);
    if (c == NULL) {
        printf("Erro ao alocar conta.\n");
        return 1;
    }

    conta_depositar(c, 100.0);
    conta_sacar(c, 50.0);
    conta_imprimir(c);

    conta_destruir(c);
    return 0;
}
```
