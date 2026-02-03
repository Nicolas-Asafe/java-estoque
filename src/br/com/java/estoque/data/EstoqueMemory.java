package br.com.java.estoque.data;

import br.com.java.estoque.model.Categoria;
import br.com.java.estoque.service.EstoqueServiceMemory;

import java.util.ArrayList;
import java.util.List;

public class EstoqueMemory {
    public EstoqueServiceMemory estoque = new EstoqueServiceMemory();

    public void GenerateEstoque() {

        // 🥖 Mercearia
        estoque.adicionarProduto(1, "Arroz Tipo 1 5kg", 28.90, 120, Categoria.MERCEARIA);
        estoque.adicionarProduto(2, "Feijão Carioca 1kg", 8.50, 200, Categoria.MERCEARIA);
        estoque.adicionarProduto(3, "Açúcar Refinado 1kg", 4.80, 150, Categoria.MERCEARIA);
        estoque.adicionarProduto(4, "Sal Refinado 1kg", 2.20, 300, Categoria.MERCEARIA);
        estoque.adicionarProduto(5, "Farinha de Trigo", 5.40, 180, Categoria.MERCEARIA);

//----------------------------------------------------------------------------------------------------------//
        // 🥛 Laticínios
        estoque.adicionarProduto(6, "Leite Integral 1L", 5.20, 250, Categoria.LATICINIOS);
        estoque.adicionarProduto(7, "Leite Desnatado 1L", 5.40, 180, Categoria.LATICINIOS);
        estoque.adicionarProduto(8, "Manteiga 200g", 9.90, 90, Categoria.LATICINIOS);
        estoque.adicionarProduto(9, "Margarina 250g", 7.30, 110, Categoria.LATICINIOS);
        estoque.adicionarProduto(10, "Yogurte Light", 4.50, 200, Categoria.LATICINIOS);
//----------------------------------------------------------------------------------------------------------//
        // 🧼 Limpeza
        estoque.adicionarProduto(11, "Detergente Neutro 500ml", 2.60, 400, Categoria.LIMPEZA);
        estoque.adicionarProduto(12, "Sabão em Pó 1kg", 14.90, 70, Categoria.LIMPEZA);
        estoque.adicionarProduto(13, "Água Sanitária 1L", 3.40, 220, Categoria.LIMPEZA);
        estoque.adicionarProduto(14, "Desinfetante 2L", 6.80, 160, Categoria.LIMPEZA);
//----------------------------------------------------------------------------------------------------------//
        // 🧃 Bebidas
        estoque.adicionarProduto(15, "Refrigerante Cola 2L", 8.90, 140, Categoria.BEBIDAS);
        estoque.adicionarProduto(16, "Suco de Uva 1L", 7.50, 95, Categoria.BEBIDAS);
        estoque.adicionarProduto(17, "Suco de Laranja 1L", 7.50, 95, Categoria.BEBIDAS);
        estoque.adicionarProduto(18, "Água Mineral 500ml", 2.00, 500, Categoria.BEBIDAS);
//----------------------------------------------------------------------------------------------------------//
        // 🍪 Biscoitos & Snacks
        estoque.adicionarProduto(19, "Biscoito Recheado Chocolate", 4.20, 180, Categoria.BISCOITOS_SNACKS);
        estoque.adicionarProduto(20, "Bolacha de Água e Sal", 3.80, 160, Categoria.BISCOITOS_SNACKS);
        estoque.adicionarProduto(21, "Salgadinho Milho 100g", 6.50, 130, Categoria.BISCOITOS_SNACKS);
//----------------------------------------------------------------------------------------------------------//
    }
}
