package sample;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

    public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Text text = new Text();
        text.setText("IP to connect:");
        TextField textField = new TextField();
        textField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("(?:[\\d]{1,3}\\.){3}[\\d]{1,3}")) {
                    utils.createAlert("That's not IP!", Alert.AlertType.WARNING);
                    textField.setText(oldValue);
                    //textField.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 640, 480));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
