package springBoot.rest;

import org.springframework.web.bind.annotation.*;
import springBoot.service.intf.TestService;
import src.service.Population;

import javax.xml.ws.Endpoint;
import java.util.List;

@RestController
public class TestController {

	private TestService testService;

	public TestController(TestService testService) {
	    this.testService = testService;
    }

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="/test/get/json", method=RequestMethod.GET, produces="application/json")
	public @ResponseBody List<String> testGetJson() {
	    return this.testService.test();
	}
}
