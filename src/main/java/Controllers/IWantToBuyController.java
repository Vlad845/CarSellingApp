package Controllers;

import exceptions.CouldNotWriteAnnouncementException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import services.AnnouncementService;
import services.BuyedService;

public class IWantToBuyController {

    @FXML
    private Button BuyButton;

    @FXML
    private Label BrandLabel;

    @FXML
    private Label ColorLable;

    @FXML
    private Label EngineLabel;

    @FXML
    private Label MilleageLable;

    @FXML
    private Label YearLable;

    @FXML
    private Label PhoneLable;

    @FXML
    void BuyButtonAction() {

            try {
                BuyedService.addAnnouncement(BrandLabel.getText(), ColorLable.getText(), EngineLabel.getText(),MilleageLable.getText(),EngineLabel.getText(), YearLable.getText(),PhoneLable.getText());
                //registrationMessage.setText("Account created successfully!");
            } catch (CouldNotWriteAnnouncementException e) {
                //registrationMessage.setText(e.getMessage());
            }

    }

    public void setData(String brand, String color, String engine, String yearOfFabrication, String mileage, String phone) {

        BrandLabel.setText(brand);
        ColorLable.setText(color);
        EngineLabel.setText(engine);
        MilleageLable.setText(mileage);
        YearLable.setText(yearOfFabrication);
        PhoneLable.setText(phone);


    }
}