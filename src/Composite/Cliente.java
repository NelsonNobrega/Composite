package Composite;

public class Cliente {

    public void foo(Figura fig) {
        fig.desenhar();
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        Circulo c1 = new Circulo("Círculo 1");
        cliente.foo(c1);

        Triangulo t1 = new Triangulo("Triângulo 1");
        Triangulo t2 = new Triangulo("Triângulo 2");

        FiguraAgrupada grupo = new FiguraAgrupada();
        grupo.adicionar(c1);
        grupo.adicionar(t1);
        grupo.adicionar(t2);

        cliente.foo(grupo);
    }
}
