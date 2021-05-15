package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainPageSellerController {

    @FXML
    private Button homeButtonSeller;

    @FXML
    private Button createPost;

    @FXML
    private Button View;

    @FXML
    void ViewAction(ActionEvent event) throws IOException {

        Parent View = FXMLLoader.load(getClass().getResource("/ViewAnnouncement.fxml"));
        Scene ViewScene = new Scene(View);

        //Here we get the stage information
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(ViewScene);
        window.show();

    }

    @FXML
    void createPostAction(ActionEvent event) throws IOException {

        Parent AnnouncementFormat = FXMLLoader.load(getClass().getResource("/PostAnnouncement.fxml"));
        Scene AnnouncementFormatScene = new Scene(AnnouncementFormat);

        //Here we get the stage information
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(AnnouncementFormatScene);
        window.show();

    }
    @FXML
    private BorderPane MainPagePane;

    @FXML
    void homeButtonSellerAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();

        fxmlLoader.setLocation(getClass().getResource("/HomeBuyer.fxml"));



        BorderPane borderPane = fxmlLoader.load();

        MainPagePane.setCenter(borderPane);

    }

   /* public void ChangeScreenButtonPushed(ActionEvent event) throws  IOException{
        Parent AnnouncementFormat = FXMLLoader.load(getClass().getResource("PostAnnouncement.fxml"));
        Scene AnnouncementFormatScene = new Scene(AnnouncementFormat);
        //Here we get the stage information
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(AnnouncementFormatScene);
        window.show();
    }*/

}