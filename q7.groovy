class Integer2{
	int value;
	
	int getValue(){
		return this.value;
	}
	
	void setValue(int newValue){
		this.value = newValue;
	}
	
	boolean isEven(){
		if(this.value%2==0)
			return true;
		else
			return false;
	}
	
	boolean isOdd(){
		if(this.isEven())
			return false;
		else
			return true;
	}
	
	void prettyPrint(){
		print this.value;
	}
	
	String toString(){
		return String.valueOf(this.value);
	}
}

Integer2 i2 = new Integer2();
print "Enter a number: ";
String str = System.console().readLine();
int i = Integer.parseInt(str);
i2.setValue(i);
print "The number you entered is "
if (i2.isEven()) {
println "even.";
} else if (i2.isOdd()) {
println "odd.";
} else {
println "undefined!! Your code is buggy!";
}
int parsedInt = Integer.parseInt(i2.toString());
if (parsedInt == i2.getValue()) {
println("Your toString() method seems to work fine.");
}

