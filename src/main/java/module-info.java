module com.example.buoi3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires redis.clients.jedis;


    opens com.example.buoi3 to javafx.fxml;
    exports com.example.buoi3;
}