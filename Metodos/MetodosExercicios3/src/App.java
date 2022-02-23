public class App {
    public static void main(String[] args) throws Exception {
        double areaQuadrado = Quadrilatero.calcularArea(2);
        System.out.println("Area do quadrado é: "+ areaQuadrado);
        double areaRetangulo = Quadrilatero.calcularArea(2, 4);
        System.out.println("Area do retângulo é: "+ areaRetangulo);
        double areaTrapezio = Quadrilatero.calcularArea(7, 11, 2);
        System.out.println("Area do trapézio é: "+ areaTrapezio);
        double areaLosango = Quadrilatero.calcularArea(6, 8);
        System.out.println("Area do losango é: "+ areaLosango);
    }
}
