package zoom.claims.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Claims")
public class Claims {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int claimsId;
	
	private int policyNumber;
	
	private int exporterCode;
	
	private String claimStatus;

	public int getClaimsId() {
		return claimsId;
	}

	public void setClaimsId(int claimsId) {
		this.claimsId = claimsId;
	}

	public int getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}

	public int getExporterCode() {
		return exporterCode;
	}

	public void setExporterCode(int exporterCode) {
		this.exporterCode = exporterCode;
	}

	public String getClaimStatus() {
		return claimStatus;
	}

	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}

	public Claims() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Claims(int claimsId, int policyNumber, int exporterCode, String claimStatus) {
		super();
		this.claimsId = claimsId;
		this.policyNumber = policyNumber;
		this.exporterCode = exporterCode;
		this.claimStatus = claimStatus;
	}

	@Override
	public String toString() {
		return "Claims [claimsId=" + claimsId + ", policyNumber=" + policyNumber + ", exporterCode=" + exporterCode
				+ ", claimStatus=" + claimStatus + "]";
	}

	
	
	
}
