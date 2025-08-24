
package pf;
class Staff { 
    String name1;
    int id1;

    // Constructor 
    public Staff(String name2, int id2) {
        this.name1 = name2;
        this.id1 = id2;
    }
}

public class test {
    
    public static void main(String[] args) {
     Staff[] staffMembers = new Staff[3]; 

        staffMembers[0] = new Staff("Alice", 1);
        staffMembers[1] = new Staff("Bob", 2);
        staffMembers[2] = new Staff("Charlie", 3); 

        // Accessing staff members
        System.out.println(staffMembers[0].name1); 

    }
}
