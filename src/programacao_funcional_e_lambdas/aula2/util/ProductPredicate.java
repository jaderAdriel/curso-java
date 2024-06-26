package programacao_funcional_e_lambdas.aula2.util;

import programacao_funcional_e_lambdas.aula2.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {
    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100;
    }
}
