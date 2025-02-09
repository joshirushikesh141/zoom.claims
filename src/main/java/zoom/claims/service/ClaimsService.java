package zoom.claims.service;

import zoom.claims.entity.Claims;

public interface ClaimsService {

	Claims createClaim(Claims claims);

	Claims approveClaim(Claims claims);

	Claims getClaimByClaimsId(int claimsId);

}
