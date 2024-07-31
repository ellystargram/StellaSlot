module fan.stellive.stellaslot {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens fan.stellive.stellaslot to javafx.fxml;
    exports fan.stellive.stellaslot;
}