package sample;

import javafx.scene.control.Alert;

/**
 * Created by Saloedov on 23.12.2016.
 */
public class utils {
    public static void createAlert(String text, Alert.AlertType type){

        Alert alert = new Alert(type);
        alert.setContentText(text);
        alert.show();
    }
}
