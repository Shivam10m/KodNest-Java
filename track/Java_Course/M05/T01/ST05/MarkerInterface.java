
class MarkerInterface {

    public static void main(String[] args) {
        Empty empty = new Empty();
        empty.disp();
    }
}

interface EmptyInterface {

}

class Empty implements EmptyInterface {

    public void disp() {
        System.out.println("Marker Interface example");
    }
}
