
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoClientConnection {
    public static void main(String[] args) {
        String connectionString = "mongodb+srv://antoniovinialvinosilva:<T0XuKH6lJWzlKEUf>@cluster0.ugoqy.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();

        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();

        // Create a new client and connect to the server
        try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:3000")) {
                // Send a ping to confirm a successful connection
                MongoDatabase database = mongoClient.getDatabase("admin");
                MongoDatabase database = mongoClient.getDatabase("mydb");
                MongoCollection<Document> collection = database.getCollection("Usuario");
      
                // Insert a document
                Document doc = new Document("name", "")
                                    .append("age", "" )
                                    .append("city", "");
                collection.insertOne(doc);
      
                // Find a document
                Document query = new Document("name", "");
                Document result = collection.find(query).first();
                System.out.println(result.toJson());
      
                // Update a document
                Document updateQuery = new Document("name", "");
                Document update = new Document("$set", new Document("age", ""));
                collection.updateOne(updateQuery, update);
      
                // Delete a document
                collection.deleteOne(updateQuery);
            } catch (MongoException e) {
                e.printStackTrace();
            }
        }
    }
