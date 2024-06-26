package programacao_funcional_e_lambdas.aula3.application;

import programacao_funcional_e_lambdas.aula3.entities.Product;
import programacao_funcional_e_lambdas.aula3.models.services.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("TV", 90.0));
        products.add(new Product("Notebook", 1200.0));
        products.add(new Product("Tablet", 450.0));

        ProductService productService = new ProductService();
        double sum = productService.filteredSum(products, product -> product.getPrice() > 100);
        System.out.println(sum);
    }
}
