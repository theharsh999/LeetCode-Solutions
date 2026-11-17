class MyHashMap {

    List<List<Integer>> map = new ArrayList<>();

    public MyHashMap() {
    }

    public void put(int key, int value) {
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i).get(0) == key) {
                map.get(i).set(1, value);
                return;
            }
        }
        map.add(new ArrayList<>(Arrays.asList(key, value)));
    }

    public int get(int key) {
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i).get(0) == key) {
                return map.get(i).get(1);
            }
        }
        return -1;
    }

    public void remove(int key) {
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i).get(0) == key) {
                map.remove(i);
                return;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */