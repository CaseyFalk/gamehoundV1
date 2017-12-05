package gamehound;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class menuController {

    @FXML
    private AnchorPane root;
    @FXML
    private Button button;

    public void buttonPress(ActionEvent actionEvent) throws IOException {

        Parent pane = FXMLLoader.load(getClass().getResource("searchOne.fxml"));
        Scene nextScene = new Scene(pane);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(nextScene);
        window.show();

    }
}

