module com.example.menti {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.desktop;
<<<<<<< HEAD
=======
    requires com.jfoenix;
>>>>>>> 712c4ff (Final)
    requires javafx.swing;

    opens com.example.menti to javafx.fxml;
    exports com.example.menti;
}