package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import model.Producto;

public class ProductosView extends VBox {
    private TableView<Producto> tablaProductos;
    private Button btnConsultar;
    private TextField txtNombre;
    private TextField txtPrecio;
    private TextField txtUbicacion;

    public ProductosView() {
        Label mainTitle = new Label("¡Hoy estoy de suerte!");
        mainTitle.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        mainTitle.setTextFill(Color.DARKBLUE);

        Label subTitle = new Label("Buscar por...");
        subTitle.setFont(Font.font("Arial", FontWeight.NORMAL, 16));
        subTitle.setTextFill(Color.DARKGRAY);

        VBox titleBox = new VBox(5);
        titleBox.setAlignment(Pos.CENTER);
        titleBox.getChildren().addAll(mainTitle, subTitle);

        txtNombre = new TextField();
        txtNombre.setPromptText("Nombre");
        txtPrecio = new TextField();
        txtPrecio.setPromptText("Precio");
        txtUbicacion = new TextField();
        txtUbicacion.setPromptText("Ubicación");

        VBox nombreBox = new VBox(5);
        nombreBox.getChildren().addAll(new Label("Nombre:"), txtNombre);

        VBox precioBox = new VBox(5);
        precioBox.getChildren().addAll(new Label("Precio:"), txtPrecio);

        VBox ubicacionBox = new VBox(5);
        ubicacionBox.getChildren().addAll(new Label("Ubicación:"), txtUbicacion);

        // HBox para contener los VBoxes
        HBox searchBox = new HBox(20);
        searchBox.setAlignment(Pos.CENTER);
        searchBox.setPadding(new Insets(10, 20, 10, 20));
        searchBox.getChildren().addAll(nombreBox, precioBox, ubicacionBox);

        btnConsultar = new Button("Consultar Productos");
        btnConsultar.setStyle("-fx-background-color: #5d5c5c; -fx-text-fill: white; -fx-border-radius: 4px; -fx-padding: 10 20;");

        tablaProductos = new TableView<>();
        TableColumn<Producto, Number> colId = new TableColumn<>("ID");
        colId.setCellValueFactory(cellData -> cellData.getValue().idProductoProperty());

        TableColumn<Producto, String> colNombre = new TableColumn<>("Nombre");
        colNombre.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());

        TableColumn<Producto, Number> colPrecio = new TableColumn<>("Precio");
        colPrecio.setCellValueFactory(cellData -> cellData.getValue().precioProperty());

        TableColumn<Producto, String> colTipo = new TableColumn<>("Tipo");
        colTipo.setCellValueFactory(cellData -> cellData.getValue().tipoProperty());

        TableColumn<Producto, String> colUbicacion = new TableColumn<>("Ubicación");
        colUbicacion.setCellValueFactory(cellData -> cellData.getValue().ubicacionProperty());

        tablaProductos.getColumns().addAll(colId, colNombre, colPrecio, colTipo, colUbicacion);

        tablaProductos.setStyle("-fx-border-color: #5d5c5c;");

        this.setPadding(new Insets(20));
        this.setSpacing(10);
        this.setAlignment(Pos.CENTER);
        this.getChildren().addAll(titleBox, searchBox, btnConsultar, tablaProductos);

        txtNombre.setPrefWidth(150);
        txtPrecio.setPrefWidth(150);
        txtUbicacion.setPrefWidth(150);

        VBox.setMargin(btnConsultar, new Insets(10, 0, 10, 0));
    }

    public TextField getTxtNombre() {
        return txtNombre;
    }

    public TextField getTxtPrecio() {
        return txtPrecio;
    }

    public TextField getTxtUbicacion() {
        return txtUbicacion;
    }

    // Getters existentes
    public TableView<Producto> getTablaProductos() {
        return tablaProductos;
    }

    public Button getBtnConsultar() {
        return btnConsultar;
    }

    public static void start(Stage primaryStage) {
        ProductosView productosView = new ProductosView();
        Scene scene = new Scene(productosView, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Productos");
        primaryStage.show();
    }
}



