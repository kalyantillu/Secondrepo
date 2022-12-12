package springjdbc;


public class demojdbc {
    private Integer csid;
    private String csname;
    private Double cssal;
    
    public demojdbc()
    {
    	super();
    }
     public demojdbc(Integer csid, String csname, Double cssal)
     {
    	 super();
    	 this.csid = csid;
    	 this.csname = csname;
    	 this.cssal = cssal;
     }
	public Integer getCsid() {
		return csid;
	}

	public void setCsid(Integer csid) {
		this.csid = csid;
	}

	public String getCsname() {
		return csname;
	}

	public void setCsname(String csname) {
		this.csname = csname;
	}

	public Double getCssal() {
		return cssal;
	}

	public void setCssal(Double cssal) {
		this.cssal = cssal;
	}
	
}

