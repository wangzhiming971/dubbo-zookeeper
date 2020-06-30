import com.wang.dto.User;
import com.wang.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class testConsumer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService Service = classPathXmlApplicationContext.getBean(OrderService.class);
        for(User user: Service.InitOderService("1")){
            System.out.println(user.toString());
        }
        System.in.read();
    }
}
