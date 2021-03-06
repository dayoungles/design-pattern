package pattern.JU.Iterator;

/**
 * Created by cha45 on 2017-04-09.
 */
public class BookShelfIterator implements Iterator{
    private BookShelfInterface bookShelf;
    private int index;

    public BookShelfIterator(BookShelfInterface bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return bookShelf.getLength() >= index + 1;
    }

    @Override
    public Object next() {
        return bookShelf.getBookAt(index++);
    }
}
