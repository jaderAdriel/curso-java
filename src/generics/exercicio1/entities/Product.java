package generics.exercicio1.entities;

import java.util.Objects;

public class Product implements Comparable<Product> {

    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product product) {
        return this.getPrice().compareTo(product.getPrice());
    }

    @Override
    public String toString() {
        return "name=" + name + ", price=" + price;
    }

}
