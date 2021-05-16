import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import services.AnnouncementService;
import services.BuyedService;
import services.UserService;


import java.awt.*;

public class main extends Application {



    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        UserService.loadUsersFromFile();
        AnnouncementService.loadAnnouncementsFromFile();
        BuyedService.loadAnnouncementsFromFile();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Login.fxml"));
        primaryStage.setTitle("CarSellingApp");
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.setScene(new Scene(root, 737, 524));
        primaryStage.setResizable(false);

        primaryStage.show();
    }


}