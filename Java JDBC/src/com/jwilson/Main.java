package com.jwilson;

import com.jwilson.model.Datasource;

public class Main {

	public static void main(String[] args) {

		
		Datasource datasource = new Datasource();
		if(!datasource.open()){
			System.out.println("Cannot open datasource");
		}else{
			System.out.println("Datasource opened correctly");
		}
	}
}
