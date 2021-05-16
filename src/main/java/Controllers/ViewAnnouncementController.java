package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Announcement;
import model.User;
import services.AnnouncementService;


import java.awt.event.ActionEvent;
import java.io.IOException;


public class ViewAnnouncementController {

    @FXML
    private Button ReturnButton;

    @FXML
    private Label AnnouncementTXT;

    @FXML
    private Button DeleteButton;


    @FXML
    private Button ShowButton;

    @FXML
    private VBox VboxView;

    @FXML
    void DeleteButtonAction(ActionEvent event) {

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

        VboxView.getChildren().clear();

        System.out.println(LogInController.getUsername());
        for (Announcement x : AnnouncementService.announcements) {

            if ((LogInController.getUsername()!=null)&&(x.getUser().equals(LogInController.getUsername()))) {

                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/View.fxml"));


                try {


                    AnchorPane pane = fxmlLoader.load();
                    ViewController ap = fxmlLoader.getController();
                    ap.set(x.getBrand(), x.getColor(), x.getEngine(), x.getYearOfFabrication(), x.getMileage(), x.getHorsePower());

                    VboxView.getChildren().add(pane);


                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        }
    }



}


