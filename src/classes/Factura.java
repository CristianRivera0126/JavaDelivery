package classes;

import java.util.ArrayList;
import java.util.List;

public class Factura {
	public int id;
	public double total;
	int Pi=70;
	
	public Ayuda ayuda;
	public Comercio comercio;
	public Cliente cliente;
	public List<Comida> comidas;
	
	
	public Factura(Cliente cliente,Ayuda ayuda,List<Comida> productos) {
		this.id=(int)(Math.random()*(3000-1000+1)+1000);
		this.cliente=cliente;
		this.ayuda=ayuda;
		this.comercio=comercio;
		this.comidas=new ArrayList<Comida>();
		this.comidas.addAll(productos);
		this.calcular_Total();
		
	}
	public void calcular_Total() {
		if(this.cliente.Ncomercios==1) {
			total=Pi;
	}else {
		total=Pi*2;
	}
}
    public void actualizar_carrito(List<Comida> comidas) {
    	this.comidas.removeAll(this.comidas);
    	this.comidas.addAll(comidas);
    	this.calcular_Total();
	}
    
    public void imprimir_factura() {
    	System.out.println("Factura # \t\t\t"+String.valueOf(id));
    	System.out.println("Cliente ID: \t\t\t"+String.valueOf(this.cliente.id));
    	System.out.println("Nombre Cliente: \t\t\t"+this.cliente.name+"\n");
    	
    	System.out.println("Descripcion \t\t\t Precio\t\t\t");
    	for(Comida c:this.comidas) {
    		c.imprimir_datos();
    	}
    	
    	System.out.println("Total por delivery: \t\t\t"+String.valueOf(this.total));
    	System.out.println("\n");
    }
    
	

}
