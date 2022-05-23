package Service;

import Dao.Dao;
import Model.Service;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class ServiceService implements Dao<Service> {

    private final SessionFactory factory;

    public ServiceService(SessionFactory factory) {
        this.factory = factory;
    }


    @Override
    public Service findById(Integer id) {
        try(Session session = factory.openSession()) {
        return session.get(Service.class,id);
    }
}

    @Override
    public List<Service> findAll() {
        try(Session session = factory.openSession()){
            return session.createQuery("from Service",Service.class).list();

        }
    }

    @Override
    public void save(Service service) {
        try(Session session = factory.openSession()){
            final Transaction transaction = session.beginTransaction();
            session.save(service);
            transaction.commit();
        }
    }

    @Override
    public void update(Service service) {
        try(Session session = factory.openSession()){
            final Transaction transaction = session.beginTransaction();
            session.update(service);
            transaction.commit();
        }
    }

    @Override
    public void delete(Service service) {
        try(Session session = factory.openSession()){
            final Transaction transaction = session.beginTransaction();
            session.delete(service);
            transaction.commit();
        }
    }

}
