package com.hashmap;

/**
 * @author Sujani
 *
 */
public class HashMap {

	private static final int Table_Size = 128;
	
	HashEntry[]  table;
	
	 int size;
	
	
	/**
	 * constructor to initializes the hash map with size 128
	 */
	public HashMap(){
		
		table = new HashEntry[Table_Size];
		
		//create a table with null values
		for(int i=0;i<Table_Size;i++){
			
			table[i] =null;
		}
	}
	
	/**
	 * @return current size of hash map
	 */
	public int sizeofHashMap(){
		return size;
	}
	
	/**
	 * @return true if has map is empty 
	 * 
	 */
	public boolean isHashMapEmpty(){
		
		if(sizeofHashMap() == 0){
			return true;
		}
		return false;
	}
	
	public void makeHashMapEmtpy(){
		
		for(int i=0;i<Table_Size;i++){
			table[i] = null;
			size =0;
		}
	}
	
	/**
	 * @param key
	 * @param value
	 */
	public void put(int key,int value){
		
		//get the hash value of the key
		int hash = key % Table_Size;
		
		//if hash table slot is null then enter the new hashentry
		if(table[hash] == null){
			
			table[hash] = new HashEntry(key,value);
		}
		
		else{
			
			//get the entry of table
			HashEntry entry = table[hash];
			
			// loop till entry is not null and key is not equal to key
			while(entry.getNext()!=null && entry.getKey() != key){
				
				entry = entry.getNext();
				
				if(entry.getKey() == key){
					
					entry.setValue(value);
				}
				else
				{
					entry.next = new HashEntry(key,value);
				}
				
			}
		}
		size++;
	}
	
	public int getValue(int key){
		
		int hash = key % Table_Size;
		
		if(table[hash]==null){
			
			System.out.println("no value found to the key entered ");
		    return -1;
		}
		else{
			HashEntry entry = table[hash];
			
			while(entry!=null && entry.getKey()!=key)
			
		     	entry = entry.getNext();	
			
			if(entry == null)
				{
				System.out.println("entry value is null");
				return -1;
				}
		
			else
			{
				return entry.value;	
			}
		}
	}
	
	public void remove(int key){
		
		int hash = key % Table_Size;
		
		if(table[hash]!= null){
			
			HashEntry prevEntry = null;
			HashEntry entry = table[hash];
			
			while(entry.getNext()!=null && entry.getKey()!=key){
				
				prevEntry = entry;
				entry = entry.getNext();
				
			}
			
			if(entry.getKey()==key){
				
				if(prevEntry == null){
					
					table[hash] = entry.getNext();
				}
				else{
					prevEntry.setNext(entry.getNext());
				}
			}
			
		}
		size--;
	
	}
	public void printHashMap(){
		
		for(int i=0;i<Table_Size;i++){
			
			//System.out.print("\nBucket "+ (i + 1) +" : ");
			
			HashEntry entry = table[i];
			
			while(entry!=null){
				
				System.out.print(entry.key +"   ");
				
				System.out.println(entry.value);
				
				entry = entry.next;
			}
		}
	}
}


