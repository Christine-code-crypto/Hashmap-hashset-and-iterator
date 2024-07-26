//a hashmap stores values in key value pairs
import java.util.HashMap;

class MyHashMap{
    public static void main(String[] args) {
        
    HashMap <String, String> capitalCities = new HashMap<String,String>();

    //ADD KEY AND VALUES (cOUNTRIES,CITIES)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    //capitalCities.add("USA", "Berlin"); the method add does not exist for hashmap
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);
    //REMOVE AN ITEM
    System.out.println(capitalCities.remove("Norway"));

    System.out.println(capitalCities);

    //To access a value in hashmap, use a get method and refer to its key

    System.out.println(capitalCities.get("England"));

    System.out.println(capitalCities.size()); //to find out how many items are there use the size method
    

    //Loop through elements of a hashmap with a for-each loop
    //use the keySet() method if you only want the keys and the values() method if you only want the values
    //print keys
    for(String i:capitalCities.keySet()){
        System.out.println(i);
    }

    for(String i: capitalCities.values()){
        System.out.println(i);
    }
    //printing both keys and values
    for(String i: capitalCities.keySet()){
        System.out.println("Keyset is " + i+ " and value is " + capitalCities.get(i));
    }
    capitalCities.clear(); //to remove all items we use the clear method
    System.out.println(capitalCities);


    // Create a HashMap object called people
    HashMap<String, Integer> people = new HashMap<String, Integer>();

    System.out.println("HashMap with String and integer values");

    // Add keys and values (Name, Age)
    people.put("John", 32);
    people.put("Steve", 30);
    people.put("Angie", 33);

    for (String i : people.keySet()) {
      System.out.println("key: " + i + " value: " + people.get(i));
    }
    


}
}

