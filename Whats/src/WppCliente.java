import java.io.File;
import java.sql.Date;

public interface WppCliente {

	public boolean cadastro(String nome, long numero);
	
	public String enviarMensagem (String contato, String mensagem, Date data);
	
	public String recebeMensagem (String contato, String mensagem, Date data);
	
	public String situacao (long idMsg);
		
	public String atualizarRecado (String recado, Date data);
	
	public String addContato (String nome, long numero);
	
	public String removeContato (String nome, long numero);
	
	
	
	


	
	
	
}
