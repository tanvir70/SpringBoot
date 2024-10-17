package com.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {
    public static void main(String[] args) {
//      UserDataProvider databaseProvider = new UserDatabaseProvider();
//      UserManager userManagerWithDB = new UserManager(databaseProvider);
//      System.out.println(userManagerWithDB.getUserInfo());
//
//      UserDataProvider webServiceProvider = new WebServiceDataProvider();
//      UserManager userManagerWithWebService = new UserManager(webServiceProvider);
//      System.out.println(userManagerWithWebService.getUserInfo());
//
//      NewDatabaseProvider newDatabaseProvider = new NewDatabaseProvider();
//      UserManager userManagerWithNewDatabase = new UserManager(newDatabaseProvider);
//      System.out.println(userManagerWithNewDatabase.getUserInfo());

      ApplicationContext context = new ClassPathXmlApplicationContext("applicationLooseCoupling.xml");

      UserManager userManagerWithDB = (UserManager) context.getBean("userManagerWithUDP");
      System.out.println(userManagerWithDB.getUserInfo());

      UserManager userManagerWithWebService = (UserManager) context.getBean("userManagerWithWSDP");
      System.out.println(userManagerWithWebService.getUserInfo());

      UserManager userManagerWithNewDatabase = (UserManager) context.getBean("userManagerWithNDP");
      System.out.println(userManagerWithNewDatabase.getUserInfo());
    }
}
