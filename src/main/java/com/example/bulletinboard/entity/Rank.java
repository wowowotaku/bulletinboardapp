package com.example.bulletinboard.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "ranks")
@Data
public class Rank {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rank_id")
	private Integer rankId;
	
	@Column(name = "rank_name")
	private String rankName;
	
	@Column(name = "rank_value")
	private Integer rankValue;
}
