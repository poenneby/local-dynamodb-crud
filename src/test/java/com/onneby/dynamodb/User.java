package com.onneby.dynamodb;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

/**
 * Created by ponneby on 20/02/16.
 */
@DynamoDBTable(tableName = "User")
public class User {
    @DynamoDBHashKey
    private String id;

    public User() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}