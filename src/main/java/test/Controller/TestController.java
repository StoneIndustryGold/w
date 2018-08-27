package test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import test.Service.TestService;
import test.model.TestModel;

@Controller
public class TestController {
		private TestService testService;
		
		@Autowired
		public TestController(TestService testService) {
			this.testService = testService;
		}


		@RequestMapping(method=RequestMethod.GET,value="/test/test")
		public String test(Model model) {
			System.out.println("你好世界");
			List<TestModel> cellpones=testService.FinAll();
			model.addAttribute("cellpones", cellpones);
			return "test";	
		}
}
