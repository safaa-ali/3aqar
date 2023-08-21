package com.example.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {
	@Id
	  private String id;

	  private String firstName;
	  private String lastName;
	  private landDescription description;

}
