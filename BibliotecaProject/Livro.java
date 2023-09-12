public class Livro{
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setNumeroPaginas(int numeroPaginas){
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas(){
        return numeroPaginas;
    }

    public void cadastrarLivro(String titulo, String autor, int numeroPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String toString(){
        return String.format("Titulo: %s, Autor: %s, Número de paginas: %d", getTitulo(), getAutor(), getNumeroPaginas());
    }
}