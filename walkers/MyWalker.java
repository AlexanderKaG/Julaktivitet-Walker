import se.yrgo.walkfighters.Direction;
import se.yrgo.walkfighters.Walker;

import java.util.ArrayList;
import java.util.List;

public class MyWalker implements Walker {

    private enum StartingQuadrant {
        NORTH_WEST, NORTH_EAST, SOUTH_WEST, SOUTH_EAST
    }

    private class Coordinate {
        private int x;
        private int y;

        Coordinate(int x, int y) {
            if (x < 0 || x > 49) {
                throw new IllegalArgumentException("X can't be less than 0 or more than 49.");
            }
            if (y < 0 || y > 49) {
                throw new IllegalArgumentException("Y can't be less than 0 or more than 49.");
            }
            this.x = x;
            this.y = y;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + getEnclosingInstance().hashCode();
            result = prime * result + x;
            result = prime * result + y;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Coordinate other = (Coordinate) obj;
            if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
                return false;
            if (x != other.x)
                return false;
            if (y != other.y)
                return false;
            return true;
        }

        private MyWalker getEnclosingInstance() {
            return MyWalker.this;
        }
    }

    private StartingQuadrant startingQuadrant;

    private boolean roundHasStarted;

    private final List<Coordinate> northWestPath = new ArrayList<>();
    private final List<Coordinate> northEastPath = new ArrayList<>();

    private final List<Coordinate> southWestPath = new ArrayList<>();
    private final List<Coordinate> southEastPath = new ArrayList<>();

    @Override
    public String getName() {
        return "upn2772";
    }

    @Override
    public void setSize(int x, int y) {
        this.roundHasStarted = false;

        setNorthWestPath();
        setNorthEastPath();
        setSouthWestPath();
        setSouthEastPast();
    }

