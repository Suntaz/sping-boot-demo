package tw.com.mitake;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@RequestMapping("/")
	public String hello() {
		return "hello";
	}
}

