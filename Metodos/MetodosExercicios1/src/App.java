public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Calculadora");
        Calculadora.soma(3, 7);
        Calculadora.subtracao(12, 7);
        Calculadora.divisao(8, 2);
        Calculadora.multiplicacao(3, 7);
        System.out.println();
        System.out.println();
        System.out.println("Mensagem para você");
        ManhaTardeNoite.comprimento(32);
        ManhaTardeNoite.comprimento(15);
        ManhaTardeNoite.comprimento(22);
        ManhaTardeNoite.comprimento(6);
        System.out.println();
        System.out.println();
        System.out.println("Empréstimo");
        Emprestimo.calcularValor(100, 3);
        Emprestimo.calcularValor(100, 2);
        Emprestimo.calcularValor(130, 3);
        Emprestimo.calcularValor(150, 2);
        Emprestimo.calcularValor(1010, 3);
    }
}
