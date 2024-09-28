package Composite;

public class Circulo implements Figura {
    private String nome;

    public Circulo(String nome) {
        this.nome = nome;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando Círculo: " + nome);
    }
}
