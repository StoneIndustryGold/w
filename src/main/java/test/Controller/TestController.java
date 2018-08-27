package test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
		
		@RequestMapping(method=RequestMethod.GET,value="/test/test")
		public String test() {
			
			System.out.println("你好世界");
			return "test";	
		}
}