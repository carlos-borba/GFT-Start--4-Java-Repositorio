public class CertoErrado {
    public static void eAi(int num) {
        switch (num) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo!");
                break;
            case 4:
                System.out.println("Errado!");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Inválido!");
                break;
        }
    }
    
}
