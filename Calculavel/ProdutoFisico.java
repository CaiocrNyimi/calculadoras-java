package Calculadoras.Calculavel;

import Calculadoras.Vendavel.Produto;

public class ProdutoFisico extends Produto implements Calculavel {
    int preco = 0;

    public double calcularPrecoFinal() {
        return preco * 1.05;
    }
}