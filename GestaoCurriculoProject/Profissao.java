public class Profissao{
    private String nome;
    private String sobrenome;
    private int anosCompletos;

    public Profissao(String nome, String sobrenome, int anosCompletos){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.anosCompletos = anosCompletos;
    }

    public String getNome(){
        return nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public int getAnosCompletos(){
        return anosCompletos;
    }

    @Override
    public String toString(){
        return String.format(
            " Nome: %s\n Sobrenome: %s\n Idade: %d\n\n", getNome(), getSobrenome(), getAnosCompletos()
        );
    }
}