
package proyecto2;

import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Principal extends Application {

    public static void main(String[] args) {
        launch(args);
        
        System.out.println("hooa mundo");
        int numero5, numero2, numero3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("escriba un perro numero ");
        numero5= teclado.nextInt();
        System.out.println("su sumero es "+numero5);
        
        
        
       
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
