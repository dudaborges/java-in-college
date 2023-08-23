public class Relogio{
    private int segDesdeMeiaNoite;

    public Relogio(int hora, int minuto, int segundo){
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo)
    }
    public void setHora(int hora){
        int hValidacao = (hora >= 0 && hora <= 23 ? hora : 0);
        int hValidacao
    }

    public int getHora(){
        return int hora;
    }

    // public void setMinuto(int minuto){
    //     this.minuto = (minuto >= 0 && minuto <= 59 ? minuto : 0);
    // }

    // public int getMinuto(){
    //     return this.minuto;
    // }

    // public void setSegundo(int minuto){
    //     this.segundo = (segundo >= 0 && segundo <= 59 ? segundo : 0);
    // }

    // public int getSegundo(){
    //     return this.segundo;
    // }

    //se não tiver string, ele printaria o endereço da memória
    public String toString(){
        return String.format("%02d:%02d:%02d",
			     getHora(),
			     getMinuto(),
			     getSegundo());
    }
}