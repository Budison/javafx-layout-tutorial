package com.github.budison.layout;

import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

/**
 * @author Kevin Nowak
 */
class BorderPaneExample {

    static BorderPane createExample() {
        BorderPane borderPane = new BorderPane();
        borderPane.getStyleClass().add("bg-1");

        Label top = createLabel("Top", "bg-2");
        top.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        borderPane.setTop(top);

        Label left = createLabel("Left", "bg-3");
        left.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        borderPane.setLeft(left);

        Label center = createLabel("Center", "bg-4");
        center.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        borderPane.setCenter(center);

        Label right = createLabel("Right", "bg-5");
        right.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        borderPane.setRight(right);

        Label bottom = createLabel("Bottom", "bg-6");
        bottom.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        borderPane.setBottom(bottom);

        return borderPane;
    }

    private static Label createLabel(String text, String styleClass) {
        Label label = new Label(text);
        label.getStyleClass().add(styleClass);
        return label;
    }
}
