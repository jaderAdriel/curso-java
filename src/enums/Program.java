package enums;

import enums.entities.Order;
import enums.entities.enums.OrderStatus;
import java.time.Instant;

public class Program {
    public static void main(String[] args) {
        Order order = new Order(0, Instant.now(), OrderStatus.PENDING_PAYMENT);
        order.setStatus(OrderStatus.valueOf("PROCESSING"));
        System.out.println("order = " + order);
    }
}
