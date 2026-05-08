Inheritance em Java com Encadeamento de Construtores
Este repositório demonstra conceitos de herança e polimorfismo em Java, utilizando classes que representam diferentes tipos de animais.
O exemplo mostra como subclasses podem herdar atributos e métodos da superclasse, sobrescrevê-los e ainda encadear construtores para inicialização adequada.

Estrutura do Projeto
Main.java  
Classe principal que instancia objetos de diferentes tipos (Animal, Dog, Fish) e executa métodos comuns através de polimorfismo.

Animal.java  
Superclasse que define atributos básicos (type, size, weight) e comportamentos genéricos (move, makeNoise).

Dog.java  
Subclasse que herda de Animal, adiciona atributos (earShape, tailShape), sobrescreve métodos e utiliza encadeamento de construtores com super().

Fish.java  
Subclasse que herda de Animal, adiciona atributos (gills, fins) e redefine o comportamento de movimento.

Conceitos Demonstrados
Herança:
Dog e Fish herdam de Animal, reutilizando atributos e métodos.

Encadeamento de Construtores:
Uso de super() em Dog e Fish para inicializar corretamente os atributos da superclasse.

Sobrescrita de Métodos (Override):
Métodos como makeNoise e move são redefinidos nas subclasses para comportamentos específicos.

Polimorfismo:
O método doAnimalStuff recebe um parâmetro do tipo Animal, mas pode executar ações em qualquer objeto que herde dessa classe.

Exemplo de Execução
java
public static void main(String[] args) {
    Animal animal = new Animal("Generic Animal", "Huge", 400);
    doAnimalStuff(animal, "slow");

    Dog dog = new Dog();
    doAnimalStuff(dog,"fast");

    Dog yorkie = new Dog("Yorkie", 15);
    doAnimalStuff(yorkie, "fast");

    Dog retriver = new Dog("Labrador Retriver", 65, "Floppy", "Swimmer");
    doAnimalStuff(retriver, "slow");

    Dog wolf = new Dog("Wolf", 40);  
    doAnimalStuff(wolf, "slow");     

    Fish goldie = new Fish("Goldfish", 0.25, 2, 3);
    doAnimalStuff(goldie, "fast");
}
Saída esperada (trecho)
Code
Generic Animal makes this animal make noise
Generic Animal moves slow
{ type='Generic Animal', size='Huge', weight='400.0' }
_ _ _ _

woof
Dog running
woof
{ earShape='Perky', tailShape='Curled'}{ type='mutt', size='Big', weight='50.0' }
_ _ _ _
Como Executar
Clone o repositório:

bash
git clone https://github.com/seu-usuario/inheritance-java.git
Compile os arquivos:

bash
javac Main.java Animal.java Dog.java Fish.java
Execute o programa:

bash
java Main
Contribuição
Contribuições são bem-vindas.
Sugestões de melhorias, exemplos adicionais ou explicações complementares podem ser enviadas via pull request.
