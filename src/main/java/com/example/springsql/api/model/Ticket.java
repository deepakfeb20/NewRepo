package com.example.springsql.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Entity
@Table(name="Ticket")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ticket {
	
	@Id
	@GeneratedValue
	private int id;
	private String category;
	private double amount;
	
	/*
	 * public Ticket() {
	 * 
	 * }
	 * 
	 * public Ticket(int id, String category, double amount) { super(); this.id =
	 * id; this.category = category; this.amount = amount; }
	 * 
	 * public int getId() { return id; } public void setId(int id) { this.id = id; }
	 * public String getCategory() { return category; } public void
	 * setCategory(String category) { this.category = category; } public double
	 * getAmount() { return amount; } public void setAmount(double amount) {
	 * this.amount = amount; }
	 */
	

}
