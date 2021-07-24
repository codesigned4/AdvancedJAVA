package springIntro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IoCConfiguration {
	@Bean
	public ICustomerDal database(){
		return new MySqlCustomerDal();
	}
	
	@Bean
	public ICustomerService service(){
		return new CustomerManager(database());
	}
}
