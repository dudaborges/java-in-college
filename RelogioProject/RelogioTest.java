public class RelogioTest{
    public static void main(String[] args){
        //nesse momento que nasce o objeto
        // o endereço de memória do relogio 1 aponta aonde está localizado o bloco reservado de memória do novo objeto criado
        // argumento - valor passado para o parâmetro
        Relogio relogio1 = new Relogio(21, 34, 12);

        // relogio1.setHora(21);
        // relogio1.setMinuto(34);
        // relogio1.setSegundo(12);

        System.out.printf("%nRelógio 1 alterado para: %s%n", relogio1);
    }
}