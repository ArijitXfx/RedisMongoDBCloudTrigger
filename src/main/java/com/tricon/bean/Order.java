package com.tricon.bean;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.aexp.nodes.graphql.annotations.GraphQLArgument;
import io.aexp.nodes.graphql.annotations.GraphQLProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document
@GraphQLProperty(name = "customer", arguments = {
		@GraphQLArgument(name = "id", type="String")
})
public class Order {
	@Id
	private String id;
	private String custId;
	private List<String> productIds;
	private Customer customer;
	private List<Product> products;
	
	public Order(String id, String custId, List<String> productIds) {
		this.id = id;
		this.custId = custId;
		this.productIds = productIds;
	}
}
