package com.example.menti;

import com.almasb.fxgl.entity.action.Action;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.layout.Pane;

public class Controller {

   @FXML
   public Pane activitiesPane;
   public Pane sleepPane;
   public Pane meditationPane;

   @FXML
   public void activityButton(ActionEvent e) {
      activitiesPane.setVisible(true);
      sleepPane.setVisible(false);
      meditationPane.setVisible(false);
   }

   @FXML
   public void sleepButton(ActionEvent e) {
      activitiesPane.setVisible(false);
      sleepPane.setVisible(true);
      meditationPane.setVisible(false);
   }

   @FXML
   public void meditationButton(ActionEvent e) {
      activitiesPane.setVisible(false);
      sleepPane.setVisible(false);
      meditationPane.setVisible(true);
   }
   public void startButton(ActionEvent e){

   }
}
