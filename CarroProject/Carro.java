public class Carro{
    private String marca;
    private int ano;
    private String cor;
    private double velocidade;

    public Carro(String marca, int ano, String cor){
        // o bom de chamar o método set direto no construtor ao invés de definir direto (this.marca = marca), é que se for implementado uma validação, é necessário implementar apenas no método set.
        setMarca(marca);
        setAno(ano);
        setCor(cor);
        this.velocidade = 0.0;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public int getAno(){
        return this.ano;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return this.cor;
    }

    public void acelerar(double aceleracao, int tempo){
        // o this serve para tirar o sombreamento (parametro com o mesmo nome do atributo)
        // nesse caso não é necessário utilizar o this, já que não existe nenhum paramêtro com o nome velocidade
        this.velocidade = this.velocidade + aceleracao * tempo;
    }

    public double getVelocidade(){
        return this.velocidade;
    }

    public String toString(){
        return String.format("Marca: %s. Ano: %d. Cor: %s. Aceleração: %f", getMarca(), getAno(), getCor(), getVelocidade());
    }
}