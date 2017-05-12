import com.spring.practice.model.CustomTypeCollectionHolder;
import com.spring.practice.model.SimpleCollectionHolder;
import com.spring.practice.model.Student;
import com.spring.practice.model.UtilNamespaceCollectionHolder;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {


    private static Logger log = Logger.getLogger(App.class);


    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/application-context.xml");
        SimpleCollectionHolder simpleCollectionHolder = applicationContext.getBean("simpleCollectionHolderId", SimpleCollectionHolder.class);
        CustomTypeCollectionHolder customTypeCollectionHolder = applicationContext.getBean("customTypeCollectionHolderId", CustomTypeCollectionHolder.class);
        UtilNamespaceCollectionHolder utilNamespaceCollectionHolder = applicationContext.getBean("utilNamespaceCollectionHolderId", UtilNamespaceCollectionHolder.class);

        log.info("========printing injected list============");
        List<String> list = simpleCollectionHolder.getList();
        for (String s : list) {
            log.info(s);
        }
        log.info("========printing injected set============");
        Set<String> set = simpleCollectionHolder.getSet();
        for (String s : set) {
            log.info(s);
        }
        log.info("========printing injected map============");
        Map<String, String> map = simpleCollectionHolder.getMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            log.info("key : " + entry.getKey() + " value :" + entry.getValue());
        }






        log.info("====================printing object collections injected using setters======================");
        log.info("========printing injected list============");
        List<Student> studentList = customTypeCollectionHolder.getList();
        for (Student s : studentList) {
            log.info(s);
        }
        log.info("========printing injected set============");
        Set<Student> studentSet = customTypeCollectionHolder.getSet();
        for (Student s : studentSet) {
            log.info(s);
        }
        log.info("========printing injected map============");
        Map<String, Student> studentMap = customTypeCollectionHolder.getMap();
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            log.info("key : " + entry.getKey() + " value :" + entry.getValue());
        }





        log.info("====================printing object collections injected using  util namespace======================");
        log.info("========printing injected list============");
        List<Student> studentUtilList = utilNamespaceCollectionHolder.getList();
        for (Student s : studentUtilList) {
            log.info(s);
        }
        log.info("========printing injected set============");
        Set<Student> studentUtilSet = utilNamespaceCollectionHolder.getSet();
        for (Student s : studentUtilSet) {
            log.info(s);
        }
        log.info("========printing injected map============");
        Map<String, Student> studentUtilMap = utilNamespaceCollectionHolder.getMap();
        for (Map.Entry<String, Student> entry : studentUtilMap.entrySet()) {
            log.info("key : " + entry.getKey() + " value :" + entry.getValue());
        }

        ((ClassPathXmlApplicationContext) applicationContext).close();

    }
}
