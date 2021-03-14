package application;

import classes.Ayuda;
import classes.Cliente;
import classes.Comercio;
import classes.Comida;

public class App {
	public static void main(String[] args) {
		//Creamos Clientes
		Cliente c1=new Cliente("0801-2001-03042","Cristian Rivera","Col Cerro Grande Z2",1);
		Cliente c2=new Cliente("0801-2000-05442","Kimberly Raudales","Res Rancho Lima",2);
		
		Ayuda a1=new Ayuda("Mario Aguilar");
		Ayuda a2= new Ayuda("Mary Varela");
		//Creamos Comercios 
		//Comercio1
		Comercio com1=new Comercio("Wendys","Ensalada, Comida Buffet y Comida Rapida");
		//Menu
		Comida comida1 = new Comida("Pollo con papas",120);
		Comida comida2 = new Comida("Pollo con tajadas",100);
		Comida comida3 = new Comida("Pizza Gigante",200);
		Comida comida4 = new Comida("Ensalada Cesar",250);
		Comida comida5 = new Comida("Costillas de cerdo",300);
		
		c1.agregar_comercio(com1);
		com1.imprimir_comercio();
		com1.agregar_comida(comida1);
		com1.agregar_comida(comida2);
		com1.agregar_comida(comida3);
		com1.agregar_comida(comida4);
		com1.agregar_comida(comida5);
		com1.imprimir_menu();
		
		//Comercio2
		Comercio com2=new Comercio("KFS","Comida Rapida, Ensalada y comida buffet");
		//Menu
		Comida comida6 = new Comida("Pollo Frito",120);
		Comida comida7 = new Comida("Pollo Asado",150);
		Comida comida8 = new Comida("Alitas de Pollo",120);
		Comida comida9 = new Comida("Ensalada Cesar",250);
		Comida comida10 = new Comida("Hamburguesa de pollo",60);
				
		c1.agregar_comercio(com2);
		com2.imprimir_comercio();
		com2.agregar_comida(comida6);
		com2.agregar_comida(comida7);
		com2.agregar_comida(comida8);
		com2.agregar_comida(comida9);
		com2.agregar_comida(comida10);
		com2.imprimir_menu();
				
		//Comercio3
		Comercio com3=new Comercio("Pizza hut","Pastas, Comida Rapida y Ensaladas");
		//Menu
		Comida comida11 = new Comida("Pizza",99);
		Comida comida12 = new Comida("Pizza Orilla de Queso",200);
		Comida comida13 = new Comida("Croasan",150);
		Comida comida14 = new Comida("Ensalada Cesar",250);
		Comida comida15 = new Comida("Pizza Mixta",199);
						
		c1.agregar_comercio(com3);
		com3.imprimir_comercio();
		com3.agregar_comida(comida11);
		com3.agregar_comida(comida12);
		com3.agregar_comida(comida13);
		com3.agregar_comida(comida14);
		com3.agregar_comida(comida15);
		com3.imprimir_menu();
		
		//Comercio4
		Comercio com4=new Comercio("Coco Baleadas","Harinas y Comida Rapida");
		//Menu
		Comida comida16 = new Comida("Mega Baleada",120);
		Comida comida17 = new Comida("Baleada Sencilla",30);
		Comida comida18 = new Comida("Baleada con todo",55);
		Comida comida19 = new Comida("Chancletas",40);
		Comida comida20 = new Comida("Flautas",60);
						
		c1.agregar_comercio(com4);
		com4.imprimir_comercio();
		com4.agregar_comida(comida16);
		com4.agregar_comida(comida17);
		com4.agregar_comida(comida18);
		com4.agregar_comida(comida19);
		com4.agregar_comida(comida20);
		com4.imprimir_menu();
		
		//Comercio5
		Comercio com5=new Comercio("burger king","Comida Rapida, Ensalada y Postre");
		//Menu
		Comida comida21 = new Comida("Whopper",120);
		Comida comida22 = new Comida("Whopper jr",100);
		Comida comida23 = new Comida("Hamburguesa de pollo",100);
		Comida comida24 = new Comida("Mcfury",30);
		Comida comida25 = new Comida("Hamburguesa de queso",60);
						
		c1.agregar_comercio(com5);
		com5.imprimir_comercio();
		com5.agregar_comida(comida21);
		com5.agregar_comida(comida22);
		com5.agregar_comida(comida23);
		com5.agregar_comida(comida24);
		com5.agregar_comida(comida20);
		com5.imprimir_menu();
		//Comercio6
		Comercio com6=new Comercio("Chylis","Ensalada, Comida Rapida y pastas");
		//Menu
		Comida comida26 = new Comida("Ensalada",220);
		Comida comida27 = new Comida("Costilla",350);
		Comida comida28 = new Comida("Hamburguesa",220);
		Comida comida29 = new Comida("Alitas",250);
		Comida comida30 = new Comida("Pollo",160);
						
		c1.agregar_comercio(com6);
		com6.imprimir_comercio();
		com6.agregar_comida(comida26);
		com6.agregar_comida(comida27);
		com6.agregar_comida(comida28);
		com6.agregar_comida(comida29);
		com6.agregar_comida(comida30);
		com6.imprimir_menu();
		//Comercio7
		Comercio com7=new Comercio("Dennis","Comida Rapida , Ensalada y Comida Buffet");
		//Menu
		Comida comida31 = new Comida("Pollo Frito",120);
		Comida comida32 = new Comida("Costilla de cerdo",250);
		Comida comida33 = new Comida("Alitas de Pollo con papas",220);
		Comida comida34 = new Comida("Ensalada Cesar",270);
		Comida comida35 = new Comida("Hamburguesa",180);
						
		c1.agregar_comercio(com7);
		com7.imprimir_comercio();
		com7.agregar_comida(comida31);
		com7.agregar_comida(comida32);
		com7.agregar_comida(comida33);
		com7.agregar_comida(comida34);
		com7.agregar_comida(comida35);
		com7.imprimir_menu();
		//Comercio8
		Comercio com8=new Comercio("La Cumbre","Comida Buffet, Postres");
		//Menu
		Comida comida36 = new Comida("Cena Romantica",720);
		Comida comida37 = new Comida("Pollo en Salsa",450);
		Comida comida38 = new Comida("Carne fina",550);
		Comida comida39 = new Comida("Sopa",350);
		Comida comida40 = new Comida("Filete decorado",760);
						
		c1.agregar_comercio(com8);
		com8.imprimir_comercio();
		com8.agregar_comida(comida36);
		com8.agregar_comida(comida37);
		com8.agregar_comida(comida38);
		com8.agregar_comida(comida39);
		com8.agregar_comida(comida40);
		com8.imprimir_menu();
		//Comercio9
		Comercio com9=new Comercio("Sal Y Pimienta","Comida Buffet");
		//Menu
		Comida comida41 = new Comida("Pollo Olanchano",100);
		Comida comida42 = new Comida("Desayunos",35);
		Comida comida43 = new Comida("Almuerzo",70);
		Comida comida44 = new Comida("Cena",45);
		Comida comida45 = new Comida("Sopas",60);
						
		c1.agregar_comercio(com9);
		com9.imprimir_comercio();
		com9.agregar_comida(comida41);
		com9.agregar_comida(comida42);
		com9.agregar_comida(comida43);
		com9.agregar_comida(comida44);
		com9.agregar_comida(comida45);
		com9.imprimir_menu();
		//Comercio10
		Comercio com10=new Comercio("Mcdonald","Comida Rapida");
		//Menu
		Comida comida46 = new Comida("Hamburguesa",55);
		Comida comida47 = new Comida("Nuggets de pollo con papas",70);
		Comida comida48 = new Comida("Alitas de Pollo",120);
		Comida comida49 = new Comida("Ensalada Cesar",250);
		Comida comida50 = new Comida("Hamburguesa grande",130);
						
		c1.agregar_comercio(com10);
		com10.imprimir_comercio();
		com10.agregar_comida(comida46);
		com10.agregar_comida(comida47);
		com10.agregar_comida(comida48);
		com10.agregar_comida(comida49);
		com10.agregar_comida(comida50);
		com10.imprimir_menu();
		
		//Cliente1
		c1.agregar_comida(comida25);
		c1.agregar_comida(comida8);
		
		c1.imprimir_carrito();
		a1.crear_factura(c1);
		c1.imprimir_factura();
		
		//cliente2
		c2.agregar_comida(comida46);
		c2.agregar_comida(comida41);
		c2.agregar_comida(comida39);
		
		c2.imprimir_carrito();
		a2.crear_factura(c2);
		c2.imprimir_factura();
		
	}

}
