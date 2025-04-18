# Cenário 1 - Scenery1: Árvore Genealógica

- **[Cenário 1: Árvore Genealógica](./scenery1)**

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
      Christian -- Married to: Monica -- Children: 
        Oscar -- Single 
        Lorena -- Single 
      Gabrielle -- Single 
      Sabine -- Single 
    Wilma -- Married to: Rodolfo -- Children: 
      Ricardo -- Married to: Debora
      Rodrigo -- Single 
    Sigrid -- Married to: Peter -- Children: 
      Martin -- Married to: Carla -- Children: 
        Nicolas -- Single 
      Thomas -- Single 
      Claudia -- Single 
```

# Scenery2: Roda-Gigante

- **[Cenário 2: Roda-Gigante](./scenery2)**

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
# Cenário 3 - Scenery3: Script SQL

- **[Cenário 3: Script SQL](./scenery3)**

## Descrição

O **Scenery3** tem como objetivo gerar um script SQL para criação de tabelas de dados em um banco de dados. O script é gerado a partir de classes Java que representam as tabelas e seus registros.

---

## Estrutura do Banco de Dados

### Tabela `Pessoa`

A tabela `Pessoa` armazena informações sobre uma pessoa que pode ser um adulto ou uma criança. Os atributos da tabela são:

- **`id`**: Identificador único da pessoa. Este campo é uma chave primária.
- **`name`**: Nome da pessoa.
- **`age`**: Idade da pessoa.
- **`father`**: Referência ao `id` do pai da pessoa. Caso a pessoa seja uma criança, este campo se referirá ao pai na mesma tabela.

#### Exemplo de estrutura:

```sql
CREATE TABLE Pessoa (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    age INT NOT NULL,
    father INT,
  
    CONSTRAINT fk_pessoa_pai FOREIGN KEY (father) REFERENCES Pessoa(id) ON DELETE SET NULL
);
```

### Tabela `Gondola`

A tabela `Gondola` armazena informações sobre as gôndolas da roda-gigante. Os atributos da tabela são:

- **`id`**: Identificador único da gôndola. Este campo é uma chave primária.
- **`num`**: Número da gôndola.
- **`seat1`**: Informa a pessoa do primeiro assento.
- **`seat2`**: Informa a pessoa do segundo assento.

#### Exemplo de estrutura:

```sql
CREATE TABLE Gondola (
    id INT AUTO_INCREMENT PRIMARY KEY,
    num INT NOT NULL,
    seat1 INT,
    seat2 INT,
  
    CONSTRAINT fk_gondola_pessoa1 FOREIGN KEY (seat1) REFERENCES Pessoa(id) ON DELETE SET NULL,
    CONSTRAINT fk_gondola_pessoa2 FOREIGN KEY (seat2) REFERENCES Pessoa(id) ON DELETE SET NULL
);
```

# **Cenário Extra - Scenery4: Contador de Emojis**

- **[Cenário Extra: Contador de Emojis](./scenery4)**

## **Descrição**

O **Cenário Extra** tem como objetivo analisar uma mensagem e classificar o sentimento expresso nela com base na contagem de diferentes tipos de emoticons. Os emoticons são usados para expressar emoções como felicidade e tristeza. A mensagem é classificada como **divertido**, **chateado** ou **neutro** com base na presença e quantidade desses emoticons.

---

## **Funcionalidades**

- **countEmotions(String message)**: Conta os diferentes tipos de emoticons presentes na mensagem e retorna o sentimento classificado.
- **Diversos tipos de emoticons**: Considera emoticons como:
  - `:-)` (felicidade)
  - `:-(` (tristeza)

---

## **Estrutura do Projeto**

### **Classes Principais**

#### `EmotionCounter`
- Classe responsável por contar os emoticons na mensagem e classificar a emoção.
- **Métodos**:
  - `countEmotions(String message)`: Conta os emoticons e classifica o sentimento.

#### `Main`
- Classe principal para execução do programa.
- **Função**:
  - Recebe uma mensagem do usuário e exibe o sentimento associado.

---

## **Exemplo de Saída**

```plaintext
Entrada: Eu estou tão feliz hoje :-)
Saída: divertido
```