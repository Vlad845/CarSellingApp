package Controllers;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Announcement;
import services.AnnouncementService;

import java.io.IOException;

public class SearchPageController {

    @FXML
    private Button Cancel;

    @FXML
    void CancelAction() {
        Stage stage = (Stage) Cancel.getScene().getWindow();
        stage.close();

    }

    @FXML
    private TextField SearchBarButton;


    @FXML
    private VBox vboxAnnouncements;


    @FXML
    void SearchBarAction() {

    }

    @FXML
    void lesgobuttonAction() {

        vboxAnnouncements.getChildren().clear();

        for (Announcement x : AnnouncementService.announcements) {

            if (x.getColor().contains(SearchBarButton.getText())) {

                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/IWantToBuy.fxml"));




                try {



                    BorderPane pane = fxmlLoader.load();
                    IWantToBuyController ap = fxmlLoader.getController();
                    ap.setData(x.getBrand(), x.getColor(), x.getEngine(), x.getYearOfFabrication(), x.getMileage(), x.getPhone());

                    vboxAnnouncements.getChildren().add(pane);



                } catch (IOException e) {
                    e.printStackTrace();
                }

            }


        }


    }
}


