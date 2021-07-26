package springIntro;

import org.springframework.beans.factory.annotation.Value;

public class OracleCustomerDal implements ICustomerDal{

	@Value("${database.oracleConnectionString}")
	String connectionString;
	
	@Override
	public void add() {
		System.out.println("Connection :"+this.connectionString);
		System.out.println("Veriniz Oracle Veritabanýna eklendi");
	}
	

}
