// Interface IFuncionario
public interface IFuncionario {
    Double calcularSalario();
    String descreverResponsabilidades();
}

// Classe Gerente
class Gerente implements IFuncionario {
    double salarioBase, bonus;
    Gerente(double salarioBase, double bonus) {
        this.salarioBase = salarioBase; this.bonus = bonus;
    }
    public Double calcularSalario() { return salarioBase + bonus; }
    public String descreverResponsabilidades() { return "Gerencia a equipe."; }
}

// Classe Desenvolvedor
class Desenvolvedor implements IFuncionario {
    double salarioBase;
    Desenvolvedor(double salarioBase) { this.salarioBase = salarioBase; }
    public Double calcularSalario() { return salarioBase; }
    public String descreverResponsabilidades() { return "Desenvolve software."; }
}

// Classe principal
public class SistemaRH {
    public static void main(String[] args) {
        IFuncionario[] funcionarios = {
                new Gerente(8000.0, 2000.0),
                new Desenvolvedor(5000.0)
        };

        for (IFuncionario f : funcionarios) {
            System.out.println(f.calcularSalario() + ", " + f.descreverResponsabilidades());
        }
    }
}