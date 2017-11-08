package hello;

import javax.validation.constraints.Size;

/**
 * Sample data object, supports javax.validation and jackson annotations.
 * 
 * @author Elli Albek
 */
public class Greeting {

	public long id;

	@Size(min = 1, max = 100)
	public String content;
	//
	// public Greeting() {
	// id = -1;
	// name =
	// }

	public Greeting() {
	}

//	public Greeting(long id, String content) {
//		this.id = id;
//		this.content = content;
//	}

	// public long getId() {
	// return id;
	// }
	//
	// public String getContent() {
	// return content;
	// }
}