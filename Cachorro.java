public class Cachorro extends Animal {
public Cachorro (String nome, int idade){
super(nome, idade);
}

@override // 
public void emitirSom(){ // metodo abstrato
System.out.println(“Latido”);
}
}
