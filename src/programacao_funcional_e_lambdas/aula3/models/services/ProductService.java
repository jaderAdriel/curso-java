package programacao_funcional_e_lambdas.aula3.models.services;

import programacao_funcional_e_lambdas.aula3.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {
    public double filteredSum (List<Product> list, Predicate<Product> predicate) {
        double sum = 0;

        for (Product product : list) {
            if (predicate.test(product)) sum += product.getPrice();
        }
        return sum;
    }
}
