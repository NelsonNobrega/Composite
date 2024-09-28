package Composite;

import java.util.ArrayList;
import java.util.List;

public class FiguraAgrupada implements Figura {
    private List<Figura> figuras = new ArrayList<>();

    public void adicionar(Figura figura) {
        figuras.add(figura);
    }

    public void remover(Figura figura) {
        figuras.remove(figura);
    }

    @Override
    public void desenhar() {
        for (Figura figura : figuras) {
            figura.desenhar();
        }
    }
}

