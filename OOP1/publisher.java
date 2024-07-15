public class publisher {
    public static void main(String[] args) {
        System.out.println("Book available:"+Book.getNumBook());
        Book javaBegin = new Book(1000);
        Book artDev = new Book(500);
        System.out.println("Book available:"+Book.getNumBook());

        javaBegin.addPage(1000);
        System.out.println(javaBegin.getNumPage());

        artDev.removePage(100);
        System.out.println(artDev.getNumPage());
    }
}
