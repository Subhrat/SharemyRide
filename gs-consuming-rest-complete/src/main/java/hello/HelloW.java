package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloW {
	//private String message = "Hello World";
	
	@RequestMapping("/hello")
    String home() {
        return "Hello World!";
    }

}