    private void setNorthWestPath() {
        northWestPath.clear();

        northWestPath.add(new Coordinate(24, 2));
        northWestPath.add(new Coordinate(24, 23));

        northWestPath.add(new Coordinate(22, 23));
        northWestPath.add(new Coordinate(22, 22));
        northWestPath.add(new Coordinate(21, 22));
        northWestPath.add(new Coordinate(21, 21));
        northWestPath.add(new Coordinate(20, 21));
        northWestPath.add(new Coordinate(20, 20));
        northWestPath.add(new Coordinate(19, 20));
        northWestPath.add(new Coordinate(19, 19));
        northWestPath.add(new Coordinate(18, 19));
        northWestPath.add(new Coordinate(18, 18));
        northWestPath.add(new Coordinate(17, 18));
        northWestPath.add(new Coordinate(17, 17));
        northWestPath.add(new Coordinate(16, 17));
        northWestPath.add(new Coordinate(16, 16));
        northWestPath.add(new Coordinate(15, 16));
        northWestPath.add(new Coordinate(15, 15));
        northWestPath.add(new Coordinate(14, 15));
        northWestPath.add(new Coordinate(14, 14));
        northWestPath.add(new Coordinate(13, 14));
        northWestPath.add(new Coordinate(13, 13));
        northWestPath.add(new Coordinate(12, 13));
        northWestPath.add(new Coordinate(12, 12));
        northWestPath.add(new Coordinate(11, 12));
        northWestPath.add(new Coordinate(11, 11));
        northWestPath.add(new Coordinate(10, 11));
        northWestPath.add(new Coordinate(10, 10));
        northWestPath.add(new Coordinate(9, 10));
        northWestPath.add(new Coordinate(9, 9));
        northWestPath.add(new Coordinate(8, 9));
        northWestPath.add(new Coordinate(8, 8));
        northWestPath.add(new Coordinate(7, 8));
        northWestPath.add(new Coordinate(7, 7));
        northWestPath.add(new Coordinate(6, 7));
        northWestPath.add(new Coordinate(6, 6));
        northWestPath.add(new Coordinate(5, 6));
        northWestPath.add(new Coordinate(5, 5));
        northWestPath.add(new Coordinate(4, 5));
        northWestPath.add(new Coordinate(4, 4));

        northWestPath.add(new Coordinate(22, 4));
        northWestPath.add(new Coordinate(22, 5));
        northWestPath.add(new Coordinate(7, 5));
        northWestPath.add(new Coordinate(7, 6));
        northWestPath.add(new Coordinate(22, 6));
        northWestPath.add(new Coordinate(22, 7));
        northWestPath.add(new Coordinate(9, 7));
        northWestPath.add(new Coordinate(9, 8));
        northWestPath.add(new Coordinate(22, 8));
        northWestPath.add(new Coordinate(22, 9));
        northWestPath.add(new Coordinate(11, 9));
        northWestPath.add(new Coordinate(11, 10));
        northWestPath.add(new Coordinate(22, 10));
        northWestPath.add(new Coordinate(22, 11));
        northWestPath.add(new Coordinate(13, 11));
        northWestPath.add(new Coordinate(13, 12));
        northWestPath.add(new Coordinate(22, 12));
        northWestPath.add(new Coordinate(22, 13));
        northWestPath.add(new Coordinate(15, 13));
        northWestPath.add(new Coordinate(15, 14));
        northWestPath.add(new Coordinate(22, 14));
        northWestPath.add(new Coordinate(22, 15));
        northWestPath.add(new Coordinate(17, 15));
        northWestPath.add(new Coordinate(17, 16));
        northWestPath.add(new Coordinate(22, 16));
        northWestPath.add(new Coordinate(22, 17));
        northWestPath.add(new Coordinate(19, 17));
        northWestPath.add(new Coordinate(19, 18));
        northWestPath.add(new Coordinate(22, 18));
        northWestPath.add(new Coordinate(22, 19));
        northWestPath.add(new Coordinate(21, 19));
        northWestPath.add(new Coordinate(21, 20));
        northWestPath.add(new Coordinate(22, 20));
        northWestPath.add(new Coordinate(22, 21));
        northWestPath.add(new Coordinate(23, 21));
        northWestPath.add(new Coordinate(23, 3));
        northWestPath.add(new Coordinate(1, 3));

        northWestPath.add(new Coordinate(1, 1));
        northWestPath.add(new Coordinate(24, 1));
        northWestPath.add(new Coordinate(24, 0));
        northWestPath.add(new Coordinate(0, 0));
        northWestPath.add(new Coordinate(0, 4));

        northWestPath.add(new Coordinate(3, 4));
        northWestPath.add(new Coordinate(3, 5));
        northWestPath.add(new Coordinate(0, 5));
        northWestPath.add(new Coordinate(0, 6));
        northWestPath.add(new Coordinate(4, 6));
        northWestPath.add(new Coordinate(4, 7));
        northWestPath.add(new Coordinate(0, 7));
        northWestPath.add(new Coordinate(0, 8));
        northWestPath.add(new Coordinate(6, 8));
        northWestPath.add(new Coordinate(6, 9));
        northWestPath.add(new Coordinate(0, 9));
        northWestPath.add(new Coordinate(0, 10));
        northWestPath.add(new Coordinate(8, 10));
        northWestPath.add(new Coordinate(8, 11));
        northWestPath.add(new Coordinate(0, 11));
        northWestPath.add(new Coordinate(0, 12));
        northWestPath.add(new Coordinate(10, 12));
        northWestPath.add(new Coordinate(10, 13));
        northWestPath.add(new Coordinate(0, 13));
        northWestPath.add(new Coordinate(0, 14));
        northWestPath.add(new Coordinate(12, 14));
        northWestPath.add(new Coordinate(12, 15));
        northWestPath.add(new Coordinate(0, 15));
        northWestPath.add(new Coordinate(0, 16));
        northWestPath.add(new Coordinate(14, 16));
        northWestPath.add(new Coordinate(14, 17));
        northWestPath.add(new Coordinate(0, 17));
        northWestPath.add(new Coordinate(0, 18));
        northWestPath.add(new Coordinate(16, 18));
        northWestPath.add(new Coordinate(16, 19));
        northWestPath.add(new Coordinate(0, 19));
        northWestPath.add(new Coordinate(0, 20));
        northWestPath.add(new Coordinate(18, 20));
        northWestPath.add(new Coordinate(18, 21));
        northWestPath.add(new Coordinate(0, 21));
        northWestPath.add(new Coordinate(0, 22));
        northWestPath.add(new Coordinate(20, 22));
        northWestPath.add(new Coordinate(20, 23));
        northWestPath.add(new Coordinate(0, 23));
        northWestPath.add(new Coordinate(0, 24));
        northWestPath.add(new Coordinate(25, 24));

        northWestPath.add(new Coordinate(25, 0));
        northWestPath.add(new Coordinate(26, 0));
        northWestPath.add(new Coordinate(26, 25));
        northWestPath.add(new Coordinate(0, 25));
        northWestPath.add(new Coordinate(0, 26));
        northWestPath.add(new Coordinate(27, 26));
        northWestPath.add(new Coordinate(27, 0));
        northWestPath.add(new Coordinate(28, 0));
        northWestPath.add(new Coordinate(28, 27));
        northWestPath.add(new Coordinate(0, 27));
        northWestPath.add(new Coordinate(0, 28));
        northWestPath.add(new Coordinate(29, 28));
        northWestPath.add(new Coordinate(29, 0));
        northWestPath.add(new Coordinate(30, 0));
        northWestPath.add(new Coordinate(30, 29));
        northWestPath.add(new Coordinate(0, 29));
    }

