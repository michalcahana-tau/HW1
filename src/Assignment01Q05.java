public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i==j){ return 0;} // base case 
        int n = m.length; // n = length
        int[] dist = new int[n]; // distances matrix - dist[k] = distance to k
        for (int k =0; k<n; k++){dist[k] = -1;} // initialize -1, not yet calculated
        
        int[] toDoList = new int[n];
        int head = 0; // current node
        int tail = 0; // next node
        dist[i] = 0; //hold starting node i 
        toDoList[tail] = i; // i is next to be explored
        tail++; // update the next one

        while(head<tail){
            int curr = toDoList[head]; // hold current node
            head++; // promote for the next round
            // run a loop on the neighbor for current node
            for(int v =0; v<n; v++){ //
                // check if v is linked to curr (1 in matrix), and has not yet been reviewed (-1)
                if (m[curr][v] ==1 && dist[v] == -1){
                    dist[v] = dist[curr] + 1; // add 1 from current
                    if (v==j){ // stop at destination
                        return dist[v];
                    }
                    if (v!=j){ // if v is not the destination - adds v to toDoList
                        toDoList[tail] = v;
                        tail++;
                    }
                }

            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}