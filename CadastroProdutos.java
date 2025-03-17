import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Produto {
    private int codigo;
    private String nome;
    private int quantidade;

    public Produto(int codigo, String nome, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto{codigo=" + codigo + ", nome='" + nome + "', quantidade=" + quantidade + "}";
    }
}

class GerenciadorProdutos {
    private List<Produto> produtos;

    public GerenciadorProdutos() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(int codigo, String nome, int quantidade) {
        produtos.add(new Produto(codigo, nome, quantidade));
    }

    public boolean removerProduto(int codigo) {
        Iterator<Produto> iterator = produtos.iterator();
        while (iterator.hasNext()) {
            Produto produto = iterator.next();
            if (produto.getCodigo() == codigo) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public Produto buscarPorCodigo(int codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }

    public Produto buscarPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
