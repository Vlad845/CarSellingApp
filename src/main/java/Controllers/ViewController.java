package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;


public class ViewController {

    @FXML
    private Text BrandTxt;

    @FXML
    private Text ColorTxt;

    @FXML
    private Text EngineTxt;

    @FXML
    private Text MileageTxt;

    @FXML
    private Text HorsePowerTxt;

    @FXML
    private Text YearTxt;

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
    private Label YearLabel;


    public void set(String brand, String color, String engine, String yearOfFabrication, String mileage, String HorsePower) {

        BrandLabel.setText(brand);
        ColorLabel.setText(color);
        EngineLabel.setText(engine);
        YearLabel.setText(yearOfFabrication);
        MileageLabel.setText(mileage);
        HorsePowerLabel.setText(HorsePower);


    }

}
