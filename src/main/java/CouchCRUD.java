import com.google.gson.JsonObject;
import org.lightcouch.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class CouchCRUD { // REST

    public static Response addCar(Car car) //postToCouch / post/create
    {
        CouchDbClient dbClient = new CouchDbClient();
        Response response = dbClient.save(car);
        dbClient.shutdown();
        return response;
    }

    public static Car getCarFromId(String id) // get/read
    {
        CouchDbClient dbClient = new CouchDbClient();
        try
        {
            Car foundCar = dbClient.find(Car.class,id);
            dbClient.shutdown();
            return foundCar;
        }catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Unable to find car with id " + id);
        }
        return null;
    }

    public static void updateCarDetails(Car car) //putCarDetails /put/update
    {
        CouchDbClient dbClient = new CouchDbClient();

        dbClient.update(car);
        dbClient.shutdown();
    }

    public static void deleteCar(String id)
    {
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null,"delete all records for " + id + ". Do you want to continue?","Warning Message",dialogButton);

        if(dialogResult == JOptionPane.YES_OPTION)
        {
            CouchDbClient dbClient = new CouchDbClient();
            Car car = getCarFromId(id);

            if(car != null)
            {
                dbClient.remove(car);
                JOptionPane.showMessageDialog(null,"The car with matching id " + id + " has been deleted");
            }
        }
    }

    public static List<JsonObject> listAllCars() // listAllDocs
    {
        CouchDbClient dbClient = new CouchDbClient();

          List<JsonObject> allDocs = dbClient.view("_all_docs").includeDocs(true).query(JsonObject.class);
          if (allDocs.size()==0 || allDocs.equals(null)){
              System.out.print("Empty list");
          }

          return allDocs;

    }

    public static List<JsonObject> numCarsByMake(String dbName) //mapReduce
    {
        CouchDbClient dbClient = new CouchDbClient(dbName);

        List<JsonObject> docs = dbClient.view("views/byCarMake").reduce(true).group(true).query(JsonObject.class);

        return docs;
    }

}
