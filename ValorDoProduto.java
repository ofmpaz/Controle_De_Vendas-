package poo;

public class ValorDoProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	//Inst�nciando o objeto 	
	Invoice inv = new Invoice(1, "MousePad", 10, 50.0f); 
	//Impress�o
	System.out.println("Valor total igual " + inv.getInvoiceAmount());
	
	
	}

}
