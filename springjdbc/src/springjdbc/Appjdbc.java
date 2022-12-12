package springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Appjdbc {

	public static void main(String[] args) {
       
		ApplicationContext con = new ClassPathXmlApplicationContext("spconfig.xml");
		Samplejdbc obj = (Samplejdbc) con.getBean("csdemo");
		demojdbc a = new demojdbc();
		
		a.setCsid(1001);
		a.setCsname("Suresh");
		a.setCssal(20000.00);
		obj.inserCs(a);
	}

}
