package com.india.Tourisom.MysqlConnectionProject;

import java.sql.Connection;
import java.sql.DriverManager;
import org.springframework.beans.factory.annotation.Value;


public class Mysql {

  @Value("${spring.datasource.username}")
  private String userName;

  @Value("${spring.datasource.password}")
  private String password;

  @Value("${spring.datasource.url}")
  private String dataBaseUrl;

  @Value("${spring.datasource.driver}")
  private String mysqlDriver;


  public void showDisplayMysqlConnectionInfo() {
    System.out.println(
        " Mysql Host URL :" + dataBaseUrl + "Mysql Username " + userName + " Mysql Password"
            + password + "Mysql Driver" + mysqlDriver);
  }

  public void connectMysql() throws Exception {

    Connection connection = DriverManager.getConnection(dataBaseUrl, userName, password);
    if (connection != null) {
      System.out.println("Connection successful" + connection);
    }
  }

}
