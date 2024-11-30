# Cenário 1 - Scenery1: Árvore Genealógica

## Descrição

O Cenário 1(**Scenery1**) tem como objetivo construir e imprimir na tela a árvore genealógica de uma pessoa, com seus cônjuges, filhos e descendentes. A estrutura é implementada em Java, fazendo uso de recursão para exibição dos dados. É possível adicionar novos membros à árvore genealógica dinamicamente.


---

## Funcionalidades

- addChild(): adiciona um filho
- addSpouse(): adiciona um cônjuge
- printFamilyTree(): imprime a árvore genealógica na tela

---

## Estrutura do Projeto

O projeto segue a seguinte organização:

## Classes Principais

### `Person`
- Representa uma pessoa na árvore genealógica.
- **Atributos**:
    - `name`: Nome da pessoa.
    - `spouse`: Referência ao cônjuge.
    - `parent`: Referência ao pai/mãe.
    - `children`: Lista de filhos.
- **Métodos**:
    - `addChild(Person child)`: Adiciona um filho.
    - `spouse(Person spouse)`: Define o cônjuge.
    - `printFamilyTree(int level)`: Imprime a árvore genealógica com recuo indicando o nível na hierarquia.

### `main`
- Classe principal para execução do programa.
- **Função**:
    - Início da aplicação onde é criada a árvore genealógica e impressa na tela.
---

## Exemplo de Saída

```plaintext
Lily -- Married to: Wilhelm -- Children:
    Opa -- Married to: Oma -- Children:
        Reinhold -- Married to: Sonia -- Children:
            Christian
              -- Married to: Monica
              -- Children:
                Oscar
                Lorena
            Gabrielle
            Sabine
        Wilma
          -- Married to: Rodolfo
          -- Children:
            Ricardo
              -- Married to: Debora
            Rodrigo
        Sigrid
          -- Married to: Peter
          -- Children:
            Martin
              -- Married to: Carla
              -- Children:
                Nicolas
            Thomas
            Claudia
```

# Scenery2: Roda-Gigante

## Descrição

O **Scenery2** tem como objetivo gerenciar uma roda-gigante composta por 18 gôndolas. Cada gôndola possui capacidade limitada e segue regras específicas para o embarque, como a exigência de que crianças menores de 12 anos só podem entrar acompanhadas por seus pais.

---

## Funcionalidades

- **board()**: Permite que um grupo de pessoas entre em uma gôndola, verificando as restrições de idade e acompanhamento.
- **status()**: Exibe o estado atual da roda-gigante, mostrando quais pessoas estão em cada gôndola.
- **findGondola()**: Localiza uma gôndola pelo número.

---

## Estrutura do Projeto

### Classes Principais

#### `Person`
- Classe base para representar uma pessoa.
- **Atributos**:
  - `name`: Nome da pessoa.
  - `age`: Idade da pessoa.

---

#### `Adult` (herança de `Person`)
- Representa um adulto.

---

#### `Child` (herança de `Person`)
- Representa uma criança.
- **Atributos**:
  - `father`: Referência para o pai.

---

#### `Gondola`
- Representa uma gôndola da roda-gigante.
- **Atributos**:
  - `num`: Número da gôndola.
  - `seat1`: Primeiro assento.
  - `seat2`: Segundo assento.
- **Métodos**:
  - `addPassenger(Person passenger)`: Adiciona um passageiro à gôndola.
  - `getSeat1`: Retorna o primeiro assento.
  - `getSeat2`: Retorna o segundo assento.
  - `isFull()`: Verifica se a gôndola está cheia.
---

#### `FerrisWheel`
- Gerencia todas as gôndolas e regras de entrada na roda-gigante.
- **Atributos**:
  - `gondolas`: Lista de gôndolas.
- **Métodos**:
  - `board(int gondolaNum, Person... persons)`: Verifica e permite que pessoas entrem na gôndola.
  - `status()`: Exibe o status atual da roda-gigante.
  - `findGondola(int gondolaNum)`: Retorna uma gôndola pelo número.

---

#### `Main`
- Classe principal para execução do programa.
- **Função**:
  - Início da aplicação onde é criada a o sistema da roda-gigante e realizadas operações de embarque e exibição do status.
---

## Exemplo de Saída

```plaintext
Gondola status
-----------------------------------
1 (empty)
2 Joao and Paulo
3 Only Maria
4 (empty)
5 (empty)
6 (empty)
7 (empty)
8 (empty)
9 (empty)
10 (empty)
11 (empty)
12 (empty)
13 Only Pedro
14 (empty)
15 (empty)
16 (empty)
17 (empty)
18 (empty)
-----------------------------------
```