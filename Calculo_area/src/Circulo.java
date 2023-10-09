public class Circulo {
    public double raio;
    public double comprimento;

    public double area;

    public Circulo(double raio) {
        this.raio = raio;
    }

    void calcularPerimetro(){
        comprimento = 2 * 3.14 * raio;
        System.out.println("O perímetro é " + comprimento);
    }
    void calcularArea(){
        area = 3.14 * raio * raio;
        System.out.println("A área é " + area);
    }
}
