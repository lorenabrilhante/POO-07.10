public abstract class Animal { // 
private String nome;
private int idade;

public Animal (String nome, int idade){
this.nome = nome;
this.idade = idade;
}

public void dormir(){ //método concreto
System.out.println(“Dormindo”);
}

public abstract void emitirSom(){ //metodo abstrato

public String getNome(){
    return nome;
}
public int getIdade(){
    return idade;
}
public void setNome(String Nome){
    this.nome = nome;
}
public void setIdade(int idade){
    this.idade = idade;
}
}


