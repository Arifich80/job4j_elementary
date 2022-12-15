package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when23to45then2dot82() {
        double expected = 2.82;
        Point a = new Point(2, 3);
        Point b = new Point(4, 5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when00to20then2() {
        double expected = 2.0;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when46tomin1min8then14dot86() {
        double expected = 14.86;
        Point a = new Point(4, 6);
        Point b = new Point(-1, -8);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when000to034then5() {
        double expected = 5.0;
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 3, 4);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when579to1248then7dot68() {
        double expected = 7.68;
        Point a = new Point(5, 7, 9);
        Point b = new Point(12, 4, 8);
        double dist = a.distance3d(b);
    }
}