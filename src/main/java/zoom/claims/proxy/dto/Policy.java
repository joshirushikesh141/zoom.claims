package zoom.claims.proxy.dto;

public class Policy {

	private int policyNumber;
	
	private int exporterCode;

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

	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Policy(int policyNumber, int exporterCode) {
		super();
		this.policyNumber = policyNumber;
		this.exporterCode = exporterCode;
	}

	@Override
	public String toString() {
		return "Policy [policyNumber=" + policyNumber + ", exporterCode=" + exporterCode + "]";
	}
	
	
	
}
