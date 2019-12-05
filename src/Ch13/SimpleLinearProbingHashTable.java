package Ch13;

public class SimpleLinearProbingHashTable {
    private int HashTableSize;
    Object hashTable[];
    public SimpleLinearProbingHashTable(int size) {
        HashTableSize=size;
        hashTable=new Object[HashTableSize];
    }
    public boolean put(Object key) {
        int index=hash(key);
        while(hashTable[index]!=null){
            if(hashTable[index].equals(key)) return false;
            index=(index+1)%HashTableSize;
        }
        hashTable[index]=key;
        return true;
    }
    private int hash(Object key) {
        return (key.hashCode()&0x7FFFFFFF)%HashTableSize;
    }
    public Object get(Object key) {
        int index=hash(key);
        while(hashTable[index]!=null){
            if(hashTable[index].equals(key)) return hashTable[index];
            index=(index+1)%HashTableSize;
        }
        return null;
    }
}
