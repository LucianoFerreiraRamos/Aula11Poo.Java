package aula11poo;
public class Tecnico extends Pessoa {
	private String registroProfissional;
	
	public void praticar() {
		System.out.println("Praticando a atividade");
	}

	public String getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(String registroProfissional) {
		this.registroProfissional = registroProfissional;
	}
	 
}
