//Marcelo Aceituno R
//Full Stack JAVA 0034
//Cuenta de Banco

//Crear una clase BankAccount.
public class BankAccount {		
	
	//La clase debe tener los siguientes atributos: (string) n�mero de cuenta, (double) saldo cuenta corriente, (double) saldo cuenta de ahorros.
	private double numeroCuenta;
	private double saldoCuentaCorriente;
	private double saldoCuentaAhorro;
	//Crear una variable (static) que contenga el n�mero de cuentas creadas hasta el momento.
	public static double totalCuentas = 0;
	//Crear una variable (static) que rastree la cantidad de dinero almacenado en cada cuenta creada.
	public static double saldoCuentas = 0;
	

	public BankAccount() {					
	}
	
	public BankAccount(double n�meroCuenta, double saldoCuentaCorriente, double saldoCuentaAhorro) {
		
		this.numeroCuenta = numeroCuenta;
		this.saldoCuentaCorriente = saldoCuentaCorriente;
		this.saldoCuentaAhorro = saldoCuentaAhorro;
		//En el constructor, llamar al m�todo privado anterior, as� cada usuario tendr� un n�mero de cuenta de 10 d�gitos aleatorios.
		ctaAleatoria();
		//En el constructor, asegurarse de incrementar el contador de cuentas creadas.
		numeroCuenta++;		
	}

	//Crear un m�todo privado que retorne un n�mero de 10 d�gitos aleatorios para el n�mero de cuenta.
	public static int ctaAleatoria() {
		 double diezDigitos = 1000000000 + Math.random() * 1000000000;
		 return (int) diezDigitos;
		 //System.out.println((int)(diezDigitos));
	}

	//Crear un m�todo getter para el saldo de la cuenta corriente del usuario.
	public double getSaldoCuentaCorriente() {
		return saldoCuentaCorriente;
	}
	
	///Crear un m�todo getter para el saldo de la cuenta de ahorros del usuario.
	public double getSaldoCuentaAhorro() {
		return saldoCuentaAhorro;
	}
	
	//Crear un m�todo que permita al usuario depositar dinero en su cuenta corriente o cuenta de ahorros, aseg�rese de aumentar el total de dinero almacenado.
	public double depositoCtaAhorro(double dep) {
		double deposito = saldoCuentaAhorro += dep;
		setSaldoCuentaAhorro(deposito);
			
	return getSaldoCuentaAhorro();			
	}
	
	public double depositoCtaCorriente(double dep) {
		double deposito = saldoCuentaCorriente += dep;
		setSaldoCuentaCorriente(deposito);
			
	return getSaldoCuentaCorriente();		
	}
	
	//Getters y Setters
	public double getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(double numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public static double getNumeroCuentas() {
		return totalCuentas;
	}

	public static void setTotalCuentas(int totalCuentas) {
		BankAccount.totalCuentas = totalCuentas;
	}

	public static double getSaldoCuentas() {
		return saldoCuentas;
	}

	public static void setSaldoCuentas(double saldoCuentas) {
		BankAccount.saldoCuentas = saldoCuentas;
	}

	public void setSaldoCuentaCorriente(double saldoCuentaCorriente) {
		this.saldoCuentaCorriente = saldoCuentaCorriente;
	}

	public void setSaldoCuentaAhorro(double saldoCuentaAhorro) {
		this.saldoCuentaAhorro = saldoCuentaAhorro;
	}
	
	//Crear un m�todo para retirar dinero de una cuenta. No permita que retire dinero si tiene fondos insuficientes.
	public double giroCtaCorriente(double giro) {
		if ( getSaldoCuentaCorriente() > 0) {
			System.out.println("Girar de Cuenta Corriente $ - "+giro);
			double girar = saldoCuentaCorriente -= giro;
			setSaldoCuentaCorriente(girar);
		}else {
			System.out.println("!!No se puede girar!! Cuenta Corriente sin saldo...");
		}	
	return getSaldoCuentaCorriente();		
	}
	
	public double giroCtaAhorro(double giro) {
		if ( getSaldoCuentaAhorro() > 0) {
			System.out.println("Girar de Cuenta de Ahorro $ - "+giro);
			double girar = saldoCuentaAhorro -= giro;
			setSaldoCuentaAhorro(girar);
		}else {
			System.out.println("!!No se puede girar!! Cuenta de Ahorro sin saldo...");
		}	
	return getSaldoCuentaAhorro();		
	}
	
	//Crear un m�todo para ver el total de dinero en la cuenta corriente y en la cuenta de ahorros.
	public void totalDinero() {		
		System.out.println("Saldo Total en Cuenta Corriente $ "+getSaldoCuentaCorriente());
		System.out.println("Saldo Total en Cuenta de Ahorro $ "+getSaldoCuentaAhorro());			
	}	

}
