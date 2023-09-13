public class Motorista extends Profissao{
    private int cnh;

    public Motorista(String nome, String sobrenome, int anosCompletos, int cnh){
        super(nome, sobrenome, anosCompletos);
        this.cnh = anosCompletos < 18 ? 0 : cnh;
    }

    public int getCnh(){
        if (cnh == 0){
            System.out.print("[ERROR] Menor de idade! Não é possível ter CNH! \n");
        }
        return cnh;
    }

    @Override
    public String toString(){
        return String.format(
            " Nome: %s\n Sobrenome: %s\n Idade: %d\n Cnh: %d\n\n", getNome(), getSobrenome(), getAnosCompletos(), getCnh()
        );
    }
}