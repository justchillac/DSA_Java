package Recursion2;

// JAVA recursive function to
// solve tower of hanoi puzzle
import java.io.*;
import java.math.*;
import java.util.*;
class TowerOfHanoi {
    static void towerOfHanoi(int n, char source, char auxiliary, char target) {
        if(n==1){
            System.out.println("Move disk "+n+" from " +source+ " to " +target);
            return;
        }
        towerOfHanoi(n-1, source, target, auxiliary);
        System.out.println("Move disk "+n+ " from " +source+ " to " +target);
        towerOfHanoi(n-1, auxiliary, source, target);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        towerOfHanoi(n, 'A', 'B', 'C');
    }
}


// This code is contributed by jyoti369
