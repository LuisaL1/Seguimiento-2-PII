module co.edu.cue.productosappmvc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens co.edu.cue.productosappmvc to javafx.fxml;
    exports co.edu.cue.productosappmvc;
}