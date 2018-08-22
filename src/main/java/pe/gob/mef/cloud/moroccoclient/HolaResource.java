package pe.gob.mef.cloud.moroccoclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/hola/client")
public class HolaResource {
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping
	public String hola() {
		String url ="http://morocco-server/rest/hola/server";		
		return restTemplate.getForObject(url,String.class);
	}
	
}
