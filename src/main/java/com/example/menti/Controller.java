package com.example.menti;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Controller {

   @FXML
   public Pane activitiesPane;
   public Pane sleepPane;
   public Pane meditationPane;
   public Pane check_list;

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
   public void addList(ActionEvent e) {
      CheckBox checkBox = new CheckBox("New Checkbox");
      checkBox.setMaxSize(150, 20);
      checkBox.setLayoutX(25);

      checkBox.selectedProperty().addListener((obs, wasSelected, isSelected) -> {
         if (!isSelected) {
            Parent parent = checkBox.getParent();
            if (parent instanceof Pane) {
               int removedIndex = ((Pane) parent).getChildren().indexOf(checkBox);
               ((Pane) parent).getChildren().remove(checkBox);
               for (int i = removedIndex; i < ((Pane) parent).getChildren().size(); i++) {
                  Node node = ((Pane) parent).getChildren().get(i);
                  if (node instanceof CheckBox) {
                     double newYPosition = calculateYPosition(i);
                     ((CheckBox) node).setLayoutY(newYPosition);
                  }
               }
            }
         }
      });

      double newYPosition = calculateYPosition(check_list.getChildren().size());
      checkBox.setLayoutY(newYPosition);
      check_list.getChildren().add(checkBox);
   }

   private double calculateYPosition(int index) {
      double spacing = 25.0;
      return Math.max(index * spacing, 0);
   }

   @FXML
   public void startButton(ActionEvent event) {
      Stage stage = new Stage();

      ScrollBack scrollBack = new ScrollBack();

      try {
         scrollBack.start(stage);
      } catch (Exception e) {
         System.out.println("Error");
      }
   }

}
