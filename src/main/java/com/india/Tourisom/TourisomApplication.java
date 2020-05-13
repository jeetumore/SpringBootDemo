package com.india.Tourisom;



import com.india.Tourisom.MysqlConnectionProject.Mysql;
import com.india.Tourisom.Person.Human;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TourisomApplication {

	public static void main(String[] args) throws Exception {

		SpringApplication.run(TourisomApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		India india = context.getBean("india", India.class);
		india.touristPlace();

		Human human = context.getBean("human", Human.class);
		human.startpumping();

		Mysql mysql = context.getBean("mysql", Mysql.class);
		mysql.showDisplayMysqlConnectionInfo();
		mysql.connectMysql();
	}

}



