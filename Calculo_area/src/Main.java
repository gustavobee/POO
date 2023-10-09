public class Main {
    public static void main(String[] args) {
        Circulo bola = new Circulo(4);
        bola.calcularPerimetro();
        bola.calcularArea();

        System.out.println(" ");

        Quadrado quadrado = new Quadrado(6);
        quadrado.calcularArea();
        quadrado.calcularPerimetro();

        System.out.println(" ");

        Retangulo retangulo = new Retangulo(2,3);
        retangulo.calcularArea();
        retangulo.calcularPerimetro();

        System.out.println(" ");

        Triangulo triangulo = new Triangulo(4,3,2);
        triangulo.calcularArea();
        triangulo.calcularPerimetro();
    }
}