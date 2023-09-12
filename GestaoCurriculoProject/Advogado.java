public class Advogado extends Profissao{
    private int oab;

    public Advogado(String nome, String sobrenome, int anosCompletos, int oab){
        super(nome, sobrenome, anosCompletos);
        this.oab = oab;
    }

    public int getOab(){
        return oab;
    }

    @Override
    public String toString(){
        return String.format(
            " Nome: %s\n Sobrenome: %s\n Idade: %d\n OAB: %d\n\n", getNome(), getSobrenome(), getAnosCompletos(), getOab()
        );
    }
}