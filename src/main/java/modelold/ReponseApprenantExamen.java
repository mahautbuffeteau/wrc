package modelold;
// Generated 26 mars 2021 � 22:40:09 by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ReponseApprenantExamen generated by hbm2java
 */
@Entity
@Table(name = "reponse_apprenant_examen", catalog = "wrc")
//@Table(name = "reponse_apprenant_examen", catalog = "u575564338_wrc")
public class ReponseApprenantExamen implements java.io.Serializable {

	private Integer idReponseApprenantExamen;
	private Apprenant apprenant;
	private Examen examen;
	private Question question;
	private Reponse reponse;
	private Sujet sujet;

	public ReponseApprenantExamen() {
	}

	public ReponseApprenantExamen(Apprenant apprenant, Examen examen, Question question, Reponse reponse, Sujet sujet) {
		this.apprenant = apprenant;
		this.examen = examen;
		this.question = question;
		this.reponse = reponse;
		this.sujet = sujet;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_reponse_apprenant_examen", unique = true, nullable = false)
	public Integer getIdReponseApprenantExamen() {
		return this.idReponseApprenantExamen;
	}

	public void setIdReponseApprenantExamen(Integer idReponseApprenantExamen) {
		this.idReponseApprenantExamen = idReponseApprenantExamen;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_apprenant")
	public Apprenant getApprenant() {
		return this.apprenant;
	}

	public void setApprenant(Apprenant apprenant) {
		this.apprenant = apprenant;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_examen")
	public Examen getExamen() {
		return this.examen;
	}

	public void setExamen(Examen examen) {
		this.examen = examen;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_question")
	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_reponse")
	public Reponse getReponse() {
		return this.reponse;
	}

	public void setReponse(Reponse reponse) {
		this.reponse = reponse;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_sujet")
	public Sujet getSujet() {
		return this.sujet;
	}

	public void setSujet(Sujet sujet) {
		this.sujet = sujet;
	}

}