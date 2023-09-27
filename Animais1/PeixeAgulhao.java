public class PeixeAgulhao extends Animal{

    public PeixeAgulhao(){
        getMetrosPercorridos();
        setVelocidadeKmh(115);
    }

    public void mover(int segundos) {
        if (segundos > 0) {
            getMetrosPercorridos() += getVelocidadeKmh() * 1000 / 3600 * segundos;
            System.out.printf("O peixe-agulhao nadou %.1f metros.%n",
			      getMetrosPercorridos());
        }
    }
} // fim da classe PeixeAgulhao
