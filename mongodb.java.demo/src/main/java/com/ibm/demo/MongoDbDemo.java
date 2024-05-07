package com.ibm.demo;


	import org.bson.Document;

	import com.mongodb.client.FindIterable;
	import com.mongodb.client.MongoClient;
	import com.mongodb.client.MongoClients;
	import com.mongodb.client.MongoCollection;
	//import com.mongodb.client.MongoCursor;
	import com.mongodb.client.MongoDatabase;

	public class MongoDbDemo {
		public static void main(String[]args) {
			String url= "mongodb://localhost:27017";
			MongoClient client= MongoClients.create(url);
			MongoDatabase database =client.getDatabase("ibm");
			MongoCollection<Document>collection = database.getCollection("Restaurants");
			
			long docCount = collection.countDocuments();
			System.out.println(docCount);
			
			
			
			FindIterable<Document> docs = collection.find();
//			 try (MongoCursor<Document> cursor = docs.iterator()) {
//	             while (cursor.hasNext()) {
//	                 Document doc = cursor.next();
//	                 System.out.println(doc.toJson());
//	             }
//	         }
			docs.forEach(obj->{System.out.println(obj);});
			
			
			
			Document doc = docs.first();
			System.out.println(doc);
			System.out.println("End");
			
			
			
			
			
			
		}

	}


