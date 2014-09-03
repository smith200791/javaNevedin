import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import database.TableCalcOperations;

public class Main {

    private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        Calculate calculate = new Calculate();
        calculate.ssumm(2, 2);
        calculate.viewLastResult("superConsole");

        calculate.executeOperation("multiply",5.0,5.0);
        calculate.viewLastResult("superConsole");

        sessionFactory = createSessionFactory();
        Session session = sessionFactory.openSession();
        List<TableCalcOperations> tableCalcOperations = (List<TableCalcOperations>) session.createQuery("from TABLE_CALC_OPERATIONS").list();
        System.out.println();
    }

    public static SessionFactory createSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.configure();
        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        return sessionFactory;
    }

}
