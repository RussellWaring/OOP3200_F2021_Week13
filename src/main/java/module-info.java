module ca.durhamcollege.oop3200_f2021_week13 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.durhamcollege.oop3200_f2021_week13 to javafx.fxml;
    exports ca.durhamcollege.oop3200_f2021_week13;
}