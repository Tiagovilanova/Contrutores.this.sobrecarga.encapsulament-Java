package entities;

/*
 * Em um banco, para se cadastrar uma conta banc�ria, � necess�rio informar o
 * n�mero da conta, o nome do titular da conta, e o valor de dep�sito inicial
 * que o titular depositou ao abrir a conta. Este valor de dep�sito inicial,
 * entretanto, � opcional, ou seja: se o titular n�o tiver dinheiro a depositar
 * no momento de abrir sua conta, o dep�sito inicial n�o ser� feito e o saldo
 * inicial da conta ser�, naturalmente, zero. Importante: uma vez que uma conta
 * banc�ria foi aberta, o n�mero da conta nunca poder� ser alterado. J� o nome
 * do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasi�o
 * de casamento, por exemplo). Por fim, o saldo da conta n�o pode ser alterado
 * livremente. � preciso haver um mecanismo para proteger isso. O saldo s�
 * aumenta por meio de dep�sitos, e s� diminui por meio de saques. Para cada
 * saque realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar
 * com saldo negativo se o saldo n�o for suficiente para realizar o saque e/ou
 * pagar a taxa. Voc� deve fazer um programa que realize o cadastro de uma
 * conta, dando op��o para que seja ou n�o informado o valor de dep�sito
 * inicial. Em seguida, realizar um dep�sito e depois um saque, sempre mostrando
 * os dados da conta ap�s cada opera��o.
 */
public class Count {
	private String holder;
	private int number;
	private double balance;

	public Count(String holder, int number) {
		super();
		this.holder = holder;
		this.number = number;
	}

	public Count(String holder, int number, double initialDeposit) {
		super();
		this.holder = holder;
		this.number = number;
		deposit(initialDeposit); // this.balance=balance n�o, � melhor chamar a opera��od edeposito chamando
									// inicialDeposit como argumento
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount + 5;
	}

	public String toString() {
		return "Account " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
	}

}
