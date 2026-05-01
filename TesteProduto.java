public class TesteProduto {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 3500.00, 10);
        Produto p2 = new Produto("Smartphone", 2500.00, 5);

        p1.exibirInfo();
        System.out.println("-------------------");
        p2.exibirInfo();

        double valorTotalNotebook = p1.calcularValorTotalEmEstoque();
        System.out.println("\nValor total em estoque do Notebook: R$ " + valorTotalNotebook);

        p2.adicionarEstoque(3);
        System.out.println("\nApós adicionar mais itens ao estoque:");
        p2.exibirInfo();
    }
}
