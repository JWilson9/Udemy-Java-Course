package com.jwilson.model;

public class Artist {

	private int id;
	private String name;
	private int artistId;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}

	public int getArtistId() {
		return artistId;
	}
}
