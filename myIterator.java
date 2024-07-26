import java.util.ArrayList;
import java.util.Iterator;
public class myIterator {
    //An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Mercedes");
        cars.add("Volvo");
        cars.add("Honda");
        cars.add("Toyota");

        Iterator<String> ite = cars.iterator();//iterator(): This is a method call on the ArrayList instance cars.. This method returns an Iterator object for the ArrayList.
        //ite:This is the name of the variable being declared. It will hold the reference to the Iterator object that is returned by the iterator() method.

        System.out.println(ite.next());
        

        //Looping through a collection using the while loop
        while(ite.hasNext()){
            System.out.println(ite.next());
        }

        //By calling ite.next() once before the loop, you ensure the first element is printed first, and the loop handles the rest of the elements.

        //Print the first item
        //System.out.println(ite.next());,,this returns an error because,,,Calling ite.next() again will cause the NoSuchElementException because there are no elements left to return.


    }
    
}
