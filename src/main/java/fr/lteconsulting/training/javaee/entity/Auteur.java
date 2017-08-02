package fr.lteconsulting.training.javaee.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Auteur
{
	@Id
	@GeneratedValue( strategy = GenerationType.TABLE )
	private int id;

	@ManyToOne
	private MaisonDeDisque maison;

	@OneToMany( mappedBy = "auteur" )
	List<Chanson> chansons = new ArrayList<>();

	private String nom;

	public int getId()
	{
		return id;
	}

	public void setId( int id )
	{
		this.id = id;
	}

	public String getNom()
	{
		return nom;
	}

	public void setNom( String nom )
	{
		this.nom = nom;
	}

	public MaisonDeDisque getMaison()
	{
		return maison;
	}

	public void setMaison( MaisonDeDisque maison )
	{
		this.maison = maison;
	}
}