package Core;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

import java.rmi.registry.Registry;

/**
 * Created by azhilin on 24.01.2017.
 */
public class CoreMain {
    public static void main(String[] args) {
        StandardServiceRegistryBuilder ssr = new StandardServiceRegistryBuilder();
        ssr.configure("hibernate.cfg.xml");
        StandardServiceRegistryBuilder ssr1 = ssr.configure("hibernate.cfg.xml");
        StandardServiceRegistry ss = ssr1.build();
        MetadataSources sf = new MetadataSources(ss);
        Metadata md = sf.buildMetadata();
        SessionFactory sessionFactory = md.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        MyUser myUser = new MyUser();
        myUser.setName("Alex");
        myUser.setSurname("Zhilin");
        session.save(myUser);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();



    }
}
