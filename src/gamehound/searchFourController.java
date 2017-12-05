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


public class searchFourController {

    public static ArrayList <String> gameRating = new ArrayList<>();

    @FXML
    private AnchorPane root5;
    @FXML
    private CheckBox everyone;
    @FXML
    private CheckBox e10;
    @FXML
    private CheckBox teen;
    @FXML
    private CheckBox mature;
    

   

    public void everyonePressed(ActionEvent actionEvent) {
    }

    public void e10Pressed(ActionEvent actionEvent) {
    }

    public void teenPressed(ActionEvent actionEvent) {
    }

    public void maturePressed(ActionEvent actionEvent) {
    }

   
    public void buttonPressed (ActionEvent actionEvent) throws IOException // method for next button
    {


        if (everyone.isSelected()) {
            gameRating.add("Everyone");
        }

        if (e10.isSelected()) {
            gameRating.add("E10");
        }

        if (teen.isSelected()) {
            gameRating.add("Teen");
        }

        if (mature.isSelected()) {
            gameRating.add("Mature");
        }

        

        System.out.println(gameRating);

        Parent pane = FXMLLoader.load(getClass().getResource("results.fxml"));
        Scene nextScene = new Scene(pane);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(nextScene);
        window.show();

    }

}

