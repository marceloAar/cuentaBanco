//Marcelo Aceituno R
//Full Stack JAVA 0034
//Cuenta de Banco
public class BankTest {

	public static void main(String[] args) {
		
		BankAccount banco = new BankAccount();
		
		int ctaAleatoria = banco.ctaAleatoria();
		System.out.println("Nuevo numero de Cuenta Generada: "+ctaAleatoria);		
		
		banco.depositoCtaAhorro(50000);
		System.out.println("Deposito en Cuenta de Ahorro $ "+banco.getSaldoCuentaAhorro());	
		
		banco.depositoCtaAhorro(150000);
		System.out.println("Deposito en Cuenta de Ahorro $ "+banco.getSaldoCuentaAhorro());	
		
		banco.depositoCtaCorriente(170000);
		System.out.println("Deposito en Cuenta Corriente $ "+banco.getSaldoCuentaCorriente());		
		
		banco.depositoCtaCorriente(130000);
		System.out.println("Deposito en Cuenta Corriente $ "+banco.getSaldoCuentaCorriente());		
		
		banco.giroCtaCorriente(2000);
		
		banco.giroCtaAhorro(5000);		
		
		banco.totalDinero();	

	}

}
