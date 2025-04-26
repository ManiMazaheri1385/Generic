package products;

public class Notebook extends Product {
    private int pageCount;
    private boolean isHardCover;

    @Override
    protected String generateId() {
        return "";
    }

    @Override
    public String toString() {
        return "";
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public boolean isHardCover() {
        return isHardCover;
    }

    public void setHardCover(boolean hardCover) {
        isHardCover = hardCover;
    }

}
