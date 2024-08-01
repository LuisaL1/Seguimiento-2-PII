package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginView extends VBox {

    private TextField usernameField;
    private PasswordField passwordField;
    private Button loginButton;

    public LoginView() {

        Label titleLabel = new Label("Bienvenido");
        titleLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: normal; -fx-text-fill: #444;");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(15));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setAlignment(Pos.CENTER);

        Label usernameLabel = new Label("Usuario:");
        usernameField = new TextField();
        usernameField.setStyle("-fx-border-color: #ccc; -fx-border-radius: 4px;");

        Label passwordLabel = new Label("Contraseña:");
        passwordField = new PasswordField();
        passwordField.setStyle("-fx-border-color: #ccc; -fx-border-radius: 4px;");

        loginButton = new Button("Iniciar Sesión");
        loginButton.setStyle("-fx-background-color: #5d5c5c; -fx-text-fill: white; -fx-border-radius: 4px; -fx-padding: 10 20;");

        gridPane.add(usernameLabel, 0, 0);
        gridPane.add(usernameField, 1, 0);
        gridPane.add(passwordLabel, 0, 1);
        gridPane.add(passwordField, 1, 1);
        gridPane.add(loginButton, 1, 2);

        this.setAlignment(Pos.CENTER);
        this.setSpacing(15);
        this.setPadding(new Insets(20));
        this.getChildren().addAll(titleLabel, gridPane);

        this.setMinSize(350, 250);
        gridPane.setPrefWidth(280);
    }

    public TextField getUsernameField() {
        return usernameField;
    }

    public PasswordField getPasswordField() {
        return passwordField;
    }

    public Button getLoginButton() {
        return loginButton;
    }

    public static void start(Stage primaryStage) {
        LoginView loginView = new LoginView();
        Scene scene = new Scene(loginView, 350, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login");
        primaryStage.show();
    }
}






