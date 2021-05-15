package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

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