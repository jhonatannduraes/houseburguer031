package entidades;

import java.util.ArrayList;
import java.util.List;

import enuns.ItensDoProduto;

public class Item {
	
	private int idDoitem;
	private String NomeDoItem;
	private int quantidade;
	private List<ItensDoProduto> itens = new ArrayList<>();
	
	public Item() {
	}

	public Item(int idDoitem, String nomeDoItem, int quantidade, List<ItensDoProduto> itens) {
		super();
		this.idDoitem = idDoitem;
		NomeDoItem = nomeDoItem;
		this.quantidade = quantidade;
		this.itens = itens;
	}

	public int getIdDoitem() {
		return idDoitem;
	}

	public void setIdDoitem(int idDoitem) {
		this.idDoitem = idDoitem;
	}

	public String getNomeDoItem() {
		return NomeDoItem;
	}

	public void setNomeDoItem(String nomeDoItem) {
		NomeDoItem = nomeDoItem;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public List<ItensDoProduto> getItens() {
		return itens;
	}
	
	public void adicionarItens(ItensDoProduto item) {
		itens.add(item);
	}
	
	public void removeItens(ItensDoProduto item) {
		itens.remove(item);
	}
}
