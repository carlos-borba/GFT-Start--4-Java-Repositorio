public class Quadrilatero {
    public static void calcularArea(double base){
        System.out.println("Área do quadrado: " + base * base);
    }

    public static void calcularArea(double base, double altura) {
        System.out.println("Área do retângulo: " + base *altura);
    }

    public static void calcularArea(double base1, double base2, double altura) {
        System.out.println("Área de um trapézio: " + ((base1 + base2)/2)*altura);
    }

    public static void calcularArea(float diagonal1, float diagonal2) {
        System.out.println("Área de um losango: " + ((diagonal1 *diagonal2)/2));
    }
    
}