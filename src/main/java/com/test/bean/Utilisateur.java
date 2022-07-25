package com.test.bean;

public class Utilisateur {
	private String nom;
	private String prenom;
	private String email;
	private String mot_de_passe;
	private String repete_mot_de_passe;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMot_de_passe() {
		return mot_de_passe;
	}
	public void setMot_de_passe(String mot_de_passe) {
		this.mot_de_passe = mot_de_passe;
	}
	public String getRepete_mot_de_passe() {
		return repete_mot_de_passe;
	}
	public void setRepete_mot_de_passe(String repete_mot_de_passe) {
		this.repete_mot_de_passe = repete_mot_de_passe;
	}

}
