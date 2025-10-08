public class App{
    public static void main(String[] args) throws Exception{
        Cachorro c1 = new Cachorro(nome: "Thor", idade: 4);
        Gato g1 - new Gato(nome:"Xani", idade: 1);

        c1.emitirSom();
        g1.emitirSom();
        g1.brincar();

        Animal a = new Cachorro(); //cachorro ta dentro do animal
        //Animal a = new Animal(); NAO PODE FAZER ISSO PQ É UMA CLASSE ABSTRATA SUA BURRA
    }
}