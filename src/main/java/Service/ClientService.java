package Service;

import Dao.Dao;
import Model.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class ClientService implements Dao<Client> {


        private final SessionFactory factory;

        public ClientService(SessionFactory factory) {
            this.factory = factory;
        }


        @Override
        public Client findById(Integer id) {
            try(Session session = factory.openSession()) {
                return session.get(Client.class,id);
            }
        }

        @Override
        public List<Client> findAll() {
            try(Session session = factory.openSession()){
                return session.createQuery("from Client",Client.class).list();
            }
        }

        @Override
        public void save(Client client) {
            try(Session session = factory.openSession()){
                final Transaction transaction = session.beginTransaction();
                session.save(client);
                transaction.commit();
            }
        }

        @Override
        public void update(Client client) {
            try(Session session = factory.openSession()){
                final Transaction transaction = session.beginTransaction();
                session.update(client);
                transaction.commit();
            }
        }

        @Override
        public void delete(Client client) {
            try(Session session = factory.openSession()){
                final Transaction transaction = session.beginTransaction();
                session.delete(client);
                transaction.commit();
            }
        }

}
