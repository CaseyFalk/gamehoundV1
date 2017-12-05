package gamehound;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/**
 * Created by Casey on 11/28/2017.
 */
public class getGamesList{

    public static ObservableList<String> getGamesList() throws IOException {
        //numElements refers to the number of different identifiers each game has
        //for example, if each game in our program has a title, a genre, and a console associated
        //with it, then it has 3 elements.
        int numElements = 5;
        //the location of the text file containing the list of games
        String gamelist = "src/gamelist.txt";

        //BufferedReader object that allows us to count the number of
        //games being imported to properly declare the array
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(gamelist),
                        Charset.forName("UTF-8")));

        //BufferedReader object that allows us to input the information from our list of games
        BufferedReader reader2 = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(gamelist),
                        Charset.forName("UTF-8")));


        //Get the line count of the list of games (the number of games in the list)
        int games = 0;
        while (reader.readLine() != null) {
            games++;
        }
        games = games / numElements;

        //Tell us the number of games found
        System.out.println(games + " games found, evaluating...");

        //Array of all of the games
        final String gamesList[][] = new String[games][numElements];

        //Fill the array with all of the games
        String line;
        int row = 0, column = 0;
        while ((line = reader2.readLine()) != null) {
            gamesList[row][column] = line;
            line = reader2.readLine();
            column++;

            gamesList[row][column] = line;
            line = reader2.readLine();
            column++;

            gamesList[row][column] = line;
            line = reader2.readLine();
            column++;

            gamesList[row][column] = line;
            line = reader2.readLine();
            column++;

            gamesList[row][column] = line;
            column = 0;
            row++;


        }

        //Print out a list of everything in the array
        //The first number corresponds to the element of the game (0 is title, 1 is genre, etc.),
        //the second number corresponds to which game it is (0, 1, 2, 3, are all different games).
        System.out.println("\n");
        for (row = 0; row < gamesList.length; row++) {
            for (column = 0; column < gamesList[row].length; column++) {
                System.out.print(column);
                System.out.print(row + " ");
                System.out.println(gamesList[row][column]);
            }
        }

        ObservableList<String> chosenGames = FXCollections.observableArrayList();

        //**Remember, [games][elements].**
        //A horrible and messy way of getting the games based on the quiz results.
        //Basically just a terrible nesting disaster of for loops for every element being checked.
        for(column = 0; column < gamesList.length; column++){

            //gameGenre
            for(int i = 0; i < searchOneController.gameGenre.size(); i++){
            System.out.println(gamesList[column][1]);
                if(gamesList[column][1].equals(searchOneController.gameGenre.get(i))){

                    //gameConsole
                    for(i = 0; i < searchTwoController.gameConsole.size(); i++){
                        System.out.println(gamesList[column][2]);

                        if(gamesList[column][2].equals(searchTwoController.gameConsole.get(i))){ 
                            //where I started to add things in>>
                            for(i = 0; i < SearchThreeController.gamePlayers.size(); i++){
                                System.out.println(gamesList[column][3]);

                                if(gamesList[column][3].equals(SearchThreeController.gamePlayers.get(i))){
                                                              
                                    for(i = 0; i < searchFourController.gameRating.size(); i++){
                                        System.out.println(gamesList[column][4]);


                                        if(gamesList[column][4].equals(searchFourController.gameRating.get(i))){
                                                                              
                                            chosenGames.add(gamesList[column][0]);
                                        }
                                    }
                                }
                            } 
                        }
                    }
                }
            }
        }
        
                

        System.out.println(chosenGames);

        return chosenGames;
    }
}
