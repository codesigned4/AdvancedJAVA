package springIntro;


public class MySqlCustomerDal implements ICustomerDal{
	@Override
	public void add() {
		System.out.println("Veriniz MySql veritabanýna eklendi");
	}
	
}
