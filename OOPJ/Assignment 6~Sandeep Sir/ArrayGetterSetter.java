package a6.q1;

class ArrayGetterSetter {
    private int[] arr;

   
    public ArrayGetterSetter(int size) {
        arr = new int[size];
    }

   
    public void setArray(int index, int value) {
        if (index >= 0 && index < arr.length) {
            arr[index] = value;
        }
    }

   
    public int getArrayValue(int index) {
        if (index >= 0 && index < arr.length) {
            return arr[index];
        }
        return -1; 
    }

    
    public void printArray() {
        System.out.print("Array Elements: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        ArrayGetterSetter demo = new ArrayGetterSetter(5);
        
        
        demo.setArray(0, 10);
        demo.setArray(1, 20);
        demo.setArray(2, 30);
        demo.setArray(3, 40);
        demo.setArray(4, 50);

        demo.printArray();
        
        System.out.println("Element at index 2: " + demo.getArrayValue(2));
    }
}

