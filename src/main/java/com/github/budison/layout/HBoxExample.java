package com.github.budison.layout;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

/**
 * @author Kevin Nowak
 */
class HBoxExample {

    public static HBox createExample() {
        HBox hBox = new HBox();
        hBox.getStyleClass().add("bg-1");
        hBox.setFillHeight(true);

        Label l1 = new Label("Label 1");
        l1.getStyleClass().add("bg-2");
        l1.setMaxHeight(Double.MAX_VALUE);

        Label l2 = new Label("Label 2");
        l2.getStyleClass().add("bg-3");
        l2.setMaxHeight(200);

        Label l3 = new Label("Label 3");
        l3.getStyleClass().add("bg-4");

        Label l4 = new Label("Label 4");
        l4.getStyleClass().add("bg-5");

        Label l5 = new Label("Label 5");
        l5.getStyleClass().add("bg-6");

        hBox.getChildren().addAll(l1, l2, l3, l4, l5);

        return hBox;
    }
}
