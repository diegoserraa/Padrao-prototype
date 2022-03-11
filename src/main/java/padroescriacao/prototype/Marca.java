package padroescriacao.prototype;

public class Marca implements Cloneable {
    private String nome;
    private String descricao;

    public Marca(String nome, String descricao) {
        super();
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao (String descricao) {
        this.descricao = descricao;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Marca{" +
                "nome='" + nome + '\'' +
                ", descricao=" + descricao +
                '}';
    }
}
