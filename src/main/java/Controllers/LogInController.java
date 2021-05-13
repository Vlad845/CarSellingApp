package Controllers;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import services.UserService;

public class LogInController implements Initializable {
    @FXML
    private Button loginbutton;
    @FXML
    private TextField logintext;
    @FXML
    private PasswordField passwordtext;

    @FXML
    private void exit(ActionEvent event)
    {
        System.exit(0);
    }



    @FXML
    void loginButtonAction(ActionEvent event) throws IOException {

        if(UserService.check(logintext.getText(), passwordtext.getText()))
        {
            FXMLLoader fxmlLoader1 = new FXMLLoader();
            String role=UserService.checkOwnerOrClient(logintext.getText(),passwordtext.getText());
            if(role.equals("Buyer")) {
                fxmlLoader1.setLocation(getClass().getResource("/MainPageBuyer.fxml"));
            }
            else if(role.equals("Seller"))
            {
                fxmlLoader1.setLocation(getClass().getResource("/MainPageSeller.fxml"));
            }

            Scene scene = new Scene((Parent) fxmlLoader1.load(),1635,933);
            Stage stage1 = new Stage();


            stage1.setScene(scene);

            stage1.show();

            Stage stage = (Stage) loginbutton.getScene().getWindow();
            stage.close();

        }

    }

    @FXML
    void registerButtonAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/Register.fxml"));

        Scene scene = new Scene((Parent) fxmlLoader.load(),826,933);
        Stage stage1 = new Stage();


        stage1.setScene(scene);
        stage1.setResizable(false);
        stage1.show();
    }
    @Override
    public void initialize(URL url,ResourceBundle rb)
    {

    }
}
