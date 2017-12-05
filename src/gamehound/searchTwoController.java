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


public class searchTwoController {

    public static ArrayList <String> gameConsole = new ArrayList<>();

    @FXML
    private AnchorPane root3;
    
    @FXML
    private CheckBox ps3;
    @FXML
    private CheckBox ps4;
    @FXML
    private CheckBox nswitch;
    @FXML
    private CheckBox wiiU;
    @FXML
    private CheckBox xb360;
    @FXML
    private CheckBox xb1;
    @FXML
    private CheckBox ds;

   

    public void ps3Pressed(ActionEvent actionEvent) {
    }

    public void ps4Pressed(ActionEvent actionEvent) {
    }

    public void nswitchPressed(ActionEvent actionEvent) {
    }

    public void wiiUPressed(ActionEvent actionEvent) {
    }

    public void xb360Pressed(ActionEvent actionEvent) {
    }

    public void xb1Pressed(ActionEvent actionEvent) {
    }

    public void dsPressed(ActionEvent actionEvent) {
    }

    public void buttonPressed (ActionEvent actionEvent) throws IOException // method for next button
    {


        if (ps3.isSelected()) {
            gameConsole.add("Playstation 3");
        }

        if (ps4.isSelected()) {
            gameConsole.add("Playstation 4");
        }

        if (xb360.isSelected()) {
            gameConsole.add("Xbox 360");
        }

        if (ds.isSelected()) {
            gameConsole.add("Nintendo 3DS");
        }

        if (xb1.isSelected()) {
            gameConsole.add("Xbox One");
        }

        if (wiiU.isSelected()) {
            gameConsole.add("WiiU");
        }

        if (nswitch.isSelected()) {
            gameConsole.add("Nintendo Switch");
        }

        System.out.println(gameConsole);

        Parent pane = FXMLLoader.load(getClass().getResource("searchThree.fxml"));
        Scene nextScene = new Scene(pane);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(nextScene);
        window.show();

    }

}
