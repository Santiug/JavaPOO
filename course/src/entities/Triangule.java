package entities;

public class Triangule {
	
    //atributos da classe
	public double a;
	public double b;
	public double c;

	
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p* (p - a) * (p - b) * (p - c));
		
		
	}
}

/*public class Carro {
	public String Modelo;
	public String Cor;
	public int ano;
}


carro corsa, celta;
corsa = new carro();
celta = new carro(); */