package Dao;

import java.util.List;

public interface Dao<Entity> {
     Entity findById(Integer id);
    List<Entity> findAll();
    void save(Entity entity);
    void update(Entity entity);
    void delete(Entity entity);
}