    private void setNorthEastPath() {
        northEastPath.clear();

        northEastPath.add(new Coordinate(25, 2));
        northEastPath.add(new Coordinate(25, 23));
        ;
        northEastPath.add(new Coordinate(27, 23));
        northEastPath.add(new Coordinate(27, 22));
        northEastPath.add(new Coordinate(28, 22));
        northEastPath.add(new Coordinate(28, 21));
        northEastPath.add(new Coordinate(29, 21));
        northEastPath.add(new Coordinate(29, 20));
        northEastPath.add(new Coordinate(30, 20));
        northEastPath.add(new Coordinate(30, 19));
        northEastPath.add(new Coordinate(31, 19));
        northEastPath.add(new Coordinate(31, 18));
        northEastPath.add(new Coordinate(32, 18));
        northEastPath.add(new Coordinate(32, 17));
        northEastPath.add(new Coordinate(33, 17));
        northEastPath.add(new Coordinate(33, 16));
        northEastPath.add(new Coordinate(34, 16));
        northEastPath.add(new Coordinate(34, 15));
        northEastPath.add(new Coordinate(35, 15));
        northEastPath.add(new Coordinate(35, 14));
        northEastPath.add(new Coordinate(36, 14));
        northEastPath.add(new Coordinate(36, 13));
        northEastPath.add(new Coordinate(37, 13));
        northEastPath.add(new Coordinate(37, 12));
        northEastPath.add(new Coordinate(38, 12));
        northEastPath.add(new Coordinate(38, 11));
        northEastPath.add(new Coordinate(39, 11));
        northEastPath.add(new Coordinate(39, 10));
        northEastPath.add(new Coordinate(40, 10));
        northEastPath.add(new Coordinate(40, 9));
        northEastPath.add(new Coordinate(41, 9));
        northEastPath.add(new Coordinate(41, 8));
        northEastPath.add(new Coordinate(42, 8));
        northEastPath.add(new Coordinate(42, 7));
        northEastPath.add(new Coordinate(43, 7));
        northEastPath.add(new Coordinate(43, 6));
        northEastPath.add(new Coordinate(44, 6));
        northEastPath.add(new Coordinate(44, 5));
        northEastPath.add(new Coordinate(45, 5));
        northEastPath.add(new Coordinate(45, 4));

        northEastPath.add(new Coordinate(27, 4));
        northEastPath.add(new Coordinate(27, 5));
        northEastPath.add(new Coordinate(42, 5));
        northEastPath.add(new Coordinate(42, 6));
        northEastPath.add(new Coordinate(27, 6));
        northEastPath.add(new Coordinate(27, 7));
        northEastPath.add(new Coordinate(40, 7));
        northEastPath.add(new Coordinate(40, 8));
        northEastPath.add(new Coordinate(27, 8));
        northEastPath.add(new Coordinate(27, 9));
        northEastPath.add(new Coordinate(38, 9));
        northEastPath.add(new Coordinate(38, 10));
        northEastPath.add(new Coordinate(27, 10));
        northEastPath.add(new Coordinate(27, 11));
        northEastPath.add(new Coordinate(36, 11));
        northEastPath.add(new Coordinate(36, 12));
        northEastPath.add(new Coordinate(27, 12));
        northEastPath.add(new Coordinate(27, 13));
        northEastPath.add(new Coordinate(34, 13));
        northEastPath.add(new Coordinate(34, 14));
        northEastPath.add(new Coordinate(27, 14));
        northEastPath.add(new Coordinate(27, 15));
        northEastPath.add(new Coordinate(32, 15));
        northEastPath.add(new Coordinate(32, 16));
        northEastPath.add(new Coordinate(27, 16));
        northEastPath.add(new Coordinate(27, 17));
        northEastPath.add(new Coordinate(30, 17));
        northEastPath.add(new Coordinate(30, 18));
        northEastPath.add(new Coordinate(27, 18));
        northEastPath.add(new Coordinate(27, 19));
        northEastPath.add(new Coordinate(28, 19));
        northEastPath.add(new Coordinate(28, 20));
        northEastPath.add(new Coordinate(27, 20));
        northEastPath.add(new Coordinate(27, 21));

        northEastPath.add(new Coordinate(26, 21));
        northEastPath.add(new Coordinate(26, 3));
        northEastPath.add(new Coordinate(48, 3));
        northEastPath.add(new Coordinate(48, 1));
        northEastPath.add(new Coordinate(25, 1));
        northEastPath.add(new Coordinate(25, 0));
        northEastPath.add(new Coordinate(49, 0));
        northEastPath.add(new Coordinate(49, 4));

        northEastPath.add(new Coordinate(46, 4));
        northEastPath.add(new Coordinate(46, 5));
        northEastPath.add(new Coordinate(49, 5));
        northEastPath.add(new Coordinate(49, 6));
        northEastPath.add(new Coordinate(45, 6));
        northEastPath.add(new Coordinate(45, 7));
        northEastPath.add(new Coordinate(49, 7));
        northEastPath.add(new Coordinate(49, 8));
        northEastPath.add(new Coordinate(43, 8));
        northEastPath.add(new Coordinate(43, 9));
        northEastPath.add(new Coordinate(49, 9));
        northEastPath.add(new Coordinate(49, 10));
        northEastPath.add(new Coordinate(41, 10));
        northEastPath.add(new Coordinate(41, 11));
        northEastPath.add(new Coordinate(49, 11));
        northEastPath.add(new Coordinate(49, 12));
        northEastPath.add(new Coordinate(39, 12));
        northEastPath.add(new Coordinate(39, 13));
        northEastPath.add(new Coordinate(49, 13));
        northEastPath.add(new Coordinate(49, 14));
        northEastPath.add(new Coordinate(37, 14));
        northEastPath.add(new Coordinate(37, 15));
        northEastPath.add(new Coordinate(49, 15));
        northEastPath.add(new Coordinate(49, 16));
        northEastPath.add(new Coordinate(35, 16));
        northEastPath.add(new Coordinate(35, 17));
        northEastPath.add(new Coordinate(49, 17));
        northEastPath.add(new Coordinate(49, 18));
        northEastPath.add(new Coordinate(33, 18));
        northEastPath.add(new Coordinate(33, 19));
        northEastPath.add(new Coordinate(49, 19));
        northEastPath.add(new Coordinate(49, 20));
        northEastPath.add(new Coordinate(31, 20));
        northEastPath.add(new Coordinate(31, 21));
        northEastPath.add(new Coordinate(49, 21));
        northEastPath.add(new Coordinate(49, 22));
        northEastPath.add(new Coordinate(29, 22));
        northEastPath.add(new Coordinate(29, 23));

        northEastPath.add(new Coordinate(49, 23));
        northEastPath.add(new Coordinate(49, 24));
        northEastPath.add(new Coordinate(24, 24));

        northEastPath.add(new Coordinate(24, 0));
        northEastPath.add(new Coordinate(23, 0));
        northEastPath.add(new Coordinate(23, 25));
        northEastPath.add(new Coordinate(49, 25));
        northEastPath.add(new Coordinate(49, 26));
        northEastPath.add(new Coordinate(22, 26));
        northEastPath.add(new Coordinate(22, 0));
        northEastPath.add(new Coordinate(21, 0));
        northEastPath.add(new Coordinate(21, 27));
        northEastPath.add(new Coordinate(49, 27));
        northEastPath.add(new Coordinate(49, 28));
        northEastPath.add(new Coordinate(20, 28));
        northEastPath.add(new Coordinate(20, 0));
        northEastPath.add(new Coordinate(19, 0));
        northEastPath.add(new Coordinate(19, 29));
        northEastPath.add(new Coordinate(49, 29));
    }

