import java.util.Arrays;

public class Assignment01Q04 {

    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        // check base conditions
        int len = array.length;
        if (len<=1 || move ==0 || (direction != 'R' && direction != 'L')){ 
            return array; 
        }
        // normalize negative for direction
        if (move < 0) {
            move = -move; // flip step sign and direction 
            if (direction == 'R') {
                direction = 'L';
            } else {
                direction = 'R';
            }
        }
        move = move %len; // effective movement 
        int step = 0; //actual movement
        if (direction =='R'){step = move;} // right
        if (direction == 'L'){step = len-move;} // left

        // actual shift
        int[] temp = new int[len]; //shifted array
        for (int idx = 0 ; idx < len; idx++){
            temp[(idx + step)%len] = array[idx]; //%keeps us in the length of the array
        };
         for (int idx = 0 ; idx < len; idx++){
              array[idx] = temp[idx]; //fill in the array
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}