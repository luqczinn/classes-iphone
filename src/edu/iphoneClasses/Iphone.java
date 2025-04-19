package edu.iphoneClasses;

public class Iphone implements ReprodutorMusical, Telefone, NavegadorInternet {

	private String telefone;
	private boolean ligado;
	private String marca;
	
	
	public Iphone(String telefone, String marca) {
		this.ligado = false;
		this.telefone = telefone;
		this.marca = marca;
	}
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void ligar() {
		if (!isLigado()) {
			setLigado(true);
			System.out.println("IPHONE LIGADO");
		}
		else
			System.out.println("IPHONE JÁ ESTÁ LIGADO");
	}
	
	public void desligar() {
		if(isLigado()) {
			setLigado(false);
			System.out.println("IPHONE DESLIGADO");
		}
		else
			System.out.println("IPHONE JÁ ESTÁ DESLIGADO");
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("EXIBINDO PÁGINA");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PÁGINA");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA");
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("LIGANDO PARA" + numero);
		
	}

	@Override
	public void atender() {
		System.out.println("ATENDENDO LIGAÇÃO");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ");
		
	}

	@Override
	public void tocar() {
		System.out.println("TOCANDO MÚSICA");
		
	}

	@Override
	public void pausar() {
		System.out.println("PAUSANDO MÚSICA");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("SELECIONANDO MÚSICA: " + musica);
		
	}

	

}
