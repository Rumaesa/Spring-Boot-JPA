package com.spring.boot.data.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "ARTIST")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class Artist {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Integer artitstId;
	
	@NonNull
	@Column(name = "NAME", length = 25)
	private String artistName;
	
	@NonNull
	@Column(name = "ADDRESS", length = 30)
	private String address;
	
	@NonNull
	@Column(name = "ARTFORM", length = 25)
	private String artForm;
	
	
}
