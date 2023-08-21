package com.example.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "land")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Land {
	  @Transient
	    public static final String SEQUENCE_NAME = "land_sequence";
	  

	    @Id
	    private long id;

	    private LandType landType ;
	    
	    private Long area;

	    private String location;
}
