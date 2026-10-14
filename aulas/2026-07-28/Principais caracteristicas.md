## Introdução
- Orientada a Objetos
- Trouxe avanços elegantes para problemas do C++ 
	- Alocação dinâmica de memória e ponteiros
- Write Once, Run anywhere:
	- Compilador gera bytecode
	- bytecode é executado pela Maquina Virtual Java (JVM)
	- Linguagem semi interpretada, combina compilação(Codigo fonte - bytecode) e interpretação(bytecode para codigo de máquina)

## Conceitos base

- 8 Tipos primitivos de dados

### Estruturas de decisão

- Bloco if, else if e else com suporte a operador lógico AND

```java
int i = 6;
    if (i > 10) {
        System.out.println("É maior");
    } else if(i == 6){
        System.out.println("É SEIS!");
    } else if (i < 10){
        System.out.println("É menor");
    } else {
    System.out.println("São iguais");
    }
    
```
- Operador ternario:

```java
//resultado = (condição) ? se verdade : se falso
String s = (hora > 12) ? "tarde" : "dia" ;
```

- Switch case tradicional, com lambda ou como uma expressão:

```java
//tradicional
switch (i) {
    case 1:
        System.out.println("Um");
        break;
    case 2:
        System.out.println("Dois");
        break;
    default:
        System.out.println("Outro");
    }
```
```java
//lambda
switch(i) {
    case 1 -> System.out.println("Um");
    case 2 -> System.out.println("Dois");
}
```
```java
//com atribuição

String s = switch (i){
    case 1 -> "Um";
    case 2 -> "Dois";
}
```
- Estruturas de repetição

```java
for (int i = 0; i < 10; i++){
    sout("i:"+i);
        }
```

```java 
int i =0;
while (i<10){
    sout("i:" + i);
    i++;
    }   
```
//do while

- Declaração de vetores
  - Unidimensional:
    ```java
     int[] vetor = new int[5]; //declara o tipo do dado (int) e dimensões do vetor ([] um par de colchete = uma dimensão) e depois o nome da variavel 'vetor'
        vetor [0] = 1; // valor do tipo int na posição 0
        vetor [4] = 20; //vaor do tipo int na posicao 4
        //inicializacao direta
    int[] pares = new int []{2,3,4,5};
     ```
  - Multidimensional (matriz):
  ```java
    int[][] vetorBidimensional = new int [2][2];
    vetorBidimensional [1][1] = 2;
    vetorBidimensional [1][2] = 2;
   
  ```










