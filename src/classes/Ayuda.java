package classes;

import java.util.ArrayList;
import java.util.List;

public class Ayuda {
	public int id;
	public String name;
	
	public List<Factura>facturas;
	
	public Ayuda(String name) {
		this.id=(int)(Math.random()*(3000-1000+1)+1000);
		this.name=name;
		
		this.facturas=new ArrayList<Factura>();
	}
	
	public void crear_factura(Cliente c) {
		Factura f = new Factura(c,this,c.carrito);
		this.facturas.add(f);
		c.agregar_factura(f);
		c.vaciar_carrito();
	}
	
	public void imprimir_ordenes() {
		for(Factura f: this.facturas) {
			f.imprimir_factura();
		}
	}
}
