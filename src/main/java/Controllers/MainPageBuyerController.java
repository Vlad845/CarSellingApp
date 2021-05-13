package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

import java.io.IOException;


public class MainPageBuyerController {

    @FXML
    private Button searchbutton;

    @FXML
    private Button homebutton;

    @FXML
    private BorderPane mainPagePane;

    @FXML
    void homeButtonAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();

        fxmlLoader.setLocation(getClass().getResource("/HomeBuyer.fxml"));



        BorderPane borderPane = fxmlLoader.load();

        mainPagePane.setCenter(borderPane);

    }

    @FXML
    void searchButtonAction(ActionEvent event) {

    }
}
