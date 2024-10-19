package com.vendor.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.gridfs.GridFSBucket;
import com.mongodb.client.gridfs.GridFSBuckets;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoConfig {

    @Bean
    public GridFSBucket getGridFSBucket(MongoClient mongoClient) {
        return GridFSBuckets.create(mongoClient.getDatabase("Vendor"));
    }
}

