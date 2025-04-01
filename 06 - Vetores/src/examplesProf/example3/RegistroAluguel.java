package examplesProf.example3;

public class RegistroAluguel {
    private String nome;
    private String email;

    public RegistroAluguel() {
    }
    public RegistroAluguel(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return  nome + "," + email;
    }
}
