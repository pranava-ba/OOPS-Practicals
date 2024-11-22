import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class RegistrationFormApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Registration Form");

        // Create a GridPane for layout
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(40));

        // Create and add UI elements to the gridPane
        Label headerLabel = new Label("Registration Form");
        headerLabel.setFont(Font.font("Arial", 24));
        GridPane.setColumnSpan(headerLabel, 2);
        gridPane.add(headerLabel, 0, 0);

        gridPane.add(new Label("Full Name : "), 0, 1);
        TextField nameField = new TextField();
        gridPane.add(nameField, 1, 1);

        gridPane.add(new Label("Email ID : "), 0, 2);
        TextField emailField = new TextField();
        gridPane.add(emailField, 1, 2);

        gridPane.add(new Label("Password : "), 0, 3);
        PasswordField passwordField = new PasswordField();
        gridPane.add(passwordField, 1, 3);

        Button submitButton = new Button("Submit");
        gridPane.add(submitButton, 0, 4, 2, 1);

        submitButton.setOnAction(event -> {
            if (nameField.getText().isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Form Error!", "Please enter your name.");
                return;
            }
            if (emailField.getText().isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Form Error!", "Please enter your email.");
                return;
            }
            if (passwordField.getText().isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Form Error!", "Please enter a password.");
                return;
            }
            showAlert(Alert.AlertType.CONFIRMATION, "Registration Successful!", "Welcome " + nameField.getText());
        });

        // Create and set the scene
        Scene scene = new Scene(gridPane, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
