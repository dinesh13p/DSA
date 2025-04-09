public class doubleHashing {
    int size;
    int[] keys;
    int[] values;
    static final int EMPTY = -1;


    doubleHashing(int capacity) {
        this.size = capacity;
        this.keys = new int[capacity];
        this.values = new int[capacity];

        for (int i = 0; i < capacity; i++) {
            keys[i] = EMPTY;
        }
    }

 
    int hash1(int key) {
        return key % size;
    }

    int hash2(int key) {
        return 1 + (key % (size - 1)); 
    }

    
    void insert(int key, int value) {
        int index = hash1(key);
        int i = 0;

       
        while (keys[(index + i * hash2(key)) % size] != EMPTY && keys[(index + i * hash2(key)) % size] != key) {
            i++; 
            if (i == size) {
                System.out.println("Hash table is full. Cannot insert key " + key);
                return;
            }
        }

        keys[(index + i * hash2(key)) % size] = key;
        values[(index + i * hash2(key)) % size] = value;
        System.out.println("Inserted key: " + key + ", value: " + value);
    }

  
    int search(int key) {
        int index = hash1(key);
        int i = 0;

        while (keys[(index + i * hash2(key)) % size] != EMPTY) {
            if (keys[(index + i * hash2(key)) % size] == key) {
                return values[(index + i * hash2(key)) % size];
            }
            i++; 
            if (i == size) {
                break;
            }
        }

        return -1;
    }

   
    void delete(int key) {
        int index = hash1(key);
        int i = 0;

        while (keys[(index + i * hash2(key)) % size] != EMPTY) {
            if (keys[(index + i * hash2(key)) % size] == key) {
                keys[(index + i * hash2(key)) % size] = EMPTY;
                values[(index + i * hash2(key)) % size] = 0;
                System.out.println("Deleted key: " + key);
                return;
            }
            i++;
            if (i == size) {
                break;
            }
        }

        System.out.println("Key " + key + " not found. Deletion failed.");
    }

  
    void display() {
        System.out.println("\nHash Table Contents:");
        for (int i = 0; i < size; i++) {
            if (keys[i] != EMPTY) {
                System.out.println("Key: " + keys[i] + " | Value: " + values[i]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        doubleHashing dh = new doubleHashing(7);

        System.out.println("Inserting elements...");
        dh.insert(3, 43);
        dh.insert(10, 88);
        dh.insert(13, 99);
        dh.insert(20, 78);
        dh.insert(5, 56);

        System.out.println("\nSearching for key 3...");
        int result = dh.search(3);
        if (result != -1) {
            System.out.println("Key 3 found with value: " + result);
        } else {
            System.out.println("Key 3 not found.");
        }

        System.out.println("\nDeleting key 1...");
        dh.delete(1);

        System.out.println("Deleting key 10...");
        dh.delete(10);

        dh.display();
    }
}