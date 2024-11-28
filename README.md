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