    private void setSouthWestPath() {
        southWestPath.clear();

        southWestPath.add(new Coordinate(24, 47));
        southWestPath.add(new Coordinate(24, 26));

        southWestPath.add(new Coordinate(22, 26));
        southWestPath.add(new Coordinate(22, 27));
        southWestPath.add(new Coordinate(21, 27));
        southWestPath.add(new Coordinate(21, 28));
        southWestPath.add(new Coordinate(20, 28));
        southWestPath.add(new Coordinate(20, 29));
        southWestPath.add(new Coordinate(19, 29));
        southWestPath.add(new Coordinate(19, 30));
        southWestPath.add(new Coordinate(18, 30));
        southWestPath.add(new Coordinate(18, 31));
        southWestPath.add(new Coordinate(17, 31));
        southWestPath.add(new Coordinate(17, 32));
        southWestPath.add(new Coordinate(16, 32));
        southWestPath.add(new Coordinate(16, 33));
        southWestPath.add(new Coordinate(15, 33));
        southWestPath.add(new Coordinate(15, 34));
        southWestPath.add(new Coordinate(14, 34));
        southWestPath.add(new Coordinate(14, 35));
        southWestPath.add(new Coordinate(13, 35));
        southWestPath.add(new Coordinate(13, 36));
        southWestPath.add(new Coordinate(12, 36));
        southWestPath.add(new Coordinate(12, 37));
        southWestPath.add(new Coordinate(11, 37));
        southWestPath.add(new Coordinate(11, 38));
        southWestPath.add(new Coordinate(10, 38));
        southWestPath.add(new Coordinate(10, 39));
        southWestPath.add(new Coordinate(9, 39));
        southWestPath.add(new Coordinate(9, 40));
        southWestPath.add(new Coordinate(8, 40));
        southWestPath.add(new Coordinate(8, 41));
        southWestPath.add(new Coordinate(7, 41));
        southWestPath.add(new Coordinate(7, 42));
        southWestPath.add(new Coordinate(6, 42));
        southWestPath.add(new Coordinate(6, 43));
        southWestPath.add(new Coordinate(5, 43));
        southWestPath.add(new Coordinate(5, 44));
        southWestPath.add(new Coordinate(4, 44));
        southWestPath.add(new Coordinate(4, 45));

        southWestPath.add(new Coordinate(22, 45));
        southWestPath.add(new Coordinate(22, 44));
        southWestPath.add(new Coordinate(7, 44));
        southWestPath.add(new Coordinate(7, 43));
        southWestPath.add(new Coordinate(22, 43));
        southWestPath.add(new Coordinate(22, 42));
        southWestPath.add(new Coordinate(9, 42));
        southWestPath.add(new Coordinate(9, 41));
        southWestPath.add(new Coordinate(22, 41));
        southWestPath.add(new Coordinate(22, 40));
        southWestPath.add(new Coordinate(11, 40));
        southWestPath.add(new Coordinate(11, 39));
        southWestPath.add(new Coordinate(22, 39));
        southWestPath.add(new Coordinate(22, 38));
        southWestPath.add(new Coordinate(13, 38));
        southWestPath.add(new Coordinate(13, 37));
        southWestPath.add(new Coordinate(22, 37));
        southWestPath.add(new Coordinate(22, 36));
        southWestPath.add(new Coordinate(15, 36));
        southWestPath.add(new Coordinate(15, 35));
        southWestPath.add(new Coordinate(22, 35));
        southWestPath.add(new Coordinate(22, 34));
        southWestPath.add(new Coordinate(17, 34));
        southWestPath.add(new Coordinate(17, 33));
        southWestPath.add(new Coordinate(22, 33));
        southWestPath.add(new Coordinate(22, 32));
        southWestPath.add(new Coordinate(19, 32));
        southWestPath.add(new Coordinate(19, 31));
        southWestPath.add(new Coordinate(22, 31));
        southWestPath.add(new Coordinate(22, 30));
        southWestPath.add(new Coordinate(21, 30));
        southWestPath.add(new Coordinate(21, 29));
        southWestPath.add(new Coordinate(22, 29));
        southWestPath.add(new Coordinate(22, 28));

        southWestPath.add(new Coordinate(23, 28));
        southWestPath.add(new Coordinate(23, 46));
        southWestPath.add(new Coordinate(1, 46));
        southWestPath.add(new Coordinate(1, 48));
        southWestPath.add(new Coordinate(24, 48));
        southWestPath.add(new Coordinate(24, 49));
        southWestPath.add(new Coordinate(0, 49));
        southWestPath.add(new Coordinate(0, 45));

        southWestPath.add(new Coordinate(3, 45));
        southWestPath.add(new Coordinate(3, 44));
        southWestPath.add(new Coordinate(0, 44));
        southWestPath.add(new Coordinate(0, 43));
        southWestPath.add(new Coordinate(4, 43));
        southWestPath.add(new Coordinate(4, 42));
        southWestPath.add(new Coordinate(0, 42));
        southWestPath.add(new Coordinate(0, 41));
        southWestPath.add(new Coordinate(6, 41));
        southWestPath.add(new Coordinate(6, 40));
        southWestPath.add(new Coordinate(0, 40));
        southWestPath.add(new Coordinate(0, 39));
        southWestPath.add(new Coordinate(8, 39));
        southWestPath.add(new Coordinate(8, 38));
        southWestPath.add(new Coordinate(0, 38));
        southWestPath.add(new Coordinate(0, 37));
        southWestPath.add(new Coordinate(10, 37));
        southWestPath.add(new Coordinate(10, 36));
        southWestPath.add(new Coordinate(0, 36));
        southWestPath.add(new Coordinate(0, 35));
        southWestPath.add(new Coordinate(12, 35));
        southWestPath.add(new Coordinate(12, 34));
        southWestPath.add(new Coordinate(0, 34));
        southWestPath.add(new Coordinate(0, 33));
        southWestPath.add(new Coordinate(14, 33));
        southWestPath.add(new Coordinate(14, 32));
        southWestPath.add(new Coordinate(0, 32));
        southWestPath.add(new Coordinate(0, 31));
        southWestPath.add(new Coordinate(16, 31));
        southWestPath.add(new Coordinate(16, 30));
        southWestPath.add(new Coordinate(0, 30));
        southWestPath.add(new Coordinate(0, 29));
        southWestPath.add(new Coordinate(18, 29));
        southWestPath.add(new Coordinate(18, 28));
        southWestPath.add(new Coordinate(0, 28));
        southWestPath.add(new Coordinate(0, 27));
        southWestPath.add(new Coordinate(20, 27));
        southWestPath.add(new Coordinate(20, 26));
        southWestPath.add(new Coordinate(0, 26));
        southWestPath.add(new Coordinate(0, 25));
        southWestPath.add(new Coordinate(25, 25));

        southWestPath.add(new Coordinate(25, 49));
        southWestPath.add(new Coordinate(26, 49));
        southWestPath.add(new Coordinate(26, 24));
        southWestPath.add(new Coordinate(0, 24));
        southWestPath.add(new Coordinate(0, 23));
        southWestPath.add(new Coordinate(27, 23));
        southWestPath.add(new Coordinate(27, 49));
        southWestPath.add(new Coordinate(28, 49));
        southWestPath.add(new Coordinate(28, 22));
        southWestPath.add(new Coordinate(0, 22));
        southWestPath.add(new Coordinate(0, 21));
        southWestPath.add(new Coordinate(29, 21));
        southWestPath.add(new Coordinate(29, 49));
        southWestPath.add(new Coordinate(30, 49));
        southWestPath.add(new Coordinate(30, 20));
        southWestPath.add(new Coordinate(0, 20));
    }

