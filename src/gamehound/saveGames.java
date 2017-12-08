package gamehound;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.prefs.*;

public class saveGames {

    private Preferences prefs;
    String ID = "Saved Games";
    private String[] list;
    ObservableList<String> returnedList = FXCollections.observableArrayList();
    ;

    public void setPrefs(String games){
        prefs = Preferences.userRoot().node(this.getClass().getName());
        System.out.println(prefs.get(ID,"No games found."));
        prefs.put(ID, games);
        System.out.println(prefs.get(ID,"No games found."));
    }

    public ObservableList<String> getPrefs(){
        prefs = Preferences.userRoot().node(this.getClass().getName());
        System.out.println(prefs.get(ID, "No games found."));
        list = prefs.get(ID, "No games found.").split("\\|");
        for(String element : list){
            returnedList.add(element);
        }

        return returnedList;

    }
}
