public class Relogio{
    // modificador de acesso | tipo de dado | nome da variavel
    private int hora;
    private int minuto;
    private int segundo;

    public Relogio(int hora, int minuto, int segundo){
        // this.hora = hora;
        // this.minuto = minuto;
        // this.segundo = segundo;

        // settar dessa forma aproveita o método já pronto com a regra de negócio.
        // Se eu chamasse da forma acima, a regra de negócio não funcionaria por n ser chamada.
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo)
    }
    //modificador de acesso | tipo de retorno | nome do método | parâmetro
    public void setHora(int hora){
        // validação do que é aceito como valor (regra de negócio)
        this.hora = (hora >= 0 && hora <= 23 ? hora : 0);
    }

    public int getHora(){
        return this.hora;
    }

    public void setMinuto(int minuto){
        this.minuto = (minuto >= 0 && minuto <= 59 ? minuto : 0);
    }

    public int getMinuto(){
        return this.minuto;
    }

    public void setSegundo(int minuto){
        this.segundo = (segundo >= 0 && segundo <= 59 ? segundo : 0);
    }

    public int getSegundo(){
        return this.segundo;
    }

    //se não tiver string, ele printaria o endereço da memória
    public String toString(){
        return String.format("%02d:%02d:%02d",
			     getHora(),
			     getMinuto(),
			     getSegundo());
    }
}