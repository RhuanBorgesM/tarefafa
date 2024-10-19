public interface IFuncionario {
    double calcularSalario();
    String descreverResponsibilidade();
}

 abstract class Funcionario {
    private String nome;  // Atributo privado

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public abstract double calcularPagamento();

    public abstract void mostrarInformacoes();
}
