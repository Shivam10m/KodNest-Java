
class BookApp2 {

    public static void main(String[] args) {
        Book b = new Book();
        b.setData(100);
        b.getData();
    }
}

class Book {

    private int pageNum;

    public void setData(int x) {
        if (x > 0) {
            pageNum = x;
        }
    }

    public void getData() {
        System.out.println(pageNum);
    }
}
