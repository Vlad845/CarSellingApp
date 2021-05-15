package Controllers;

import exceptions.CouldNotWriteAnnouncementException;
import exceptions.UsernameAlreadyExistsException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.User;
import services.AnnouncementService;
import services.UserService;

import javax.xml.soap.Text;
import java.awt.event.ActionEvent;
import java.io.IOException;


public class PostAnnouncementController {
    @FXML
    private Label BrandLabel;

    @FXML
    private Label ColorLabel;

    @FXML
    private Label EngineLabel;

    @FXML
    private Label MileageLabel;

    @FXML
    private Label HorsePowerLabel;

    @FXML
    private Label YearOfFabricationLabel;

    @FXML
    private TextField BrandTxt;

    @FXML
    private TextField ColorTxt;

    @FXML
    private TextField EngineTxt;

    @FXML
    private TextField MileageTxt;

    @FXML
    private TextField HorsePowerTxt;

    @FXML
    private TextField YearOfFabricationTxt;

    @FXML
    private TextArea ExtraDetailsTxt;

    @FXML
    private Button PostButton;

    @FXML
    private Button ReturnButton;

    @FXML
    private TextField MobilePhoneTxt;

    @FXML
    private TextField EmailTxt;

    @FXML
    private Text ContacInfoText;

    @FXML
    void BrandTxtAction(ActionEvent event) {

    }

    @FXML
    void ColorTxtAction(ActionEvent event) {

    }

    @FXML
    void EmailTxtAction(ActionEvent event) {

    }


    @FXML
    void EngineTxtAction(ActionEvent event) {

    }

    @FXML
    void HorsePowerAction(ActionEvent event) {

    }

    @FXML
    void MileageTxtAction(ActionEvent event) {

    }

    @FXML
    void MobilePhoneTxtAction(ActionEvent event) {

    }

    @FXML
    void PostButtonAction(ActionEvent event) {

    }

    @FXML
    void ReturnToPrevious(ActionEvent event) {

    }

    @FXML
    void YearOfFabricationTxtAction(ActionEvent event) {

    }

    public void BrandTxtAction(javafx.event.ActionEvent actionEvent) {
    }

    public void ColorTxtAction(javafx.event.ActionEvent actionEvent) {
    }

    public void EngineTxtAction(javafx.event.ActionEvent actionEvent) {
    }

    public void MileageTxtAction(javafx.event.ActionEvent actionEvent) {
    }

    public void HorsePowerAction(javafx.event.ActionEvent actionEvent) {
    }

    public void YearOfFabricationTxtAction(javafx.event.ActionEvent actionEvent) {
    }

    public void MobilePhoneTxtAction(javafx.event.ActionEvent actionEvent) {
    }

    public void EmailTxtAction(javafx.event.ActionEvent actionEvent) {
    }

    public void PostButtonAction(javafx.event.ActionEvent actionEvent) {

        try {
            AnnouncementService.addAnnouncement(BrandTxt.getText(), ColorTxt.getText(), EngineTxt.getText(),MileageTxt.getText(),HorsePowerTxt.getText(),
                    YearOfFabricationTxt.getText(),ExtraDetailsTxt.getText(),MobilePhoneTxt.getText(),EmailTxt.getText());
            //registrationMessage.setText("Account created successfully!");
        } catch (CouldNotWriteAnnouncementException e) {
            //registrationMessage.setText(e.getMessage());
        }
    }


    public void ReturnToPrevious(javafx.event.ActionEvent actionEvent) throws IOException {

        Parent AnnouncementFormat = FXMLLoader.load(getClass().getResource("/MainPageSeller.fxml"));
        Scene AnnouncementFormatScene = new Scene(AnnouncementFormat);

        //Here we get the stage information
        Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(AnnouncementFormatScene);
        window.show();

    }




}
