package ex1;


import org.junit.jupiter.api.Assertions;

class HashTableTest {

    @org.junit.jupiter.api.Test
    void size() {
        HashTable hashTable = new HashTable();

        Assertions.assertEquals(0,hashTable.size());

        hashTable.put("1","Adri");
        Assertions.assertEquals(1,hashTable.size());

        hashTable.put("1","DomiArmer");
        Assertions.assertEquals(1,hashTable.size());

        hashTable.put("2","Paco");
        Assertions.assertEquals(2,hashTable.size());

        hashTable.put("16","Mariano");
        Assertions.assertEquals(3,hashTable.size());

        hashTable.drop("2");
        Assertions.assertEquals(2,hashTable.size());

    }

    @org.junit.jupiter.api.Test
    void realSize() {
        HashTable hashTable = new HashTable();

        Assertions.assertEquals(16,hashTable.realSize());

        hashTable.put("1","Adri");
        Assertions.assertEquals(16,hashTable.realSize());

        hashTable.put("1","DomiArmer");
        Assertions.assertEquals(16,hashTable.realSize());

        hashTable.put("2","Edgar");
        Assertions.assertEquals(16,hashTable.realSize());

        hashTable.drop("2");
        Assertions.assertEquals(16,hashTable.realSize());
    }

    @org.junit.jupiter.api.Test
    void put() {
        HashTable hashTable = new HashTable();

        hashTable.put("1","Adri");
        Assertions.assertEquals("Adri",hashTable.get("1"));

        hashTable.put("2","Paquito");
        Assertions.assertEquals("Paquito",hashTable.get("2"));

        hashTable.put("2","Stiben");
        Assertions.assertEquals("Paquito",hashTable.get("2"));

        hashTable.put("-1","Mariano");
        System.out.println(hashTable);
        Assertions.assertEquals(null,hashTable.get("-1"));

        hashTable.put("20","Paco");



    }

    @org.junit.jupiter.api.Test
    void get() {

        HashTable hashTable = new HashTable();

        hashTable.put("1","Adri");
        Assertions.assertEquals("Adri",hashTable.get("1"));

        hashTable.put("2","Paquito");
        Assertions.assertEquals("Paquito",hashTable.get("2"));

        hashTable.put("2","Stiben");
        Assertions.assertEquals("Paquito",hashTable.get("2"));

        hashTable.put("2","Mariano");
        System.out.println(hashTable);
        Assertions.assertEquals("Paquito",hashTable.get("2"));

        hashTable.put("2","Mariano");
        System.out.println(hashTable);
        Assertions.assertEquals("Paquito",hashTable.get("2"));


        Assertions.assertEquals(null,hashTable.get("-1"));

    }

    @org.junit.jupiter.api.Test
    void drop() {
    }
}