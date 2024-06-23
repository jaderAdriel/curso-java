package arquivos.exercicio.entities;

public class Order {
    private Item item;
    private Integer amount;

    public Order(Item item, Integer amount) {
        this.item = item;
        this.amount = amount;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public double getTotal() {
        return this.getItem().getUnitPrice() * this.getAmount();
    }

    @Override
    public String toString() {
        return this.getItem().getName() + "," + this.getTotal();
    }
}
