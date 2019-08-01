package com.tricon.bean;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(indexName = "elasticorder", type = "elasticorder")
public class ElasticOrder {

	@Id
	private String id;
	private String custId;
	private List<String> productIds;
}
