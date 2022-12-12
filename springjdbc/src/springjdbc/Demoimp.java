package springjdbc;
import org.springframework.jdbc.core.JdbcTemplate;

public class Demoimp implements Samplejdbc {
    
	private JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template)
	{
		this.template = template;
	}
	
	
	
	@Override
	public void inserCs(demojdbc cs)
	{
		String sql = "insert into springdb.custjdbc values(?,?,?)";
		template.update(sql,cs.getCsid(), cs.getCsname(), cs.getCssal());
	}

	
	
}
