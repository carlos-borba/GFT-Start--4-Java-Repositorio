public class ManhaTardeNoite {
    public static void comprimento(int hora) {
        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                umBomDia();                
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                umaBoaTarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 1:
            case 2:
            case 3:
            case 4:
                umaBoaNoite();
                break;
            default:
                System.out.println("Hora inválida!");
                break;
        }
    }
    private static void umBomDia() {
        System.out.println("Tenha um Bom Dia!");
    }

    private static void umaBoaTarde() {
        System.out.println("Tenha uma Boa Tarde!");
    }

    private static void umaBoaNoite() {
        System.out.println("Tenha uma Boa Noite!");
    }
}
