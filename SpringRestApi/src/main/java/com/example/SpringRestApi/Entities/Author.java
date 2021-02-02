package com.example.SpringRestApi.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int authorId;
	private String authorLastName;
	private String languageKnown;
	private String authorFirstName;
	
	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}


	public String getAuthorFirstName() {
		return authorFirstName;
	}
	
	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}
	
	public String getAuthorLastName() {
		return authorLastName;
	}
	
	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}
	
	public String getLanguageKnown() {
		return languageKnown;
	}
	
	public void setLanguageKnown(String languageKnown) {
		this.languageKnown = languageKnown;
	}
	
	public Author( String authorFirstName, String authorLastName, String languageKnown) {
		super();
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
		this.languageKnown = languageKnown;
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorLastName=" + authorLastName + ", languageKnown="
				+ languageKnown + ", authorFirstName=" + authorFirstName + "]";
	}

}
