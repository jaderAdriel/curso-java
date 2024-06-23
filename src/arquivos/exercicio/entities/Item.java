package arquivos.exercicio.entities;

public class Item {
    private Double unitPrice;
    private String name;

    public Item(String name, Double unitPrice) {
        this.unitPrice = unitPrice;
        this.name = name;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
