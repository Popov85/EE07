import com.goit.popov.math.Addition;
import com.goit.popov.math.AdditionInteger;
import com.goit.popov.math.Subtraction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Simple calculator emulator based on Spring framework
 *
 * @author Andrey Popov
 * @version 1.0
 */
g
public class Calculator {

        private Addition addition;
        private Subtraction subtraction;

        public static void main(String[] args) {
                ApplicationContext applicationContext =
                        new ClassPathXmlApplicationContext("application-context.xml");
                AdditionInteger add = (AdditionInteger) applicationContext.getBean("AddInt");
                int result = (int) add.add(2,2);
                System.out.println(result);
        }

}
