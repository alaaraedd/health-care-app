
package entities;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class doctors {
    String name;
   int id;
    String password;

    public doctors(int id,String name,  String password) {
         this.id = id;
        this.name = name;
        this.password = password;

    }


  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

 

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   

 
    
}
