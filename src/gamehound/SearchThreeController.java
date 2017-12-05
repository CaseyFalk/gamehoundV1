package gamehound;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;


public class SearchThreeController {

    public static ArrayList <String> gamePlayers = new ArrayList<>();

    @FXML
    private AnchorPane root4;
    @FXML
    private CheckBox SP;
    @FXML
    private CheckBox MP;
    @FXML
    private CheckBox both;
    

    public void SPPressed(ActionEvent actionEvent) {
    }

    public void MPPressed(ActionEvent actionEvent) {
    }

    public void bothPressed(ActionEvent actionEvent) {
    }

    

    public void buttonPressed (ActionEvent actionEvent) throws IOException // method for next button
    {

        if (SP.isSelected()) {
            gamePlayers.add("Single Player");
        }

        if (MP.isSelected()) {
            gamePlayers.add("Multiplayer");
        }

        if (both.isSelected()) {
            gamePlayers.add("Both");
        }


        

        System.out.println(gamePlayers);

        Parent pane = FXMLLoader.load(getClass().getResource("searchFour.fxml"));
        Scene nextScene = new Scene(pane);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(nextScene);
        window.show();

    }

}
