public class BookData {

    private int bookNo;

    private String title;

    private String author;

    private double price;

    public BookData(int bookNo, String title, String author, double price) {

        super();

        this.bookNo = bookNo;

        this.title = title;

        this.author = author;

        this.price = price;

    }

    public int getBookNo() {

        return bookNo;

    }

    public void setBookNo(int bookNo) {

        this.bookNo = bookNo;

    }

    public String getTitle() {

        return title;

    }

    public void setTitle(String title) {

        this.title = title;

    }

    public String getAuthor() {

        return author;

    }

    public void setAuthor(String author) {

        this.author = author;

    }

    public double getPrice() {

        return price;

    }

    public void setPrice(double price) {

        this.price = price;

    }

    @Override

    public String toString() {

        return "Book NO:" + bookNo + " Title:" +

                title + " Author:" + author +

                " Price:" + price;

    }

    @Override

    public boolean equals(Object obj) {

        // TODO Auto-generated method stub

        BookData bobj = (BookData) obj;

        if (this.bookNo == bobj.bookNo)

            return true;

        else

            return false;

    }

    @Override

    public int hashCode() {

        // TODO Auto-generated method stub

        return this.bookNo;

    }

}
