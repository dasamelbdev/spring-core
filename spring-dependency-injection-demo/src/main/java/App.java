import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * This Java source file was generated by the Gradle 'init' task.
 * gradle init --type java-application
 */
public class App {



    final static Logger log = Logger.getLogger(App.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/application-context.xml");
        JuiceMakerService juiceMakerService = applicationContext.getBean("JuiceMakerServiceId", JuiceMakerService.class);
        juiceMakerService.makeJuice();
        ((ClassPathXmlApplicationContext) applicationContext).close();
        log.info("done");
    }

}


