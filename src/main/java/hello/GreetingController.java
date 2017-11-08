package hello;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.concurrent.atomic.AtomicLong;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Value("${testVal}")
	String message;

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping(path = "/greeting", method = GET)
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") @NotNull String name) {
		// return new Greeting(counter.incrementAndGet(),
		// String.format(template, name));
		Greeting g = new Greeting();
		g.id = counter.incrementAndGet();
		g.content = String.format(template, name) + ' ' + message;
		return g;
	}

	@RequestMapping(path = "/greeting", method = POST)
	public Greeting save(@ModelAttribute Greeting g) {
		return g;
	}
}