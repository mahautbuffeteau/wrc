package model;
// Generated 10 mars 2024, 20:46:57 by Hibernate Tools 4.3.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import modelold.Role;

/**
 * Utilisateur generated by hbm2java
 */
@Entity
@Table(name = "utilisateur", catalog = "wrc")
public class Utilisateur implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6758413235966415432L;
	private int id;
	private String login;
	private String email;
	private String password;
	private String racenet;
	private Date inscription;
	private Date dernierLogin;
	private Boolean actif;
	private Set<VerifyUtilisateur> verifyUtilisateurs = new HashSet<VerifyUtilisateur>(0);
	private Set<ChapeauUtilisateur> chapeauUtilisateurs = new HashSet<ChapeauUtilisateur>(0);
	private Set<Championnat> championnats = new HashSet<Championnat>(0);
	private Set<Role> roles;

	public Utilisateur() {
	}

	public Utilisateur(int id) {
		this.id = id;
	}

	public Utilisateur(String login, String email, String password, String racenet, Date inscription, Set<Role> roles, Boolean actif) {
		this.login = login;
		this.email = email;
		this.password = password;
		this.racenet = racenet;
		this.inscription = inscription;
		this.roles = roles;
		this.actif = actif;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "login", length = 100)
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Column(name = "email", length = 200)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "password", length = 200)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name = "actif")
	public Boolean getActif() {
		return this.actif;
	}

	public void setActif(Boolean actif) {
		this.actif = actif;
	}

	@Column(name = "racenet", length = 200)
	public String getRacenet() {
		return this.racenet;
	}

	public void setRacenet(String racenet) {
		this.racenet = racenet;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "inscription", length = 10)
	public Date getInscription() {
		return this.inscription;
	}

	public void setInscription(Date inscription) {
		this.inscription = inscription;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dernierLogin", length = 10)
	public Date getDernierLogin() {
		return this.dernierLogin;
	}

	public void setDernierLogin(Date dernierLogin) {
		this.dernierLogin = dernierLogin;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "utilisateur")
	public Set<VerifyUtilisateur> getVerifyUtilisateurs() {
		return this.verifyUtilisateurs;
	}

	public void setVerifyUtilisateurs(Set<VerifyUtilisateur> verifyUtilisateurs) {
		this.verifyUtilisateurs = verifyUtilisateurs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "utilisateur")
	public Set<ChapeauUtilisateur> getChapeauUtilisateurs() {
		return this.chapeauUtilisateurs;
	}

	public void setChapeauUtilisateurs(Set<ChapeauUtilisateur> chapeauUtilisateurs) {
		this.chapeauUtilisateurs = chapeauUtilisateurs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "utilisateur")
	public Set<Championnat> getChampionnats() {
		return this.championnats;
	}

	public void setChampionnats(Set<Championnat> championnats) {
		this.championnats = championnats;
	}

	@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_roles", catalog = "wrc", joinColumns = {
			@JoinColumn(name = "id_utilisateur", referencedColumnName = "id_utilisateur") }, inverseJoinColumns = @JoinColumn(name = "id_role", referencedColumnName = "id_role"))
	public Set<Role> getRoles() {
		return roles;
	}

	

}
