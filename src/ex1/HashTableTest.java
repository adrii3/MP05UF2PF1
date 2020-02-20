package ex1;


class HashTableTest {

    @org.junit.jupiter.api.Test
    void size() {
    }

    @org.junit.jupiter.api.Test
    void realSize() {
    }

    @org.junit.jupiter.api.Test
    void put() {
        HashTable hashTable = new HashTable();
        hashTable.put("1","Adri");
        hashTable.put("2","EDgar");
        hashTable.put("3","FlanDomiArmer");
        hashTable.put("4","mariano");
        System.out.println(hashTable);
        System.out.println(hashTable.size());
    }

    @org.junit.jupiter.api.Test
    void get() {
    }

    @org.junit.jupiter.api.Test
    void drop() {
    }
}