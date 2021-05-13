package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import exceptions.UsernameAlreadyExistsException;
import services.UserService;

public class RegisterController {

    @FXML
    private Text registrationMessage;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField usernameField;
    @FXML
    private ChoiceBox role;

    @FXML
    private TextField fullName;

    @FXML
    private Button saveButton;

    @FXML
    public void initialize() {
            role.getItems().addAll("Buyer", "Seller");
    }

    @FXML
    public void handleRegisterAction() {
        try {
            UserService.addUser(usernameField.getText(), passwordField.getText(), (String)role.getValue(),fullName.getText());
            //registrationMessage.setText("Account created successfully!");
        } catch (UsernameAlreadyExistsException e) {
            //registrationMessage.setText(e.getMessage());
        }
    }
}
