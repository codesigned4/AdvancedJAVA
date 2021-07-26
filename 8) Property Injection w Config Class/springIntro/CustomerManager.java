package springIntro;

public class CustomerManager implements ICustomerService{
	private ICustomerDal iCustomerDal;

	public CustomerManager(ICustomerDal iCustomerDal) {
		this.iCustomerDal = iCustomerDal;
	}
	
	public void add() {
		iCustomerDal.add();
	}
	
}
