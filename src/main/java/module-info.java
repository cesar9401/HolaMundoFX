module com.company.holamundofx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.company.holamundofx to javafx.fxml;
    exports com.company.holamundofx;
}