    private void setSouthEastPast() {
        southEastPath.clear();

        southEastPath.add(new Coordinate(25, 47));

        southEastPath.add(new Coordinate(25, 26));
        southEastPath.add(new Coordinate(27, 26));
        southEastPath.add(new Coordinate(27, 27));
        southEastPath.add(new Coordinate(28, 27));
        southEastPath.add(new Coordinate(28, 28));
        southEastPath.add(new Coordinate(29, 28));
        southEastPath.add(new Coordinate(29, 29));
        southEastPath.add(new Coordinate(30, 29));
        southEastPath.add(new Coordinate(30, 30));
        southEastPath.add(new Coordinate(31, 30));
        southEastPath.add(new Coordinate(31, 31));
        southEastPath.add(new Coordinate(32, 31));
        southEastPath.add(new Coordinate(32, 32));
        southEastPath.add(new Coordinate(33, 32));
        southEastPath.add(new Coordinate(33, 33));
        southEastPath.add(new Coordinate(34, 33));
        southEastPath.add(new Coordinate(34, 34));
        southEastPath.add(new Coordinate(35, 34));
        southEastPath.add(new Coordinate(35, 35));
        southEastPath.add(new Coordinate(36, 35));
        southEastPath.add(new Coordinate(36, 36));
        southEastPath.add(new Coordinate(37, 36));
        southEastPath.add(new Coordinate(37, 37));
        southEastPath.add(new Coordinate(38, 37));
        southEastPath.add(new Coordinate(38, 38));
        southEastPath.add(new Coordinate(39, 38));
        southEastPath.add(new Coordinate(39, 39));
        southEastPath.add(new Coordinate(40, 39));
        southEastPath.add(new Coordinate(40, 40));
        southEastPath.add(new Coordinate(41, 40));
        southEastPath.add(new Coordinate(41, 41));
        southEastPath.add(new Coordinate(42, 41));
        southEastPath.add(new Coordinate(42, 42));
        southEastPath.add(new Coordinate(43, 42));
        southEastPath.add(new Coordinate(43, 43));
        southEastPath.add(new Coordinate(44, 43));
        southEastPath.add(new Coordinate(44, 44));
        southEastPath.add(new Coordinate(45, 44));
        southEastPath.add(new Coordinate(45, 45));

        southEastPath.add(new Coordinate(27, 45));
        southEastPath.add(new Coordinate(27, 44));
        southEastPath.add(new Coordinate(42, 44));
        southEastPath.add(new Coordinate(42, 43));
        southEastPath.add(new Coordinate(27, 43));
        southEastPath.add(new Coordinate(27, 42));
        southEastPath.add(new Coordinate(40, 42));
        southEastPath.add(new Coordinate(40, 41));
        southEastPath.add(new Coordinate(27, 41));
        southEastPath.add(new Coordinate(27, 40));
        southEastPath.add(new Coordinate(38, 40));
        southEastPath.add(new Coordinate(38, 39));
        southEastPath.add(new Coordinate(27, 39));
        southEastPath.add(new Coordinate(27, 38));
        southEastPath.add(new Coordinate(36, 38));
        southEastPath.add(new Coordinate(36, 37));
        southEastPath.add(new Coordinate(27, 37));
        southEastPath.add(new Coordinate(27, 36));
        southEastPath.add(new Coordinate(34, 36));
        southEastPath.add(new Coordinate(34, 35));
        southEastPath.add(new Coordinate(27, 35));
        southEastPath.add(new Coordinate(27, 34));
        southEastPath.add(new Coordinate(32, 34));
        southEastPath.add(new Coordinate(32, 33));
        southEastPath.add(new Coordinate(27, 33));
        southEastPath.add(new Coordinate(27, 32));
        southEastPath.add(new Coordinate(30, 32));
        southEastPath.add(new Coordinate(30, 31));
        southEastPath.add(new Coordinate(27, 31));
        southEastPath.add(new Coordinate(27, 30));
        southEastPath.add(new Coordinate(28, 30));
        southEastPath.add(new Coordinate(28, 29));
        southEastPath.add(new Coordinate(27, 29));
        southEastPath.add(new Coordinate(27, 28));
        southEastPath.add(new Coordinate(26, 28));
        southEastPath.add(new Coordinate(26, 46));
        southEastPath.add(new Coordinate(48, 46));

        southEastPath.add(new Coordinate(48, 48));
        southEastPath.add(new Coordinate(25, 48));
        southEastPath.add(new Coordinate(25, 49));
        southEastPath.add(new Coordinate(49, 49));
        southEastPath.add(new Coordinate(49, 45));

        southEastPath.add(new Coordinate(46, 45));
        southEastPath.add(new Coordinate(46, 44));
        southEastPath.add(new Coordinate(49, 44));
        southEastPath.add(new Coordinate(49, 43));
        southEastPath.add(new Coordinate(45, 43));
        southEastPath.add(new Coordinate(45, 42));
        southEastPath.add(new Coordinate(49, 42));
        southEastPath.add(new Coordinate(49, 41));
        southEastPath.add(new Coordinate(43, 41));
        southEastPath.add(new Coordinate(43, 40));
        southEastPath.add(new Coordinate(49, 40));
        southEastPath.add(new Coordinate(49, 39));
        southEastPath.add(new Coordinate(41, 39));
        southEastPath.add(new Coordinate(41, 38));
        southEastPath.add(new Coordinate(49, 38));
        southEastPath.add(new Coordinate(49, 37));
        southEastPath.add(new Coordinate(39, 37));
        southEastPath.add(new Coordinate(39, 36));
        southEastPath.add(new Coordinate(49, 36));
        southEastPath.add(new Coordinate(49, 35));
        southEastPath.add(new Coordinate(37, 35));
        southEastPath.add(new Coordinate(37, 34));
        southEastPath.add(new Coordinate(49, 34));
        southEastPath.add(new Coordinate(49, 33));
        southEastPath.add(new Coordinate(35, 33));
        southEastPath.add(new Coordinate(35, 32));
        southEastPath.add(new Coordinate(49, 32));
        southEastPath.add(new Coordinate(49, 31));
        southEastPath.add(new Coordinate(33, 31));
        southEastPath.add(new Coordinate(33, 30));
        southEastPath.add(new Coordinate(49, 30));
        southEastPath.add(new Coordinate(49, 29));
        southEastPath.add(new Coordinate(31, 29));
        southEastPath.add(new Coordinate(31, 28));
        southEastPath.add(new Coordinate(49, 28));
        southEastPath.add(new Coordinate(49, 27));
        southEastPath.add(new Coordinate(29, 27));
        southEastPath.add(new Coordinate(29, 26));
        southEastPath.add(new Coordinate(49, 26));
        southEastPath.add(new Coordinate(49, 25));

        southEastPath.add(new Coordinate(24, 25));
        southEastPath.add(new Coordinate(24, 49));
        southEastPath.add(new Coordinate(23, 49));
        southEastPath.add(new Coordinate(23, 24));
        southEastPath.add(new Coordinate(49, 24));
        southEastPath.add(new Coordinate(49, 23));
        southEastPath.add(new Coordinate(22, 23));
        southEastPath.add(new Coordinate(22, 49));
        southEastPath.add(new Coordinate(21, 49));
        southEastPath.add(new Coordinate(21, 22));
        southEastPath.add(new Coordinate(49, 22));
        southEastPath.add(new Coordinate(49, 21));
        southEastPath.add(new Coordinate(20, 21));
        southEastPath.add(new Coordinate(20, 49));
        southEastPath.add(new Coordinate(19, 49));
        southEastPath.add(new Coordinate(19, 20));
        southEastPath.add(new Coordinate(49, 20));
    }

