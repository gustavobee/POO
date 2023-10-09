public class Quadrado {
    public double comprimento;
    public double area;
    public double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    void calcularPerimetro(){
        comprimento = lado + lado;
        System.out.println("O perímetro é " + comprimento);
    }
    void calcularArea(){
        area = lado * lado;
        System.out.println("A área é " + area);
    }
}
