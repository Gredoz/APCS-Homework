public class sort extends sArray {


    // Given int array a with last item at index "last"
    // newvalue is the new value to insert

    public void shift() {
	int i;
	for (i = last; i > 0 && newvalue < a[i-1] ; i--) {
	    a[i] = a[i-1];    
	}
	a[i]=newvalue;
    }

    public void isort() 


}