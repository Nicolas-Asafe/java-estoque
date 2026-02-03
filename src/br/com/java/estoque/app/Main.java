package br.com.java.estoque.app;
import br.com.java.estoque.data.EstoqueMemory;
import br.com.java.estoque.model.Categoria;
import br.com.java.estoque.model.Produto;
import br.com.java.estoque.service.EstoqueServiceMemory;

import java.security.InvalidKeyException;
import java.util.Scanner;

class Main {
    static void main(String[] args) throws InvalidKeyException {
        EstoqueServiceMemory estoqueService = new EstoqueServiceMemory();
        EstoqueMemory estoqueData = new EstoqueMemory();
        estoqueData.GenerateEstoque();
        estoqueService.estoque = estoqueData.estoque.estoque;
        Scanner sc = new Scanner(System.in);
        System.out.println("[1] - Laticinios");
        System.out.println("[2] - Bebidas");
        System.out.println("[3] - Biscoitos");
        System.out.println("[4] - Mercearia");
        System.out.println("[5] - Limpeza");
        System.out.print("\nEscolha uma categoria: ");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                estoqueService.PrintarProdutosDaCategoria(Categoria.LATICINIOS);
                break;
            case 2:
                estoqueService.PrintarProdutosDaCategoria(Categoria.BEBIDAS);
                break;
            case 3:
                estoqueService.PrintarProdutosDaCategoria(Categoria.BISCOITOS_SNACKS);
                break;
            case 4:
                estoqueService.PrintarProdutosDaCategoria(Categoria.MERCEARIA);
                break;
            case 5:
                estoqueService.PrintarProdutosDaCategoria(Categoria.LIMPEZA);
                break;
            default:
                throw new InvalidKeyException("Opção invalida");
        }
        sc.close();
    }
}
