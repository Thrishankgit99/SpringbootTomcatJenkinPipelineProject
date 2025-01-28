package com.org.java.relations;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Charger {
	
	@Id
	private int chargerId;
	
	private String chargerType;
	
	private String modelName;
	
	private double price;

}
