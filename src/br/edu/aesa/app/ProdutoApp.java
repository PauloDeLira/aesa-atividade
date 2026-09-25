package br.edu.aesa.app;

import br.edu.aesa.model.Produto;
import br.edu.aesa.service.ProdutoService;

import java.util.List;
import java.util.Scanner;

public class ProdutoApp {

    public void executar() {

        Scanner scanner = new Scanner(System.in);
        ProdutoService produtoService = new ProdutoService();

        int opcao;

        do {
            System.out.println("\n===== SISTEMA DE PRODUTOS =====");
            System.out.println("[1] Cadastrar produto");
            System.out.println("[2] Listar todos os produtos");
            System.out.println("[3] Buscar produto por ID");
            System.out.println("[4] Atualizar produto");
            System.out.println("[5] Remover produto");
            System.out.println("[0] Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            try {

                switch (opcao) {

                    case 1:
                        System.out.println("\n--- CADASTRAR PRODUTO ---");

                        System.out.print("ID: ");
                        Long id = scanner.nextLong();
                        scanner.nextLine();

                        System.out.print("Nome: ");
                        String nome = scanner.nextLine();

                        System.out.print("Categoria: ");
                        String categoria = scanner.nextLine();

                        System.out.print("Preço: ");
                        double preco = scanner.nextDouble();

                        System.out.print("Quantidade: ");
                        int quantidade = scanner.nextInt();
                        scanner.nextLine();

                        Produto produto = new Produto(
                                id,
                                nome,
                                categoria,
                                preco,
                                quantidade
                        );

                        produtoService.salvar(produto);
                        break;

                    case 2:
                        System.out.println("\n--- LISTA DE PRODUTOS ---");

                        List<Produto> produtos = produtoService.listarTodos();

                        for (Produto p : produtos) {
                            System.out.println(p);
                        }

                        break;

                    case 3:
                        System.out.println("\n--- BUSCAR PRODUTO ---");

                        System.out.print("Digite o ID do produto: ");
                        Long idBusca = scanner.nextLong();
                        scanner.nextLine();

                        Produto produtoEncontrado =
                                produtoService.buscarPorId(idBusca);

                        System.out.println("Produto encontrado:");
                        System.out.println(produtoEncontrado);

                        break;

                    case 4:
                        System.out.println("\n--- ATUALIZAR PRODUTO ---");

                        System.out.print("Digite o ID do produto: ");
                        Long idAtualizacao = scanner.nextLong();
                        scanner.nextLine();

                        System.out.print("Novo nome: ");
                        String novoNome = scanner.nextLine();

                        System.out.print("Nova categoria: ");
                        String novaCategoria = scanner.nextLine();

                        System.out.print("Novo preço: ");
                        double novoPreco = scanner.nextDouble();

                        System.out.print("Nova quantidade: ");
                        int novaQuantidade = scanner.nextInt();
                        scanner.nextLine();

                        Produto produtoAtualizado = new Produto(
                                idAtualizacao,
                                novoNome,
                                novaCategoria,
                                novoPreco,
                                novaQuantidade
                        );

                        produtoService.atualizarProduto(produtoAtualizado);

                        break;

                    case 5:
                        System.out.println("\n--- REMOVER PRODUTO ---");

                        System.out.print("Digite o ID do produto: ");
                        Long idRemocao = scanner.nextLong();
                        scanner.nextLine();

                        produtoService.removerProduto(idRemocao);

                        break;

                    case 0:
                        System.out.println("\nEncerrando o sistema...");
                        break;

                    default:
                        System.out.println("\nOpção inválida!");
                }

            } catch (RuntimeException e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } while (opcao != 0);

        scanner.close();
    }
}