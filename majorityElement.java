class majorityElement {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int T = Integer.valueOf(br.readLine());
	    for(int cases=0; cases<T; cases++) {
	        int N = Integer.valueOf(br.readLine());
	        String[] arr = br.readLine().split("\\s+");
	        Map<Integer, Integer> map = new HashMap<>();
	        for(int i=0; i<N; i++) {
	            int key = Integer.valueOf(arr[i]);
	            if ( map.containsKey(key) ) {
	                map.replace(key, map.get(key)+1);
	            } else {
	                map.put(key, 1);
	            }
	        }
	        boolean hasMajority = false;
	        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
	            if ( entry.getValue() > N/2 ) {
	                hasMajority = true;
	                System.out.println(entry.getKey());
	            }
	        }
	        if ( !hasMajority ) {
	            System.out.println("-1");
	        }
	    }
	}
}
