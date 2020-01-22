package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enuns.StatusDoPedido;

public class OrdemDeVenda {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private int id;
	private Date horaPedido;
	private double valorTotal;
	private StatusDoPedido status;
	private Cliente cliente;
	private int quantidade;
	private List<Produto> produto = new ArrayList<>();
	
	
	public OrdemDeVenda() {
	}


	public OrdemDeVenda(int id, Date horaPedido, double valorTotal, StatusDoPedido status, Cliente cliente,
			int quantidade, List<Produto> produto) {
		super();
		this.id = id;
		this.horaPedido = horaPedido;
		this.valorTotal = valorTotal;
		this.status = status;
		this.cliente = cliente;
		this.quantidade = quantidade;
		this.produto = produto;
	}


	public static SimpleDateFormat getSdf() {
		return sdf;
	}


	public static void setSdf(SimpleDateFormat sdf) {
		OrdemDeVenda.sdf = sdf;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public long getHoraPedido() {
		return horaPedido.getTime();
	}


	public double getValorTotal() {
		double total = 0;
			for (Produto p : produto) {
				total += p.getValor();
			}
		return total;
	}


	public StatusDoPedido getStatus() {
		return status;
	}


	public void setStatus(StatusDoPedido status) {
		this.status = status;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public List<Produto> getProduto() {
		return produto;
	}


	public void adicionarProduto(Produto item) {
		produto.add(item);
	}
	
	
		

}
