package uk.co.deanwild.materialshowcaseview.target;

import android.graphics.Point;
import android.graphics.Rect;

public class RectTarget implements Target {

    private final Rect rect;

    public RectTarget(Rect rect) {
        this.rect = rect;
    }


    @Override
    public Point getPoint() {
        int[] location = new int[2];

        int x = (rect.left + rect.right) / 2;
        int y = (rect.top + rect.bottom) / 2;
        return new Point(x, y);
    }

    @Override
    public Rect getBounds() {

        return new Rect(
                rect.left,
                rect.top,
                rect.right,
                rect.bottom);

    }
}
