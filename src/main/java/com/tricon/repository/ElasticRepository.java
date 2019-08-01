package com.tricon.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.tricon.bean.ElasticOrder;

@Repository
public interface ElasticRepository extends ElasticsearchRepository<ElasticOrder, String>{

}
