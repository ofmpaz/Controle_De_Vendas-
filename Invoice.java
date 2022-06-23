package poo;

public class Invoice {

	//Definindo atributos 
	private int codigoItem;
	private String descricao; 
	private int quantidade; 
	private float precoUnitario; 

	//Definindo metodo construtor 

	public Invoice (int codigoItem, String descricao, int quantidade, float precoUnitario) {

		this.setCodigoItem(codigoItem); 
		this.setDescricao(descricao); 
		this.setQuantidade(quantidade); 
		this.setPrecoUnitario(precoUnitario); 

	}
	public double getInvoiceAmount() {
		return quantidade * precoUnitario; 
	}

	//Metódos acessores 
	public int getCodigoItem() {
		return codigoItem; 
	}
	public void setCodigoItem(int codigoItem) {
		this.codigoItem = codigoItem; 
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao; 
	}
	public int getQuantidade() {
		return quantidade; 
	}
	public void setQuantidade(int quantidde) {
		if (quantidade < 0) {
			this.quantidade = 0; 

		}else {
			this.quantidade = quantidade; 

		}
		this.quantidade = quantidde; 
	}
	public float getPrecoUnitario() {
		return precoUnitario; 
	}
	public void setPrecoUnitario(float precoUnitario) {
		if (precoUnitario < 0) {
			this.precoUnitario = 0; 

		}else {
			this.precoUnitario = precoUnitario; 

		}
		this.precoUnitario = precoUnitario; 
	}


}


