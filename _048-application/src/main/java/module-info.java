// File managed by WebFX (DO NOT EDIT MANUALLY)

module _048.application {

    // Direct dependencies modules
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.media;

    // Exported packages
    exports com.geetloomba._048;
    exports com.geetloomba._048.model;
    exports com.geetloomba._048.view;

    // Resources packages
    opens com.geetloomba._048;
    opens editables;

    // Provided services
    provides javafx.application.Application with com.geetloomba._048.Main;

}