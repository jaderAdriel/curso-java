package arquivos.exercicio;

import arquivos.exercicio.entities.Item;
import arquivos.exercicio.entities.Order;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String path = sc.nextLine();
        List<Order> orders = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path)) ) {

            String line = br.readLine();

            while (line != null) {
                String[] orderData = line.split(",");
                String itemName = orderData[0];
                double itemUnitPrice = Double.parseDouble(orderData[1]);
                int orderAmount = Integer.parseInt(orderData[2]);

                Item item = new Item(itemName, itemUnitPrice);
                orders.add(new Order(item, orderAmount));

                line = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        String outputPath = "/home/jader/IdeaProjects/course/src/arquivos/exercicio/out";
        boolean created = new File(outputPath).mkdir();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath + "/summary.csv"))) {
            for (Order order : orders) {
                bw.write(order.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
