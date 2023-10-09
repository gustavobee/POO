public class Retangulo {
    public double area;
    public double perimetro;
    public double lado1, lado2;

    public Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    void calcularPerimetro(){
        perimetro = (lado1 * 2) + (lado2 * 2);
        System.out.println("O perimetro é " + perimetro);
    }
    void calcularArea(){
        area = lado1 * lado2;
        System.out.println("A área é " + area);
    }
}
