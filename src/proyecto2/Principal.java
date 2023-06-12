
package proyecto2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Principal extends Application {

    public static void main(String[] args) {
        launch(args);
       
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root=FXMLLoader.load(getClass().getResource("ventana.fxml"));  
        Scene scene= new Scene(root);
        stage.setTitle("ventana si señores ");
        stage.setScene(scene);
        stage.show();
    }
    
    
   
    
}
