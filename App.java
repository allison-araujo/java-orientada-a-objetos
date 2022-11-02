

public class App {

    public static void main(String[] args) {
        System.out.println("Aprendendo Poo com java");

        //Que estou instanciando uma classe, construindo um objeto;
        Pessoa pessoa1 = new  Pessoa();
               
        pessoa1.setNome("Fulano"); 
        pessoa1.setIdade(21);

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());

       

    }
}