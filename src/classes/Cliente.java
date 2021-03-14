package classes;

import java.util.List;
import java.util.ArrayList;

public class Cliente {
	public int Ncomercios;
	public String id;
	public String name;
	public String dir;
	
	public List<Comida> carrito;
	
	public List<Comercio> comercios;
	
	public List<Factura> facturas;
	
	public Cliente(String id,String nombre,String direccion, int Ncomercios){
		this.id=id;
		this.name=nombre;
		this.dir=direccion;
		this.Ncomercios=Ncomercios;
		
		this.carrito = new ArrayList<Comida>();
		this.facturas = new ArrayList<Factura>();
		this.comercios=new ArrayList<Comercio>();
		
	}
	
	public void agregar_comida(Comida c) {
		this.carrito.add(c);
	}
	
	public void agregar_comercio(Comercio co) {
		this.comercios.add(co);
	}
	
	public void agregar_factura(Factura f) {
		this.facturas.add(f);
	}
	
	public void vaciar_carrito() {
		this.carrito.removeAll(this.carrito);
	}
	
	public void imprimir_carrito() {
		System.out.println("Carrito de: \t\t\t"+this.id+" - "+this.name+"\t\t La direccion de entrega es:"+this.dir+"\n");
		System.out.println("Descripcion:\t\t\tPrecio \t\t\t\t\t\t Total");
		for(Comida c:this.carrito) {
			c.imprimir_datos();
		}
		System.out.println("\t\n");
	}
	
	public void imprimir_factura() {
		for(Factura f: this.facturas) {
			f.imprimir_factura();
		}
	}
	
}
