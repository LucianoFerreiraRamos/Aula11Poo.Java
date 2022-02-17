package aula11poo;
public class Bolsista extends Aluno{
	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolso de " + this.getNome());
	}
	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " é bolsista ! pagamento falicilitado");
	}
	public float getBolsa() {
		return bolsa;
	}
	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
}
