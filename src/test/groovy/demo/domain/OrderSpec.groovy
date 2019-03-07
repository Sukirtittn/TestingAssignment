package demo.domain;

import spock.lang.Specification;

public class OrderSpec extends Specification {
    def "Testing getQuantity" () {
        given: "Create order instance"
        Order order = new Order();


        and: "Initializing order";
        order.setItemName("Product Name")
                .setQuantity(2)
                .setPrice(2400);


        when:
        order.getQuantity();

        then:
        1 *order.getQuantity()
    }
    def "Testing getItemName" () {
        given: "Create order instance"
        Order order = new Order();


        and: "Initializing order";
        order.setItemName("Product Name")
                .setQuantity(2)
                .setPrice(2400);


        when:
        order.getItemName();

        then:
        1 *order.getItemName()
    }
    def "Testing getPrice" () {
        given: "Create order instance"
        Order order = new Order();


        and: "Initializing order";
        order.setItemName("Product Name")
                .setQuantity(2)
                .setPrice(2400);


        when:
        order.getPrice();

        then:
        1 *order.getPrice()
    }
    def "Testing setQuantity" () {
        given: "Create order instance"
        Order order = new Order();


        and: "Initializing order";
        order.setItemName("Product Name")
                .setQuantity(2)
                .setPrice(2400);


        when:
        order.setQuantity(3);

        then:
        order.getQuantity()==3
    }
    def "Testing setItemName" () {
        given: "Create order instance"
        Order order = new Order();


        and: "Initializing order";
        order.setItemName("Product Name")
                .setQuantity(2)
                .setPrice(2400);


        when:
        order.setItemName("New Product");

        then:
        order.getItemName()== "New Product"
    }
    def "Testing setPrice" () {
        given: "Create order instance"
        Order order = new Order();


        and: "Initializing order";
        order.setItemName("Product Name")
                .setQuantity(2)
                .setPrice(2400);


        when:
        order.setPrice(3000);

        then:
        order.getPrice()==3000
    }
}
