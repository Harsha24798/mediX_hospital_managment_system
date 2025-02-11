package config;

import com.google.inject.AbstractModule;
import repository.custom.UserDao;
import repository.custom.impl.UserDaoImpl;
import service.custom.UserService;
import service.custom.imp.UserServiceImpl;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(UserService.class).to(UserServiceImpl.class);
        bind(UserDao.class).to(UserDaoImpl.class);
    }
}
