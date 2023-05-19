/*
 * @author : @MJ
 * Date    : 5/19/2023
 * Time    : 11:10 AM
 * Project : INP
 * Created by IntelliJ IDEA.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class AppInitializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("view/DashboardForm.fxml")))));
        primaryStage.setTitle("Chat App");
        primaryStage.show();
    }
}
