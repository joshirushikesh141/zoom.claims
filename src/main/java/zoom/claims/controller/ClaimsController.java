package zoom.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import zoom.claims.entity.Claims;
import zoom.claims.proxy.ExporterFeignClient;
import zoom.claims.proxy.PolicyFeignClient;
import zoom.claims.service.ClaimsService;

@RestController
@RequestMapping("/claims")
public class ClaimsController {

	@Autowired
	ClaimsService claimsService;
	
	@Autowired
	ExporterFeignClient exporterFeignClient;
	
	@Autowired
	PolicyFeignClient policyFeignClient;
	
	@PostMapping("/create/{exporterCode}/{policyNumber}")
	public String createClaim(@PathVariable int exporterCode,@PathVariable int policyNumber) {
		exporterFeignClient.getExporterByExporterCode(exporterCode);
		policyFeignClient.getPolicyByPolicyNo(policyNumber);
		
		Claims claims = new Claims();
		claims.setExporterCode(exporterCode);
		claims.setPolicyNumber(policyNumber);
		claims.setClaimStatus("Pending");
		Claims claimsCreated = claimsService.createClaim(claims);
		return "Claim has been approved successfully!! with claim id: "+claimsCreated.getClaimsId();
	}
	
	@PostMapping("/approve/{claimsId}")
	public String approveClaim(@PathVariable int claimsId) {
		Claims claims = claimsService.getClaimByClaimsId(claimsId);
		claims.setClaimStatus("Approved");
		claimsService.approveClaim(claims);
		return "Claim has been approved successfully!! with claims Id: "+claims.getClaimsId();
	}
}
