class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void exibirInformacoes() {
        System.out.println("--- Informações do Funcionário ---");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$ " + salario);
        System.out.println("---------------------------------");
    }

    public void promover(String novoCargo, double aumento) {
        this.cargo = novoCargo;
        this.salario += aumento;
    }

    public void reajustarSalario(double percentual) {
        this.salario += this.salario * (percentual / 100.0);
    }

    public void demitir() {
        this.salario = 0;
        this.cargo = "Desligado";
    }
}

public class MainFuncionario {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Carlos Silva", "Desenvolvedor Junior", 3000.00);

        func.exibirInformacoes();

        System.out.println("\nPromovendo funcionário...");
        func.promover("Desenvolvedor Pleno", 1500.00);
        func.exibirInformacoes();

        System.out.println("\nAplicando reajuste de 10%...");
        func.reajustarSalario(10);
        func.exibirInformacoes();

        System.out.println("\nDemitindo funcionário...");
        func.demitir();
        func.exibirInformacoes();
    }
}
