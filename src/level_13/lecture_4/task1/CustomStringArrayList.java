package level_13.lecture_4.task1;

public class CustomStringArrayList {
    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        String[] elementsClone = elements;
        capacity = (int)(capacity * 1.5);
        elements = new String[capacity];
        for (int i = 0; i < elementsClone.length; i++) {
            elements[i] = elementsClone[i];
        }
    }
}
