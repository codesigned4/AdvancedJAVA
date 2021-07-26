package springIntro;

import org.springframework.beans.factory.annotation.Value;

public class MySqlCustomerDal implements ICustomerDal{
	
	@Value("${database.sqlConnectionString}")
	String connectionString;
	
	@Override
	public void add() {
		System.out.println("Connection :"+this.connectionString);
		System.out.println("Veriniz MySql veritabanýna eklendi");
	}
	
}
