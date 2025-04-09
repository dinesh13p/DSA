public class linearProbing {
    int size;
    int[] keys;
    int[] values;
    static final int EMPTY = -1;

    linearProbing(int capacity) {
        this.size = capacity;
        this.keys = new int[capacity];
        this.values = new int[capacity];


        for (int i = 0; i < capacity; i++) {
            keys[i] = EMPTY;
        }
    }

 
    int hash(int key) {
        return key % size;
    }

    void insert(int key, int value) {
        int index = hash(key);
        int startIndex = index;

        while (keys[index] != EMPTY && keys[index] != key) {
            index = (index + 1) % size;
            if (index == startIndex) {
                System.out.println("Hash table is full. Cannot insert key " + key);
                return;
            }
        }

        keys[index] = key;
        values[index] = value;
        System.out.println("Inserted key: " + key + ", value: " + value);
    }

    int search(int key) {
        int index = hash(key);
        int startIndex = index;

        while (keys[index] != EMPTY) {
            if (keys[index] == key) {
                return values[index];
            }

            index = (index + 1) % size;
            if (index == startIndex) {
                break;
            }
        }
        return -1; 
    }


    void delete(int key) {
        int index = hash(key);
        int startIndex = index;

        while (keys[index] != EMPTY) {
            if (keys[index] == key) {
                keys[index] = EMPTY;
                values[index] = 0;
                System.out.println("Deleted key: " + key);
                return;
            }

            index = (index + 1) % size;
            if (index == startIndex) {
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
        linearProbing lp = new linearProbing(5);

        System.out.println("Inserting elements...");
        lp.insert(3, 43);
        lp.insert(8, 88);
        lp.insert(13, 99);

        System.out.println("\nSearching for key 3...");
        int result = lp.search(3);
        if (result != -1) {
            System.out.println("Key 3 found with value: " + result);
        } else {
            System.out.println("Key 3 not found.");
        }

        System.out.println("\nDeleting key 1...");
        lp.delete(1);

        System.out.println("Deleting key 3...");
        lp.delete(3);

        lp.display();
    }
}