public class Book {
    private static int numBook;
    private int numPage;
    public Book(int numPage) {
        this.numPage=numPage;
        numBook++; //can it be this.numBook++?
    }
    public int getNumPage() {
        return numPage; //can it be this.numPage?
    }
    public void addPage(int numPage) {
        this.numPage+=numPage; //can it be just numPage+=numPage?
    }
    public void removePage(int numPage) {
        this.numPage-=numPage; //can it be just numPage-=numPage?
    }
    public static int getNumBook() {
        return numBook; //can it be this.numBook?
    }
}
