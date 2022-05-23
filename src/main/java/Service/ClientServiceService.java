package Service;

import Dao.Dao;
import Model.ClientService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class ClientServiceService implements Dao<ClientService> {


    private final SessionFactory factory;

    public ClientServiceService(SessionFactory factory) {
        this.factory = factory;
    }


    @Override
    public ClientService findById(Integer id) {
        try(Session session = factory.openSession()) {
            return session.get(ClientService.class,id);
        }
    }

    @Override
    public List<ClientService> findAll() {
        try(Session session = factory.openSession()){
            return session.createQuery("from ClientService",ClientService.class).list();
        }
    }

    @Override
    public void save(ClientService clientService) {
        try(Session session = factory.openSession()){
            final Transaction transaction = session.beginTransaction();
            session.save(clientService);
            transaction.commit();
        }
    }

    @Override
    public void update(ClientService clientService) {
        try(Session session = factory.openSession()){
            final Transaction transaction = session.beginTransaction();
            session.update(clientService);
            transaction.commit();
        }
    }

    @Override
    public void delete(ClientService clientService) {
        try(Session session = factory.openSession()){
            final Transaction transaction = session.beginTransaction();
            session.delete(clientService);
            transaction.commit();
        }
    }
}
