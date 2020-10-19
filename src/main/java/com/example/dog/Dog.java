package com.example.dog;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

@Entity
@Data
public class Dog {
	@Id
	private Long id;
	private String name;
	private int age;

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
