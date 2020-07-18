package com.moviecatalog.model;

import java.io.Serializable;

public class MovieCatalog implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4230130567000754072L;

	private long movieid;

	private String movieName;

	private String genre;
	private String description;

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public long getMovieid() {
		return movieid;
	}

	public void setMovieid(long movieid) {
		this.movieid = movieid;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
