import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class testProvider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("provider.xml");
        classPathXmlApplicationContext.start();;
        System.in.read();
    }
}
