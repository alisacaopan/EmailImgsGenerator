package IDrawer;

import abstractFactory.AbstractImageCreator;

import java.awt.*;

public interface Drawer {
    public void draw(AbstractImageCreator creator, Graphics2D g, String text);
}
