public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeInicial) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeInicial;
    }
    public void exibirInfo() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
    }
    public double calcularValorTotalEmEstoque() {
        return preco * quantidadeEstoque;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidadeEstoque += quantidade;
    }
}
