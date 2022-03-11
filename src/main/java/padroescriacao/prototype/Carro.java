package padroescriacao.prototype;

public class Carro implements Cloneable {
    private int id;
    private String combustivel;
    private String cor;
    private Marca marca;


    public Carro(int id, String combustivel, String cor, Marca marca) {
        this.id = id;
        this.combustivel = combustivel;
        this.cor = cor;
        this.marca = marca;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }



    @Override
    public Carro clone() throws CloneNotSupportedException {
        Carro carroClone = (Carro) super.clone();
        carroClone.marca = (Marca) carroClone.marca.clone();
        return carroClone;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "id=" + id +
                ", combustivel='" + combustivel + '\'' +
                ", cor='" + cor + '\'' +
                ", marca='" + marca +
                '}';
    }
}
