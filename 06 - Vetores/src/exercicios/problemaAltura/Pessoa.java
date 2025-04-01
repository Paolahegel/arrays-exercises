package exercicios.problemaAltura;

public class Pessoa {
    private String nome;
    private int idade;
    private  double altura;

    public Pessoa(int idade, String nome, double altura) {
        this.idade = idade;
        this.nome = nome;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }
}
