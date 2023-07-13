package fr.eni.encheres.bo;

public class Retrait {
	private String rue ;
	private String code_postale;
	private String ville ;
	
	// construteur vide
	public Retrait() {
		}
	// construteur complet
	public Retrait(String rue, String code_postale, String ville) {
		super();
		this.rue = rue;
		this.code_postale = code_postale;
		this.ville = ville;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getCode_postale() {
		return code_postale;
	}
	public void setCode_postale(String code_postale) {
		this.code_postale = code_postale;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	@Override
	public String toString() {
		return "Retrait [rue=" + rue + ", code_postale=" + code_postale + ", ville=" + ville + "]";
	}
	
	

}
