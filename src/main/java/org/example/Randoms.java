package org.example;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private final int min;
    private int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max + 1;
        this.random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {

        return new Iterator<>() {
            final int reducedMax = max -= min;

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                int randomValue = random.nextInt(reducedMax);
                return randomValue + min;
            }
        };
    }


}
