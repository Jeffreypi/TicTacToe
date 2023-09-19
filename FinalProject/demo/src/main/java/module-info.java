module tictactoe {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    requires transitive javafx.base;

    opens tictactoe to javafx.fxml;
    exports tictactoe;
}
