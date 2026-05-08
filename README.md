# 🐾 Herança em Java com Encadeamento de Construtores

Este projeto demonstra de forma prática os conceitos de **Herança**, **Polimorfismo** e **Sobrescrita de Métodos** em Java, utilizando uma hierarquia simples de animais.

A aplicação mostra como subclasses podem reutilizar comportamentos da superclasse, personalizar métodos e utilizar o encadeamento de construtores com `super()` para inicialização correta dos objetos.

---

# 📂 Estrutura do Projeto

## `Main.java`

Classe principal responsável por criar os objetos e executar os métodos das diferentes classes através do polimorfismo.

Também contém o método `doAnimalStuff`, que recebe qualquer objeto do tipo `Animal`.

---

## `Animal.java`

Superclasse base do sistema.

Define atributos e comportamentos genéricos compartilhados por todos os animais.

### Atributos:

* `type`
* `size`
* `weight`

### Métodos:

* `move()`
* `makeNoise()`

---

## `Dog.java`

Subclasse que herda de `Animal`.

Adiciona características específicas de cães e sobrescreve comportamentos da superclasse.

### Atributos adicionais:

* `earShape`
* `tailShape`

### Conceitos aplicados:

* Uso de `super()`
* Sobrescrita de métodos
* Especialização de comportamento

---

## `Fish.java`

Subclasse derivada de `Animal`.

Representa peixes com características próprias e redefine a forma de movimentação.

### Atributos adicionais:

* `gills`
* `fins`

---

# 🧠 Conceitos Demonstrados

## 🔹 Herança

As classes `Dog` e `Fish` reutilizam atributos e métodos da classe `Animal`.

---

## 🔹 Encadeamento de Construtores

Uso de `super()` para inicializar corretamente os atributos herdados da superclasse.

Exemplo:

```java
super(type, size, weight);
```

---

## 🔹 Sobrescrita de Métodos (Override)

As subclasses redefinem métodos da classe pai para criar comportamentos específicos.

Exemplo:

```java
@Override
public void makeNoise() {
    System.out.println("woof!");
}
```

---

## 🔹 Polimorfismo

O método recebe um objeto do tipo `Animal`, mas consegue trabalhar com qualquer subclasse.

```java
public static void doAnimalStuff(Animal animal, String speed)
```

---

# 🚀 Exemplo de Execução

```java
public static void main(String[] args) {

    Animal animal = new Animal("Generic Animal", "Huge", 400);
    doAnimalStuff(animal, "slow");

    Dog dog = new Dog();
    doAnimalStuff(dog,"fast");

    Dog yorkie = new Dog("Yorkie", 15);
    doAnimalStuff(yorkie, "fast");

    Dog retriver = new Dog(
            "Labrador Retriver",
            65,
            "Floppy",
            "Swimmer");

    doAnimalStuff(retriver, "slow");

    Dog wolf = new Dog("Wolf", 40);
    doAnimalStuff(wolf, "slow");

    Fish goldie = new Fish("Goldfish", 0.25, 2, 3);
    doAnimalStuff(goldie, "fast");
}
```

---

# 💻 Saída Esperada

```txt
Generic Animal makes this animal make noise
Generic Animal moves slow

{ type='Generic Animal', size='Huge', weight='400.0' }

woof!
Dog running
woof!

{ earShape='Perky', tailShape='Curled'}
{ type='mutt', size='Big', weight='50.0' }
```

---

# ⚙️ Como Executar

## 1️⃣ Clone o repositório

```bash
git clone https://github.com/seu-usuario/inheritance-java.git
```

---

## 2️⃣ Compile os arquivos

```bash
javac Main.java Animal.java Dog.java Fish.java
```

---

## 3️⃣ Execute o programa

```bash
java Main
```

---

# 📚 Objetivo do Projeto

Este projeto foi criado com foco em aprendizado e prática dos pilares da Programação Orientada a Objetos em Java.

Ideal para:

* estudantes iniciantes em Java
* prática de POO
* revisão de herança e polimorfismo
* portfólio/GitHub

---

# 🤝 Contribuição

Contribuições são bem-vindas!

Caso queira melhorar o projeto, adicionar novos exemplos ou otimizar o código, fique à vontade para abrir um Pull Request.

---

# 👨‍💻 Tecnologias Utilizadas

* Java
* Programação Orientada a Objetos (POO)
* IntelliJ IDEA / VS Code (opcional)
