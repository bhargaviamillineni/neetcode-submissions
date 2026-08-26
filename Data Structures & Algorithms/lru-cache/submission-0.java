class LRUCache {
    class Node{
        int key;
        int val;
        Node prev;
        Node next;
        Node(int key , int val){
            this.key = key;
            this.val = val;
        }
    }
    int cap;
    HashMap<Integer, Node> mp;
    Node head;
    Node tail;
    public LRUCache(int capacity) {
        cap = capacity;
        mp = new HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!mp.containsKey(key)) return -1;
        Node node = mp.get(key);
        remove(node);
        addToEnd(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        if(mp.containsKey(key)){
            Node node = mp.get(key);
            node.val = value;
            remove(node);
            addToEnd(node);
        }else{
            Node node = new Node(key , value);
            mp.put(key , node);
            addToEnd(node);
            if(mp.size() > cap){
                Node lru = head.next;
                remove(lru);
                mp.remove(lru.key);
            }
        }
    }
    public void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    public void addToEnd(Node node){
        Node p = tail.prev;
        p.next = node;
        node.prev = p;
        node.next = tail;
        tail.prev = node;
    }
}
