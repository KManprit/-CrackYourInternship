class Solution {
    public int findDuplicate(int[] nums) {
         // Create a HashMap to store elements and their counts

         //type 1:-
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for(int num : nums){
        //     if(map.containsKey(num))
        //     {
        //      map.put(num , map.get(num)+1);
        //     }else{
        //         map.put(num  ,1);
        //     }
        // }


        // for(int num : map.keySet()){
        //     if(map.get(num) > 1){
        //         return num;
        //     }
        // }
        // return -1;



        //type 2
        Set<Integer> set = new HashSet<>(); // Set to store unique elements
        Queue<Integer> queue = new LinkedList<>(); // Queue to store elements


        for(int num  : nums){
            if(!set.add(num)){
                return num;
            }

            queue.add(num);
        }

        return -1;

        //type 3 - Arraylist
    }
}