package classes;

public class Comida {
	public String descrip;
	public int precio;
	
	public Comida(String descripcion,int precio) {
		this.descrip=descripcion;
		this.precio=precio;
	}

	public void imprimir_datos() {
		System.out.println(this.descrip+"\t\t\t"+String.valueOf(this.precio)+"lps");
	}

}
