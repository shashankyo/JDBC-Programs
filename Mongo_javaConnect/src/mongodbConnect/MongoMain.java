package mongodbConnect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.bson.Document;

import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates; 

public class MongoMain {
public static void main(String[] args) {
	
//	Create a Collection

//	 Creating a Mongo client 
//    MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
//   
//    // Creating Credentials 
//    MongoCredential credential; 
//    credential = MongoCredential.createCredential("sampleUser", "myDb", 
//       "password".toCharArray()); 
//    System.out.println("Connected to the database successfully");  
//    
//    //Accessing the database 
//    MongoDatabase database = mongo.getDatabase("myDb");  
//    
//    //Creating a collection 
//    database.createCollection("sampleCollection"); 
//    System.out.println("Collection created successfully"); 
    
	
//	Insert a Document

//  Creating a Mongo client
// 	MongoClient mongo = new MongoClient( "localhost" , 27017 );
// 	
// 	// Accessing the database
// 	MongoDatabase database = mongo.getDatabase("myDb");
// 	
// 	// Creating a collection
// 	database.createCollection("sampleCollection2");
// 	System.out.println("Collection created successfully");
// 	
// 	// Retrieving a collection
// 	MongoCollection<Document> collection = database.getCollection("sampleCollection2");
// 	System.out.println("Collection sampleCollection selected successfully");
// 	Document document = new Document("title", "MongoDB")
// 	.append("description", "database")
// 	.append("likes", 100)
// 	.append("url", "http://www.tutorialspoint.com/mongodb/")
// 	.append("by", "tutorials point");
// 	
// 	//Inserting document into the collection
// 	collection.insertOne(document);
// 	System.out.println("Document inserted successfully");
	
//	Listing All the Collections

	 // Creating a Mongo client 
//    MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
//    // Creating Credentials 
//    MongoCredential credential; 
//    credential = MongoCredential.createCredential("sampleUser", "my_database", 
//       "password".toCharArray()); 
//    System.out.println("Connected to the database successfully");  
//    
//    // Accessing the database 
//    MongoDatabase database = mongo.getDatabase("my_database"); 
//    System.out.println("Collection created successfully"); 
//    for (String name : database.listCollectionNames()) { 
//       System.out.println(name); 
//    } 
	
	
	//Dropping collection
	// Creating a Mongo client 
//    MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
//    // Creating Credentials 
//    MongoCredential credential; 
//    credential = MongoCredential.createCredential("sampleUser", "myDb", 
//       "password".toCharArray()); 
//    System.out.println("Connected to the database successfully");  
//    
//    // Accessing the database 
//    MongoDatabase database = mongo.getDatabase("myDb");  
//    
//    // Creating a collection 
//    System.out.println("Collections created successfully"); 
//    // Retrieving a collection
//    MongoCollection<Document> collection = database.getCollection("sampleCollection");
//    // Dropping a Collection 
//    collection.drop(); 
//    System.out.println("Collection dropped successfully");
	
	
//	Deleting a document
	 // Creating a Mongo client 
//    MongoClient mongo = new MongoClient( "localhost" , 27017 );
//    
//    // Creating Credentials 
//    MongoCredential credential; 
//    credential = MongoCredential.createCredential("sampleUser", "myDb", 
//       "password".toCharArray()); 
//    System.out.println("Connected to the database successfully");  
//    
//    // Accessing the database 
//    MongoDatabase database = mongo.getDatabase("myDb"); 
//    // Retrieving a collection
//    MongoCollection<Document> collection = database.getCollection("sampleCollection1");
//    System.out.println("Collection sampleCollection selected successfully"); 
//    // Deleting the documents 
//    collection.deleteOne(Filters.eq("title", "MongoDB")); 
//    System.out.println("Document deleted successfully...");  
//    
//    // Retrieving the documents after updation 
//    // Getting the iterable object 
//    FindIterable<Document> iterDoc = collection.find(); 
//    int i = 1; 
//    // Getting the iterator 
//    Iterator it = iterDoc.iterator(); 
//    while (it.hasNext()) {  
//       System.out.println(it.next());  
//       i++; 
//    }       
	

//	Retrieve All Documents

	// Creating a Mongo client
//	MongoClient mongo = new MongoClient( "localhost" , 27017 );
//	
//	// Creating Credentials
//	MongoCredential credential;
//	credential = MongoCredential.createCredential("sampleUser", "myDb", "password".toCharArray());
//	System.out.println("Connected to the database successfully");
//	
//	// Accessing the database
//	MongoDatabase database = mongo.getDatabase("myDb");
//	
//	// Retrieving a collection
//	MongoCollection<Document> collection = database.getCollection("sampleCollection");
//	System.out.println("Collection sampleCollection selected successfully");
//	Document document1 = new Document("title", "MongoDB")
//	.append("description", "database")
//	.append("likes", 100)
//	.append("url", "http://www.tutorialspoint.com/mongodb/")
//	.append("by", "tutorials point");
//	Document document2 = new Document("title", "RethinkDB")
//	.append("description", "database")
//	.append("likes", 200)
//	.append("url", "http://www.tutorialspoint.com/rethinkdb/")
//	.append("by", "tutorials point");
//	List<Document> list = new ArrayList<Document>();
//	list.add(document1);
//	list.add(document2);
//	collection.insertMany(list);
//	// Getting the iterable object
//	FindIterable<Document> iterDoc = collection.find();
//	int i = 1;
//	// Getting the iterator
//	Iterator it = iterDoc.iterator();
//	while (it.hasNext()) {
//		System.out.println(it.next());
//		i++;
//	}
	
	//Updating document
	// Creating a Mongo client 
//    MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
//   
//    // Creating Credentials 
//    MongoCredential credential; 
//    credential = MongoCredential.createCredential("sampleUser", "myDb", 
//       "password".toCharArray()); 
//    System.out.println("Connected to the database successfully");  
//    
//    // Accessing the database 
//    MongoDatabase database = mongo.getDatabase("myDb"); 
//    // Retrieving a collection 
//    MongoCollection<Document> collection = database.getCollection("sampleCollection");
//    System.out.println("Collection myCollection selected successfully"); 
//    collection.updateOne(Filters.eq("title", "RethinkDB"), Updates.set("likes", 1500));       
//    System.out.println("Document update successfully...");  
//    
//    // Retrieving the documents after updation 
//    // Getting the iterable object
//    FindIterable<Document> iterDoc = collection.find(); 
//    int i = 1; 
//    // Getting the iterator 
//    Iterator it = iterDoc.iterator(); 
//    while (it.hasNext()) {  
//       System.out.println(it.next());  
//       i++; 
//    }     
}
}

