package com.company;

public class ComparableSquare extends Square implements Comparable<ComparableSquare>{

    public ComparableSquare() {
    }

    public ComparableSquare(double ax, double ay, double bx, double by, double cx, double cy, double dx, double dy) {
        super(ax, ay, bx, by, cx, cy, dx, dy);
    }

    public ComparableSquare(Square square) {
        super(square);
    }

    @Override
    public int compareTo(ComparableSquare o) {
        return Double.compare(surface(), o.surface());
    }
}
