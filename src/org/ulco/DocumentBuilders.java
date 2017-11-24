package org.ulco;

import java.util.Iterator;
import java.util.Vector;

public class DocumentBuilders extends Document{
    public Document DocumentBuilders(Point origin, int line, int column, double length) {
        //m_layers = new Vector<Layer>();
        Document document = new Document();
        Layer layer = document.createLayer();

        for (int indexX = 0; indexX < column; ++indexX) {
            for (int indexY = 0; indexY < line; ++indexY) {
                layer.add(new Square(new Point(origin.getX() + indexX * length, origin.getY() + indexY * length), length));
            }
        }

        return document;
    }

    public Document DocumentBuilders(Point center, int number, double radius, double delta) {
        //m_layers = new Vector<Layer>();
        Document document= new Document();
        Layer layer = document.createLayer();

        for (int index = 0; index < number; ++index) {
            layer.add(new Circle(center, radius + index * delta));
        }

        return document;
    }
}
