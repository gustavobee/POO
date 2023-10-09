public class Triangulo {
    public double area;
    public double perimetro;
    public double lado1, lado2, lado3;
    public double semiperimetro;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    void calcularPerimetro(){
        perimetro = lado1 + lado2 + lado3;
        System.out.println("O perímetro é " + perimetro);
    }
    void calcularArea(){
        semiperimetro = (lado1 + lado2 + lado3)/2;
        area = Math.sqrt(semiperimetro*(semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        System.out.println("A área é " + area);
    }
}
