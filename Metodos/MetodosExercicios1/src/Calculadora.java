public class Calculadora {
    public static void soma(double num1, double num2) {
        double soma = num1 + num2;

        System.out.println("A soma de " + num1+ " + " + num2+ " é igual a "+soma+"!");
    }

    public static void subtracao(double num1, double num2) {
        double diferenca = num1 - num2;

        System.out.println("A diferença de " + num1+ " - " + num2+ " é igual a "+ diferenca +"!");
    }

    public static void multiplicacao(double num1, double num2) {
        double produto = num1 * num2;

        System.out.println("O produto de " + num1+ " x " + num2+ " é igual a "+ produto +"!");
    }

    public static void divisao(double num1, double num2) {
        double quociente = num1 / num2;

        System.out.println("O quociente de " + num1+ " - " + num2+ " é igual a "+ quociente +"!");
    }
}
