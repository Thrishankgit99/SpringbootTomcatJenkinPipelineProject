package com.org.java.relations;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Laptop {

	@Id
	private int laptopId;
	private String laptopName;
	private String modelName;
	private double price;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "lap_charger")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Charger charger;
	
	@OneToMany(targetEntity = LopAccseries.class, cascade = CascadeType.ALL)
	@JoinColumn(name ="lop_acces-fk",referencedColumnName ="laptopId")
	private List<LopAccseries> acceries;
	
	

}
