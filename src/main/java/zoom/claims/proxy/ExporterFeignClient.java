package zoom.claims.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import zoom.claims.proxy.dto.Exporter;


//@FeignClient(url = "http://localhost:8080", value = "Exporter-Client")
@FeignClient(name = "zoom.exporter")  // multiple server instances
public interface ExporterFeignClient {

	@PostMapping("/exporter/register/{name}")
	public String registerExporter(@PathVariable String name);
	
	@GetMapping("/exporter/getExporterDetails")
	public Exporter getExporterByExporterCode(@RequestParam int exporterCode);
}
