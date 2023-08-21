package com.example.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "land_description")

public class landDescription {
	@Id
	  private String landId;
private LandType landType ;
private Long price ;
private String location ;




}
