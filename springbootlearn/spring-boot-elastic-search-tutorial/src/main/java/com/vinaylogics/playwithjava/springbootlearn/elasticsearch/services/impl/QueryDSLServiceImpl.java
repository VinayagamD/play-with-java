package com.vinaylogics.playwithjava.springbootlearn.elasticsearch.services.impl;

import com.vinaylogics.playwithjava.springbootlearn.elasticsearch.services.QueryDSLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.stereotype.Service;

@Service
public class QueryDSLServiceImpl implements QueryDSLService {

    private final ElasticsearchRestTemplate elasticsearchRestTemplate;

    public QueryDSLServiceImpl(ElasticsearchRestTemplate elasticsearchRestTemplate) {
        this.elasticsearchRestTemplate = elasticsearchRestTemplate;
    }


}
