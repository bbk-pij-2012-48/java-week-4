int binary2decimal(String binary){
	int total = 0;
	
	for(int i=binary.length()-1 ; i>=0 ; i-- ){
		if(binary.charAt(i)=='1')
			total += Math.pow(2,i);
	}
return total;
}

String decimal2binary(int decimal){
	String binary;
	
	while(decimal>0){
		if(decimal%2==0)
			binary += "0";
		else
			binary += "1";
		decimal /= 2;
	}
	
	return reverseString(binary);
}

String reverseString(String initial){
	String reversed;
	
	for(int i=initial.length()-1 ; i>=0 ; i--){
		reversed = reversed + initial.substring(i,i+1);
	}
	return reversed;
}

String a = "abcdefg";
print reverseString(a);
