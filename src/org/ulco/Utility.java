package org.ulco;

import java.util.Vector;

public class Utility {
    public static GraphicsObjects select(Point pt, double distance, Layer layer) {
        GraphicsObjects list = new GraphicsObjects();
        Vector<GraphicsObject> graphics_object_list=layer.getObjectList();
        for (GraphicsObject object : graphics_object_list) {
            if (object.isClosed(pt, distance)) {
                list.add(object);
            }
        }
        return list;
    }

    public static GraphicsObjects select(Point pt, double distance, Document document) {
        GraphicsObjects list = new GraphicsObjects();
        Vector<Layer> layers=document.getLayer();
        for (Layer layer : layers) {
            list.addAll(Utility.select(pt, distance, layer));
        }
        return list;
    }
}
