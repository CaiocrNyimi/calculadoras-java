package Calculadoras.Calculavel;

import Calculadoras.Vendavel.Produto;

public class Livro extends Produto implements Calculavel {
    private String autor;
    int preco = 0;

    public double calcularPrecoFinal() {
        return preco * 0.9;
    }
}