package org.ulco;

abstract public class GraphicsObject {
    public GraphicsObject() {
        //m_ID = ++ID.ID;
        m_ID=ID.getGenerator().getID();
    }

    abstract public GraphicsObject copy();

    /*public boolean isSimple(){
        return true;
    }
    */

    public int getID() {
        return m_ID;
    }

    abstract boolean isClosed(Point pt, double distance);

    abstract void move(Point delta);

    abstract public String toJson();

    abstract public String toString();

    private int m_ID;
}
