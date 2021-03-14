package classes;

import java.util.ArrayList;
import java.util.List;

public class Comercio{
	public String comercio;
	public String categoria;
	
	public List<Comida> carrito;
	public List<Factura> facturas;
	public List<Comida> comidas;
	
	public Comercio(String comercio,String cate) {
		this.comercio=comercio;
		this.categoria=cate;
		this.comidas=new ArrayList<Comida>();
		this.carrito=new ArrayList<Comida>();
		
		
	}
	
	public void agregar_comida(Comida c) {
		this.comidas.add(c);
	}
	
	public void imprimir_comercio() {
		System.out.println("Bienvenido a: "+this.comercio+"\t\t\t"+"nuestras categorias son: "+this.categoria+"\n");	
	}
	
	public void imprimir_menu() {
		System.out.println("Nuestro menú es: \n");
		System.out.println("Descripcion:\t\t\tPrecio");
		for(Comida c:this.comidas) {
			c.imprimir_datos();
		}
		System.out.println("\n");
	}


	public void getmarket() {
		if(categoria=="Comida Rapida") {
			System.out.println("Los negocios que cuentan con esta categoria son: \n");
		}
		else {
			System.out.println("Este negocio no cuenta con esta categoria \n");
		}
		
	}

}
