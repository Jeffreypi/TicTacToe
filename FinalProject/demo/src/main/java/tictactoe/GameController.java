package tictactoe;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.ResourceBundle;

//import javax.swing.Action;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;

public class GameController implements Initializable{

    @FXML
    private Button button1;

    public void one(ActionEvent event) {

        if(button1.getText().isBlank()){
        button1.setText("X");
        button1.setStyle("-fx-font-size: 30px; -fx-text-fill: green;");
        checkWinner();
        Button emptyButton = getEmptyButton();
            if (emptyButton != null) {
                emptyButton.setText("O");
                emptyButton.setStyle("-fx-font-size: 30px; -fx-text-fill: red;");
            }
            checkWinner();
    }}
    

    @FXML
    private Button button2;

    public void two(ActionEvent event) {
        if(button2.getText().isBlank()){
            button2.setText("X");
            button2.setStyle("-fx-font-size: 30px; -fx-text-fill: green;");
            checkWinner();
            Button emptyButton = getEmptyButton();
            if (emptyButton != null) {
                emptyButton.setText("O");
                emptyButton.setStyle("-fx-font-size: 30px; -fx-text-fill: red;");
            }
            checkWinner();
        
    }}

    @FXML
    private Button button3;
    public void three(ActionEvent event) {
        if(button3.getText().isBlank()){
            button3.setText("X");
            button3.setStyle("-fx-font-size: 30px; -fx-text-fill: green;");
            checkWinner();
            Button emptyButton = getEmptyButton();
            if (emptyButton != null) {
                emptyButton.setText("O");
                emptyButton.setStyle("-fx-font-size: 30px; -fx-text-fill: red;");
            }
            checkWinner();
    }}

    @FXML
    private Button button4;
    public void four(ActionEvent event) {
        if(button4.getText().isBlank()){
            button4.setText("X");
            button4.setStyle("-fx-font-size: 30px; -fx-text-fill: green;");
            checkWinner();
            Button emptyButton = getEmptyButton();
            if (emptyButton != null) {
                emptyButton.setText("O");
                emptyButton.setStyle("-fx-font-size: 30px; -fx-text-fill: red;");
            }
            checkWinner();
    }}

    @FXML
    private Button button5;

    public void five(ActionEvent event) {
        if(button5.getText().isBlank()){
            button5.setText("X");
            button5.setStyle("-fx-font-size: 30px; -fx-text-fill: green;");
            checkWinner();
            Button emptyButton = getEmptyButton();
            if (emptyButton != null) {
                emptyButton.setText("O");
                emptyButton.setStyle("-fx-font-size: 30px; -fx-text-fill: red;");
            }
            checkWinner();
    }}

    @FXML
    private Button button6;

    public void six(ActionEvent event) {
        if(button6.getText().isBlank()){
            button6.setText("X");
            button6.setStyle("-fx-font-size: 30px; -fx-text-fill: green;");
            checkWinner();
            Button emptyButton = getEmptyButton();
            if (emptyButton != null) {
                emptyButton.setText("O");
                emptyButton.setStyle("-fx-font-size: 30px; -fx-text-fill: red;");
            }
            checkWinner();
    }}

    @FXML
    private Button button7;

    public void seven(ActionEvent event) {
        if(button7.getText().isBlank()){
            button7.setText("X");
            button7.setStyle("-fx-font-size: 30px; -fx-text-fill: green;");
            checkWinner();
            Button emptyButton = getEmptyButton();
            if (emptyButton != null) {
                emptyButton.setText("O");
                emptyButton.setStyle("-fx-font-size: 30px; -fx-text-fill: red;");
            }
            checkWinner();
    }}

    @FXML
    private Button button8;

    public void eight(ActionEvent event) {
        if(button8.getText().isBlank()){
            button8.setText("X");
            button8.setStyle("-fx-font-size: 30px; -fx-text-fill: green;");
            checkWinner();
            Button emptyButton = getEmptyButton();
            if (emptyButton != null) {
                emptyButton.setText("O");
                emptyButton.setStyle("-fx-font-size: 30px; -fx-text-fill: red;");
            }
            checkWinner();
        
    }}

