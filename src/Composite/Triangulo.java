package Composite;

public class Triangulo implements Figura {
    private String nome;

    public Triangulo(String nome) {
        this.nome = nome;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando Triângulo: " + nome);
    }
}
