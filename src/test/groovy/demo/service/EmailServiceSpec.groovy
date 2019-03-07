package demo.service
import demo.domain.Order
import spock.lang.Specification
import spock.lang.Unroll

class EmailServiceSpec extends Specification{
    def "Testing sendEmail() mocking"() {
        given: "Create order instance"
        Order order = new Order()
        EmailService emailService = EmailService.getInstance()

        and: "Initializing order"
        order.setItemName("Product Name")
                .setQuantity(2)
                .setPrice(2400)

        when:
        emailService.sendEmail(order)

        then:
        thrown(RuntimeException)
    }
    @Unroll
    def "Testing sendEmail() stubbing"() {
        given: "Create order instance"
        Order order = new Order()
        EmailService emailService = EmailService.getInstance()
        String cc="Sukirti@tothenew.com"

        and: "Initializing order"
        order.setItemName("Product Name")
                .setQuantity(2)
                .setPrice(2400)

        when:
        boolean status = emailService.sendEmail(order, cc)

        then:
        1 * emailService.sendEmail(order, cc) >> inputStatus
        status == expectedStatus

        where:
        sno | inputStatus | expectedStatus
        1   | true        | true
        2   | false       | true
    }

}
