package com.crowdshiftdemo.quarkus.services.repository;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.crowdshiftdemo.quarkus.services.model.AcountOpenRequest;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

import org.bson.Document;

@ApplicationScoped
public class MongoRepository {

    @Inject
    MongoClient mongoClient;

    public void add(AcountOpenRequest accountopening){
        Document document = new Document()
        .append("firstName", accountopening.getFirstName())
        .append("lastName", accountopening.getLastName());
        getCollection().insertOne(document);

    }

    public List<AcountOpenRequest> getCustomers(){
        List<AcountOpenRequest> accountList = new ArrayList<>();
        MongoCursor<Document>  cursor = getCollection().find().iterator();
        try {
            while (cursor.hasNext()) {

                Document document = cursor.next();

                AcountOpenRequest actopenrequest = new AcountOpenRequest();
                actopenrequest.setId(document.getObjectId("_id").toString());
                actopenrequest.setFirstName(document.getString("firstName"));
                actopenrequest.setLastName(document.getString("lastName"));
                accountList.add(actopenrequest);
                
            }
        } finally {cursor.close();
        }
        
        return accountList;
    }

    private MongoCollection getCollection(){

        return mongoClient.getDatabase("customers").getCollection("customers");
    }
}
