class Marathon {
    public static void main (String[] arguments) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };

        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }

        System.out.println("--------------------------------------");

        int first = find(names, times);
        int second = find2(names, times);
        System.out.println(names[first] + ": " + times[first]);
        System.out.println(names[second] + ": " + times[second]);
    }

    public static int find (String[] names, int[] times){
        int Min_time = Integer.MAX_VALUE;
        int index = -1;

        for(int i=0; i<names.length; i++){
            if (times[i] < Min_time){
                index = i;
                Min_time = times[i];
            }
        }
    
        return index;
    }

    public static int find2 (String[] names, int[] times){
        int Min_index = find(names, times);
        int Min_time = Integer.MAX_VALUE;
        int index = -1;

        for(int i = 0; i < names.length; i++){
            if (i == Min_index) continue;
            if(times[i] < Min_time){
                index = i;
                Min_time = times[i];
            }
        }

        return index;
    }
} 