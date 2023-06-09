package training.lab4.git.controller;
import training.lab4.git.model.Coche;

public class Main {

	public static void main(String[] args) {
		Coche rio = new Coche();
	    rio.setColor("rojo");
	    rio.setVelocidadMaxima("280 Km/h");
	    rio.setFabricante("Kia");   
	    rio.setModelo("Rio");       
	    rio.setPrecio("120.000 €");
	    rio.setCarburante("gasolina");
	    rio.arrancar();
	    
	    System.out.println("El nombre del fabricante para el modelo rio es " + rio.getFabricante());
	    System.out.println("Este es una prueba para realizar merge a partir de la nueva rama");

    
	    Coche supra = new Coche(null,null,null,null,null,null); 
	    
	    supra.setColor("gris");
	    supra.setVelocidadMaxima("280 Km/h");
	    supra.setFabricante("Toyota");   
	    supra.setModelo("Supra");       
	    supra.setPrecio("120.000 €");
	    supra.setCarburante("gasolina");
	    supra.arrancar();
	    
	    System.out.println("El nombre del fabricante para el modelo supra es " + supra.getFabricante());

	}

}

