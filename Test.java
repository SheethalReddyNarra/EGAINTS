import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

	ApplicationContext Context = new ClassPathXmlApplicationContext("bean.xml");
OrderService order=Context.getBean("processOrder",OrderService.class);

order.processOrder(new Order(125, 4, 1));
order.processOrder(new Order(126, 8, 3));



}
}
