package Products;

public class NoteBook extends Product {
    private int pageCount;
    private boolean isHardCover;

    public NoteBook(String title, Double price, int pageCount, boolean isHardCover) {
        super(title, price);
        this.pageCount = pageCount;
        this.isHardCover = isHardCover;
    }
    public int getPageCount() { return pageCount; }
    public void setPageCount(int pageCount) { this.pageCount = pageCount; }

    public boolean isHardCover() { return isHardCover; }
    public void setHardCover(boolean hardCover) { isHardCover = hardCover; }

    public String toString() {
        return super.toString() + ", Page Count: " + pageCount + ", Hard Cover: " + isHardCover;
    }

    @Override
    protected String generateId() {
        return "2" + String.format("%d", Product.productCount);
    }
}
