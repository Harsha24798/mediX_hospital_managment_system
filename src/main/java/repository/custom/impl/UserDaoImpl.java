package repository.custom.impl;

import config.HibernateConfig;
import entity.UserEntity;
import org.hibernate.Session;
import repository.custom.UserDao;


import java.util.List;

public class UserDaoImpl implements UserDao {

    @Override
    public boolean save(UserEntity entity) {
        System.out.println("Repository : " + entity);

        Session session = HibernateConfig.getSession();
        session.beginTransaction();
        session.persist(entity);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(String s, UserEntity entity) {
        return false;
    }

    @Override
    public boolean delete(String s, UserEntity entity) {
        return false;
    }

    @Override
    public UserEntity search(String s) {
        return null;
    }

    @Override
    public List<UserEntity> getAll() {
        return List.of();
    }
}
