package comportamental.iterator;

public class _Main {

	public static void main(String[] args) {
        BrowseHistory history = new BrowseHistory();

        history.push("a");
        history.push("b");
        history.push("c");

        CustomIterator iterator = history.createIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
	}

}
