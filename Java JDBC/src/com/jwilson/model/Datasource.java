package com.jwilson.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Datasource {

	public static final String DB_NAME = "music.db";

	public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\jwilson\\Desktop\\MusicDB\\"
			+ DB_NAME;

	public static final String TABLE_ALBUMS = "albums";
	public static final String COLUMN_ALBUM_ID = "_id";
	public static final String COLUMN_ALBUM_NAME = "name";
	public static final String COLUMN_ALBUM_ARTIST = "artist";

	public static final String TABLE_ARTISTS = "artists";
	public static final String COLUMN_ARTIST_ID = "_id";
	public static final String COLUMN_ARTIST_NAME = "name";

	public static final String TABLE_SONGS = "songs";
	public static final String COLUMN_SONG_TRACK = "track";
	public static final String COLUMN_SONG_TITLE = "title";
	public static final String COLUMN_SONG_ALBUM = "album";

	private Connection conn;

	public boolean open() {
		try {
			conn = DriverManager.getConnection(CONNECTION_STRING);
			return true;
		} catch (SQLException e) {
			System.out.println("Couldn't connect to database: "
					+ e.getMessage());
			return false;
		}
	}

	public void close() {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("Couldn't close connection: " + e.getMessage());
		}
	}

	public List<Artist> queryArtists() {
		Statement statement = null;

		ResultSet results = null;
		try {
			statement = conn.createStatement();
			results = statement.executeQuery("SELECT * FROM " + TABLE_ARTISTS);
			List<Artist> artists = new ArrayList<>();

			while (results.next()) {
				Artist artist = new Artist();
				artist.setId(results.getInt(COLUMN_ARTIST_ID));
				artist.setName(results.getString(COLUMN_ARTIST_NAME));
				//artist.add(artist);
			}

		} catch (SQLException e) {

		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				// error
			}
		}
		return null;

	}
}
