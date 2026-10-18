class Calculadora {
    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero!");
            return Double.NaN;
        }
        return a / b;
    }

    public double potencia(double base, int expoente) {
        return Math.pow(base, expoente);
    }
}

public class MainCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Soma (10 + 5): " + calc.somar(10, 5));
        System.out.println("Subtração (10 - 5): " + calc.subtrair(10, 5));
        System.out.println("Multiplicação (10 * 5): " + calc.multiplicar(10, 5));
        System.out.println("Divisão (10 / 5): " + calc.dividir(10, 5));
        System.out.println("Divisão por zero (10 / 0): " + calc.dividir(10, 0));
        System.out.println("Potência (2^3): " + calc.potencia(2, 3));
    }
}
