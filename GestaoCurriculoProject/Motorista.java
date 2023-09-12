public class Motorista extends Profissao{
    private int cnh;

    public Motorista(String nome, String sobrenome, int anosCompletos, int cnh){
        super(nome, sobrenome, anosCompletos);
        this.cnh = cnh;
    }

    public int getCnh(){
        return cnh;
    }

    @Override
    public String toString(){
        return String.format(
            " Nome: %s\n Sobrenome: %s\n Idade: %d\n Cnh: %d\n\n", getNome(), getSobrenome(), getAnosCompletos(), getCnh()
        );
    }
}