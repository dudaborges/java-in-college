public class Main{
    public static void main(String[] args){
        Livro livro1 = new Livro();

        livro1.cadastrarLivro("De Volta aos Quinze", "Bruna Vieira", 230);

        System.out.print(livro1.toString());
    }
}