package colllection.iterable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> {

    private int cuurentIndex = -1;
    private int[] targetArr;

    public MyArrayIterator(final int[] targetArr) {
        this.targetArr = targetArr;
    }

    @Override
    public boolean hasNext() {
        return cuurentIndex < targetArr.length-1;
    }

    @Override
    public Integer next() {
        return targetArr[++cuurentIndex];
    }
}
