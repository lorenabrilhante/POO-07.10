public class Gato extends Animal implements AnimalDomesticado{
public Gato (String nome, int idade){
super(nome, idade); //puxa os atributos da putra classe pra minha classe atual, isso tem haver com herança. fica dentro do construtor, pode ser usado em metodos tbm
}
public void emitirSom(){
    System.out.println("Miau");
}
public void brincar(){
    System.out.println("Brincando");
}
}