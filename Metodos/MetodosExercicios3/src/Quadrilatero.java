public class Quadrilatero {
    public static double calcularArea(double base){
        return   base * base;
    }

    public static double calcularArea(double base, double altura) {
        return base *altura;
    }

    public static double calcularArea(double base1, double base2, double altura) {
        return (base1 + base2)/2*altura;
    }

    public static float calcularArea(float diagonal1, float diagonal2) {
        return (diagonal1 *diagonal2)/2;
    }
    
}