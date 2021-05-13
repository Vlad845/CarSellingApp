package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class MainPageSellerController {

    @FXML
    private Button homeButtonSeller;

    @FXML
    private Button createPost;

    @FXML
    void createPostAction(ActionEvent event) {

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

}
