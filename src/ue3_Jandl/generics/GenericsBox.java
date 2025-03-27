package ue3_Jandl.generics;

public class GenericsBox<T> {
    private T[] contents;

    public GenericsBox() {
        contents = (T[]) new Object[10];
    }

    public void putItem(T item) {
        for (int i = 0; i < contents.length; i++) {
            if (this.contents[i] == null) {
                this.contents[i] = item;
                break;
            } else {
                System.out.println("Box ist voll, bitte machen Sie eine neue");
            }
        }
    }
        public void printContents () {
            for (T item : contents) {
                System.out.println(item);
            }
        }

}
