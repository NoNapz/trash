package com.v8del2h19robhe.demo;

import com.v8del2h19robhe.models.Users;
import com.v8del2h19robhe.services.SaverContextService;
import org.springframework.beans.factory.annotation.Autowired;

public class MySQLSaverStrategy implements UserSaverStrategy {
    @Autowired
    SaverContextService saverContextService;

    @Override
    public void save(Users user) {
       saverContextService.saveUserMySQL(user);
    }
}
