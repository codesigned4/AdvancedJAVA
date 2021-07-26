package springIntro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:values.properties")
public class IoCConfiguration {
	@Bean
	public ICustomerDal database(){
		return new OracleCustomerDal();
	}
	
	@Bean
	public ICustomerService service(){
		return new CustomerManager(database());
	}
}
