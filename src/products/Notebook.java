package products;

public class Notebook extends Product {
    private int pageCount;
    private boolean isHardCover;

    public Notebook(String title, Double price, int pageCount, boolean isHardCover) {
        super(title, price);
        setPageCount(pageCount);
        setHardCover(isHardCover);
    }

    @Override
    protected String generateId() {
        return "2";
    }

    @Override
    public String toString() {
        return super.toString() + "Page Count: " + pageCount + ", Is Hard Cover: " + isHardCover;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        if (pageCount < 1) {
            throw new IllegalArgumentException("Page count cannot be less than 1");
        }
        this.pageCount = pageCount;
    }

    public boolean isHardCover() {
        return isHardCover;
    }

    public void setHardCover(boolean hardCover) {
        isHardCover = hardCover;
    }

}
