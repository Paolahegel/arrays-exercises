package exercicios;

public class Empregado {
    private String nome;
    private Double salario;
    private Integer id;

    public Empregado() {}
    public Empregado(String nome, Double salario, Integer id) {
        this.nome = nome;
        this.salario = salario;
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public Double getSalario() {
        return salario;
    }
    public Double setSalario(Double salario) {
        this.salario = salario;
        return salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void aumetarSalario(double porcentagem) { // função para aumentar o salario
        this.salario += salario * (porcentagem / 100.00);
    }
}
