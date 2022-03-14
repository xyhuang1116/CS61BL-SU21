import java.util.*;

public class Filter implements Iterable<Integer> {

    Iterable<Integer> it;
    FilterCondition<Integer> cond;

    public Filter(Iterable<Integer> it, FilterCondition<Integer> cond) {
        this.it = it;
        this.cond = cond;
    }

    public Iterator<Integer> iterator() {
        return new FilterIterator();
    }

    private class FilterIterator implements Iterator<Integer> {

        Iterable<Integer> IntIterator;
        Integer toReturn;

        public FilterIterator(){
            IntIterator = it.iterator();
            this.next();
        }

        @Override
        public boolean hadNext(){
            return toReturn != null;
        }

        @Override
        publi Integer next(){
            Integer m = toReturn;
            toReturn = null;
            while(IntIterator.hasNext()){
                int n = IntIterator.next();
                if(cond.eval(x)){
                    toReturn = x;
                    break;
                }
            }
            return m;
        }
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(new Integer[]{0, 11, 20, 13, 14, 50, 66});
        for (int i : new Filter(arr, new EvenCondition())) {
            System.out.print(i);
        }
    }
}