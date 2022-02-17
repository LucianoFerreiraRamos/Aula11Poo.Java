package aula11poo;
public class Professor extends Pessoa{
	private float salario;
	private String especialização;
	
	public void receberAumento() {
		
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getEspecialização() {
		return especialização;
	}

	public void setEspecialização(String especialização) {
		this.especialização = especialização;
	}
	
}
