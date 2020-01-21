package entidades;

public class Cliente {
	
	private int idDoCliente;
	private String nomeDoCliente;
	private String emailDoCliente;
	private String enderecoDoCliente;
	
	public Cliente() {
	}

	public Cliente(int idDoCliente, String nomeDoCliente, String emailDoCliente, String enderecoDoCliente) {
		super();
		this.idDoCliente = idDoCliente;
		this.nomeDoCliente = nomeDoCliente;
		this.emailDoCliente = emailDoCliente;
		this.enderecoDoCliente = enderecoDoCliente;
	}

	public int getIdDoCliente() {
		return idDoCliente;
	}

	public void setIdDoCliente(int idDoCliente) {
		this.idDoCliente = idDoCliente;
	}

	public String getNomeDoCliente() {
		return nomeDoCliente;
	}

	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}

	public String getEmailDoCliente() {
		return emailDoCliente;
	}

	public void setEmailDoCliente(String emailDoCliente) {
		this.emailDoCliente = emailDoCliente;
	}

	public String getEnderecoDoCliente() {
		return enderecoDoCliente;
	}

	public void setEnderecoDoCliente(String enderecoDoCliente) {
		this.enderecoDoCliente = enderecoDoCliente;
	}
	
	

}
