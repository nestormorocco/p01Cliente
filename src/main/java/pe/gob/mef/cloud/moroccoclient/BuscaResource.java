package pe.gob.mef.cloud.moroccoclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/busca/client/{codigo}")
public class BuscaResource {
	@Autowired
	private RestTemplate restTemplate;	

	
	@GetMapping
	public String busca(@PathVariable("codigo") int codigo) {
		String url ="http://morocco-server/rest/busca/server/" + codigo;		
		return restTemplate.getForObject(url,String.class);
	}
}
