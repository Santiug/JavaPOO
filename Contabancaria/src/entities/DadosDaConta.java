package entities;

public class DadosDaConta {
	// AtributosDaClasse
	private int numeroDaConta;
	private String titularDaConta;
	private double saldoDaConta;

	// ConstrutoresDaClasse

	public DadosDaConta(int numeroDaConta, String titularDaConta) {
		this.numeroDaConta = numeroDaConta;
		this.titularDaConta = titularDaConta;
	}

	public DadosDaConta(int numeroDaConta, String titularDaConta, double depositoInicial) {
		this.numeroDaConta = numeroDaConta;
		this.titularDaConta = titularDaConta;
		deposito(depositoInicial);
	}
	
// Metodos getters and setters
	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public String getTitularDaConta() {
		return titularDaConta;
	}

	public void setTitularDaConta(String titularDaConta) {
		this.titularDaConta = titularDaConta;
	}

	public double getSaldoDaConta() {
		return saldoDaConta;
	}

	// Metodos
	public void deposito(double quantiaPraDeposito) {
		saldoDaConta += quantiaPraDeposito;
	}

	public void saque(double quantiaPraSaque) {
		saldoDaConta -= quantiaPraSaque + 5.0;
	}

	public String toString() {
		return "Conta: " + numeroDaConta
				+ ", Titular: " 
				+ titularDaConta 
				+ " Saldo: $ "
				+ String.format("%.2f", saldoDaConta);

	}

}
