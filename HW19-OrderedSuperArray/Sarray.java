public class Sarray {
    private String[] data;
    private int last;

    public Sarray() {
        data = new String[0];
	last = 0;
    }

    public boolean add(String i){
	String[] data1 = new String[last + 1];
	int index = 0;
	if (i.length() > 0){
	
	    while (i.compareTo(data[index]) < 0){
		data1[index] = data[index];
		index++;
	    }
	    data1[1] = i;
	    index++;
	    while (index < data1.length){
		data1[index] = data[index--];
		index++;
	    }
	}
	else{
	    data1[last++] = i;
	}
	
	data = data1;
	last++;
	return true;
    }
    
    public void add(int index, String i){
	String[] data1 = new String[last + 1];
	for (int j = 0; j < index; j++) {
	    data1[j] = data[j];
	}
	data1[index] = i;
	for (int j = index+1; j < last+1; j++) {
	    data1[j] = data[j-1];
	}
	last++;
	data = data1;
    }
    
    public int size() {
        return last;
    }

    public String get(int index) {
        return data[index];
    }

    public String set(int index, String i){
        String old = data[index];
	data[index] = i;
	return old;
    }

    public String remove(int index){
        String old = data[index];
	String[] data1 = new String[last-1];
	int j = 0;
	for (int i = 0; i < last; i++) {
	    if (i != index) {
		data1[j] = data[i];
		j++;
	    }
	}
	data = data1;
	last--;
	return old;	
    } 

    public String toString() {
	String Arraystring = "{";
	for (int i = 0; i < data.length - 1; i++) {
	    Arraystring += data[i] + ", ";
	}
	return Arraystring + data[data.length -1] + "}";
    }


    //************DRIVER*****************

    public static void main(String[] args) {
	Sarray s = new Sarray();
	System.out.println(s.add("1337"));
	System.out.println(s.add("true"));
	System.out.println(s.add("'nastics!"));
	System.out.println("should be (1337, true, 'nastics!): " + s);
	s.add(0, "4");
	System.out.println("should be (4, 1337, true, 'nastics!): " + s);
	s.add(4, "rinkydink");
	System.out.println("should be (4, 1337, true, 'nastics!, rinkydink): " + s);
	System.out.println(s.remove(3));
	System.out.println("Should be (4, 1337, true, rinkydink): " + s);
	System.out.println("Should be rinkydink: " + s.get(2));
	System.out.println("Should be 4: " + s.size());
    }
}
