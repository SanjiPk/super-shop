package products;

public class NoteBook extends Product{
    private int pageCount;
    private boolean isHardCover;

    public NoteBook(String title, Double price, int pageCount, boolean isHardCover) {
        super(title, price);
        this.pageCount = pageCount;
        this.isHardCover = isHardCover;
        setId(generateId());
    }

    @Override
    protected String generateId() {
        numbers++;
        return Integer.toString(2000 + numbers);
    }

    @Override
    public String toString() {
        return String.format("%s , page count: %d, is it HardCover or no: %b",
                super.toString(), pageCount, isHardCover);
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
