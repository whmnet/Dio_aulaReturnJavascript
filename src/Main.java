public class Main {
    public static void main(String[] args) {

        //Quadrilatero:
        System.out.println("Exercício quadrilatero:");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado:" + areaQuadrado);
        double areaRetangulo = Quadrilatero.area(5d, 5d);
        System.out.println("Área do Retangulo:" + areaRetangulo);
        double areaTrapezio = Quadrilatero.area(7, 8, 9);
        System.out.println("Área do trapezio:" + areaTrapezio);
        double areaLozangolo = Quadrilatero.area(5f, 5f);
        System.out.println("Área do lozangolo:" + areaLozangolo);
    }
}