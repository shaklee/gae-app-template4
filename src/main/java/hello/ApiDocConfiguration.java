package hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Configuration of Swagger and SwingFox rest api docs.
 * 
 * @author Elli Albek
 */
@Configuration
@EnableSwagger2
public class ApiDocConfig {

	@Bean
	public Docket customDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				// PUBLIC API
				.groupName("public").select().paths(paths()).build()
		; 
	}

	private Predicate<String> paths() {
		return Paths.paths("/greeting", "/hello/*");
	}
}