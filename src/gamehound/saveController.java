package gamehound;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class saveController implements Initializable {


    saveGames save = new saveGames();
    String savedList = "";
    ObservableList<String> list = save.getPrefs();

    @FXML
    private ListView<String> gameList;

    public saveController() throws IOException {
    }

    public void initialize(URL location, ResourceBundle resources) {

        gameList.setItems(list);

    }

    public void buttonPress(ActionEvent actionEvent) throws IOException {

        Parent pane = FXMLLoader.load(getClass().getResource("menu.fxml"));
        Scene nextScene = new Scene(pane);

        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(nextScene);
        window.show();

    }
}
