package up.edu.dimcalc;

import android.graphics.Point;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoPointsTest {

    /** when created, getPoint() should show both points at the origin */
    @Test
    public void getPoint() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        assertEquals(p1.x, 0);
        assertEquals(p1.y, 0);
        assertEquals(p2.x, 0);
        assertEquals(p2.y, 0);
    }
    /** verify that arbitrary values are properly stored via setPoint() */
    @Test
    public void setPoint() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        testPoints.setPoint(0, 5, -3);
        testPoints.setPoint(1, -3, 5);
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        assertEquals(p1.x, 5);
        assertEquals(p1.y, -3);
        assertEquals(p2.x, -3);
        assertEquals(p2.y, 5);
    }

    @Test
    public void randomValue() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        testPoints.setPoint(0, 10, 10);
        testPoints.setPoint(1, 20, 20);
        testPoints.randomValue(0);
        Point p2 = testPoints.getPoint(1);
        assertEquals(p2.x, 20);
        assertEquals(p2.y, 20);
    }

    @Test
    public void setOrigin() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        testPoints.setPoint(0, 10, 10);
        testPoints.setPoint(1, 20, 20);
        testPoints.setOrigin(0);
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        assertEquals(p1.x, 0);
        assertEquals(p1.y, 0);
        assertEquals(p2.x, 20);
        assertEquals(p2.y, 20);
    }

    @Test
    public void copy() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        testPoints.setPoint(0, 10, 10);
        testPoints.setPoint(1, 20, 20);
        testPoints.copy(1, 0);
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        //testPoints.setPoint(1, 15, 15);
        assertEquals(p1.x, 20);
        assertEquals(p1.y, 20);
        assertEquals(p2.x, 20);
        assertEquals(p2.y, 20);
    }

    @Test
    public void distance() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        testPoints.setPoint(0, 1, 1);
        testPoints.setPoint(1, 2, 2);
        assertEquals(testPoints.distance(), 1.0, 1.0);
    }

    @Test
    public void slope() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        testPoints.setPoint(0, 1, 1);
        testPoints.setPoint(1, 2, 2);
        assertEquals(testPoints.slope(), 1.0, 1.0);
    }
}