    @FXML
    private Button button9;

    public void nine(ActionEvent event) {
        if(button9.getText().isBlank()){
            button9.setText("X");
            button9.setStyle("-fx-font-size: 30px; -fx-text-fill: green;");
            checkWinner();
            Button emptyButton = getEmptyButton();
            if (emptyButton != null) {
                emptyButton.setText("O");
                emptyButton.setStyle("-fx-font-size: 30px; -fx-text-fill: red;");
            }
            checkWinner();
            
    }}

    @FXML
    private Button restart;

    
    public void restart(ActionEvent event){
        
        for (Button button : buttons){
            button.setText("");
            button.setTextFill(null);
            getEmptyButton();
            
        }
     }

    

    
    private List<Button> buttons;

    private Button getEmptyButton(){
        List<Button> emptyButton = new ArrayList<>();
        for (Button button : buttons) {
            if (button.getText().isBlank()) {
                emptyButton.add(button);
            }
        }
        if (emptyButton.isEmpty()) {
            return null;
        }
        Random random = new Random();
        int index = random.nextInt(emptyButton.size());
        return emptyButton.get(index);
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        buttons = new ArrayList<>();
        buttons.add(button1);
        buttons.add(button2);
        buttons.add(button3);
        buttons.add(button4);
        buttons.add(button5);
        buttons.add(button6);
        buttons.add(button7);
        buttons.add(button8);
        buttons.add(button9);
    }

    public void checkWinner(){
        if (button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X") 
        || button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X") 
        || button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")
        || button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")
        || button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")
        || button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")
        || button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")
        || button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X")){
            xWinner();
            
            

        }
        else if(
            button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O") 
        || button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O") 
        || button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")
        || button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")
        || button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O")
        || button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")
        || button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O")
        || button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O"))
        {
            oWinner();
        }
        else if(buttons.isEmpty()) {
            tie();
        }
        
    
    }
    
    private void xWinner(){
        playerScore++;
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setContentText("Congratulations! You Won!!!");
        alert.getButtonTypes().clear();
        ButtonType closeButton = new ButtonType("Close", ButtonData.CANCEL_CLOSE);
        ButtonType rematchButton = new ButtonType("Rematch", ButtonData.APPLY);
        alert.getButtonTypes().addAll(closeButton, rematchButton);
        yourScore.setText("Your Score: " + playerScore);
        Optional<ButtonType> result = alert.showAndWait();
        if(result.get() == rematchButton) {
            restart(null);
        }
        
        
    }
    private void oWinner(){
        computerScore++;
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setContentText("Oh no! You Lost!");
        alert.getButtonTypes().clear();
        ButtonType closeButton = new ButtonType("Close", ButtonData.CANCEL_CLOSE);
        ButtonType rematchButton = new ButtonType("Rematch", ButtonData.APPLY);
        alert.getButtonTypes().addAll(closeButton, rematchButton);
        compScore.setText("Computer Score: " + computerScore);
        Optional<ButtonType> result = alert.showAndWait();
        if(result.get() == rematchButton) {
            restart(null);
        }
        
    }
    private void tie(){
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setContentText("You Tied!");
        alert.getButtonTypes().clear();
        ButtonType closeButton = new ButtonType("Close", ButtonData.CANCEL_CLOSE);
        ButtonType rematchButton = new ButtonType("Rematch", ButtonData.APPLY);
        alert.getButtonTypes().addAll(closeButton, rematchButton);
        Optional<ButtonType> result = alert.showAndWait();
        if(result.get() == rematchButton) {
            restart(null);
        }
    }

    @FXML
    private Label yourScore;
    
    @FXML
    private Label compScore;

    private int playerScore = 0;
    private int computerScore = 0;


    

}
