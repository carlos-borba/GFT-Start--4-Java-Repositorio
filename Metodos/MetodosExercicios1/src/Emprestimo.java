public class Emprestimo {
    public static int opcao2x() {
        return 2;        
    }

    public static int opcao3x() {
        return 3;        
    }

    public static double taxa2x() {
        return 0.2;
    }
    
    public static double taxa3x() {
        return 0.33;
    }

    public static void calcularValor(double valor, int vezes) {
        if (vezes == 2){
            double valorFinal = valor + (valor * taxa2x());
            System.out.println("O valor final para pagamento em 2 vezes é: "+ valorFinal);
        }else if (vezes == 3){
            double valorFinal = valor + (valor * taxa3x());
            System.out.println("O valor final para pagamento em 3 vezes é: "+ valorFinal);
        } else{
            System.out.println("Não é possivel fazer essse parcelamento");
        }
        
    }
}
