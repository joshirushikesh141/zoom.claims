package zoom.claims.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import zoom.claims.proxy.dto.Policy;

//@FeignClient(url = "http://localhost:8081",value = "Policy-Client")
@FeignClient(name = "zoom.policy")  // multiple server instances
public interface PolicyFeignClient {

	@PostMapping("/policy/issue/{exporterCode}")
	public String issuePolicyforExporter(@PathVariable int exporterCode);
	
	@GetMapping("/policy/getPolicy/{policyNumber}")
	public Policy getPolicyByPolicyNo(@PathVariable int policyNumber);
}
