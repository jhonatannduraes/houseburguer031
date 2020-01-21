package entidades;

public class Produto {
	
	private int idDoProduto;
	private String NomeDoProduto;
	private String descricao;
	private double valor;
	
	
	public Produto(int idDoProduto, String nomeDoProduto, String descricao, double valor) {
		super();
		this.idDoProduto = idDoProduto;
		NomeDoProduto = nomeDoProduto;
		this.descricao = descricao;
		this.valor = valor;
	}


	public int getIdDoProduto() {
		return idDoProduto;
	}


	public void setIdDoProduto(int idDoProduto) {
		this.idDoProduto = idDoProduto;
	}


	public String getNomeDoProduto() {
		return NomeDoProduto;
	}


	public void setNomeDoProduto(String nomeDoProduto) {
		NomeDoProduto = nomeDoProduto;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
}