    @Override
    public Direction nextStep(int x, int y) {

        try {
            Coordinate currentCoordinate = new Coordinate(x, y);

            if (!roundHasStarted) {
                startingQuadrant = checkStartingQuadrant(currentCoordinate);
                roundHasStarted = true;
            }

            switch (startingQuadrant) {
                case NORTH_WEST:

                    return nextDirection(northWestPath, currentCoordinate);

                case NORTH_EAST:

                    return nextDirection(northEastPath, currentCoordinate);

                case SOUTH_WEST:

                    return nextDirection(southWestPath, currentCoordinate);

                case SOUTH_EAST:

                    return nextDirection(southEastPath, currentCoordinate);

                default:
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        throw new IllegalStateException();
    }

    private Direction nextDirection(List<Coordinate> path, Coordinate currentCoordinate) {
        if (path.isEmpty()) {
            return Direction.UP;
        }

        if (currentCoordinate.equals(path.get(0))) {
            path.remove(0);
        }

        if (path.isEmpty()) {
            return Direction.UP;
        }

        Coordinate nextTarget = path.get(0);
        Direction direction = calculateDirection(currentCoordinate, nextTarget);

        return direction;
    }

    private Direction calculateDirection(MyWalker.Coordinate currentCoordinate, MyWalker.Coordinate nextTarget) {
        if (currentCoordinate.x == nextTarget.x
                && currentCoordinate.y < nextTarget.y) {
            return Direction.DOWN;
        }
        if (currentCoordinate.x == nextTarget.x
                && currentCoordinate.y > nextTarget.y) {
            return Direction.UP;
        }
        if (currentCoordinate.x < nextTarget.x
                && currentCoordinate.y == nextTarget.y) {
            return Direction.RIGHT;
        }
        if (currentCoordinate.x > nextTarget.x
                && currentCoordinate.y == nextTarget.y) {
            return Direction.LEFT;
        }

        throw new IllegalStateException();
    }

    private StartingQuadrant checkStartingQuadrant(Coordinate currentCoordinate) {

        if (currentCoordinate.x == 2 && currentCoordinate.y == 2) {
            return StartingQuadrant.NORTH_WEST;
        }

        if (currentCoordinate.x == 47 && currentCoordinate.y == 2) {
            return StartingQuadrant.NORTH_EAST;
        }

        if (currentCoordinate.x == 2 && currentCoordinate.y == 47) {
            return StartingQuadrant.SOUTH_WEST;
        }

        if (currentCoordinate.x == 47 && currentCoordinate.y == 47) {
            return StartingQuadrant.SOUTH_EAST;
        }

        throw new IllegalStateException();
    }
}