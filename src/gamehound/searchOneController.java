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

public class searchOneController {

    @FXML
    private AnchorPane root2;
    @FXML
    private CheckBox action;
    @FXML
    private CheckBox adventure;
    @FXML
    private CheckBox strategy;
    @FXML
    private CheckBox rpg;
    @FXML
    private CheckBox shooter;
    @FXML
    private CheckBox puzzle;
    @FXML
    private CheckBox sports;
    @FXML
    private CheckBox simulation;

    public static ArrayList <String> gameGenre = new ArrayList<>();

    public void actionPressed(ActionEvent actionEvent) {
    }

    public void adventurePressed(ActionEvent actionEvent) {
    }

    public void strategyPressed(ActionEvent actionEvent) {
    }

    public void rpgPressed(ActionEvent actionEvent) {
    }

    public void shooterPressed(ActionEvent actionEvent) {
    }

    public void puzzlePressed(ActionEvent actionEvent) {
    }

    public void sportsPressed(ActionEvent actionEvent) {
    }

   

    public void buttonPressed (ActionEvent actionEvent) throws IOException // method for next button
    {

        if (action.isSelected()) {
            gameGenre.add("Action");
        }

        if (adventure.isSelected()) {
            gameGenre.add("Adventure");
        }

        if (strategy.isSelected()) {
            gameGenre.add("strategy");
        }

        if (rpg.isSelected()) {
            gameGenre.add("rpg");
        }

        if (shooter.isSelected()) {
            gameGenre.add("shooter");
        }

        if (puzzle.isSelected()) {
            gameGenre.add("puzzle");
        }

        if (sports.isSelected()) {
            gameGenre.add("sports");
        }

        

        System.out.println(gameGenre);

        Parent pane = FXMLLoader.load(getClass().getResource("searchTwo.fxml"));
        Scene nextScene = new Scene(pane);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(nextScene);
        window.show();

    }
}
