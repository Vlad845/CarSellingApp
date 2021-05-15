package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import model.Announcement;
import services.AnnouncementService;

import java.awt.event.ActionEvent;
import java.io.IOException;


public class ViewAnnouncementController {

    @FXML
    private ListView<String> ListView;

    @FXML
    private Button ReturnButton;

    @FXML
    private Label AnnouncementTXT;

    @FXML
    private Button DeleteButton;

    @FXML
    private Button EditButton;

    @FXML
    private Button ShowButton;


    @FXML
    void DeleteButtonAction(ActionEvent event) {

    }

    @FXML
    void EditButtonAction(ActionEvent event) {

    }

    @FXML
    void ReturnButtonAction(ActionEvent event) {

    }

    @FXML
    void ShowButtonAction(ActionEvent event) {

    }

    public void ReturnButtonAction(javafx.event.ActionEvent actionEvent) throws IOException {

        Parent Return = FXMLLoader.load(getClass().getResource("/MainPageSeller.fxml"));
        Scene ReturnScene = new Scene(Return);

        //Here we get the stage information
        Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(ReturnScene);
        window.show();

    }

    public void DeleteButtonAction(javafx.event.ActionEvent actionEvent) {
    }

    public void EditButtonAction(javafx.event.ActionEvent actionEvent) {
    }

    public void ShowButtonAction(javafx.event.ActionEvent actionEvent) {


    }
}
