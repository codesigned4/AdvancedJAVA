package springIntro;

import org.springframework.stereotype.Component;

@Component("database")
public class MySqlCustomerDal implements ICustomerDal{
	@Override
	public void add() {
		System.out.println("Veriniz MySql veritabanýna eklendi");
	}
	
}
