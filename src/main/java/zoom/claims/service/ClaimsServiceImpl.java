package zoom.claims.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zoom.claims.entity.Claims;
import zoom.claims.repository.ClaimsRepository;

@Service
public class ClaimsServiceImpl implements ClaimsService{

	@Autowired
	ClaimsRepository claimsRepository;
	
	@Override
	public Claims createClaim(Claims claims) {
		return claimsRepository.save(claims);
	}

	@Override
	public Claims approveClaim(Claims claims) {
		return claimsRepository.save(claims);
	}

	@Override
	public Claims getClaimByClaimsId(int claimsId) {
		return claimsRepository.findById(claimsId).orElseThrow(()-> new IllegalArgumentException());
	}

}
