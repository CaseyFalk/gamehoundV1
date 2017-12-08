package gamehound;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class resultsController implements Initializable {

    ObservableList<String> list = getGamesList.getGamesList();
    saveGames save = new saveGames();
    String savedList = "";

    //Compare the arrays of elements gathered from the quiz to the array of games
    //to determine which games fit the user's criteria.

    @FXML
    private ListView<String> gameList;

    public resultsController() throws IOException {
    }

    public void initialize(URL location, ResourceBundle resources){

        gameList.setItems(list);

        //turn the list into a string so it can be saved
        for(String element : list){
            savedList = savedList + element + " |";
        }
        save.setPrefs(savedList);
        System.out.println(savedList);

    }

}
