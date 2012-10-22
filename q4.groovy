int binary2decimal(String binary){
	int total = 0;
	
	for(int i=0 ; i<binary.length() ; i++ ){
		if(binary.charAt(binary.length()-(i+1))=='1')
			total += Math.pow(2,i);
	}
return total;
}

String decimal2binary(int decimal){
	String binary = "";
	
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
	String reversed = "";
	
	for(int i=initial.length()-1 ; i>=0 ; i--){
		reversed = reversed + initial.substring(i,i+1);
	}
	return reversed;
}

int choice;
boolean validChoice = false;
String binary;
int decimal;

println "Would you like to: "
println "1.) Convert binary to decimal"
println "2.) Convert decimal to binary"
print "> "

while(!validChoice){
	choice = Integer.parseInt(System.console().readLine());
	if (choice==1){
		validChoice = true;
		print "Enter binary number to convert: ";
		binary = System.console().readLine();
		println "is " + binary2decimal(binary) + " in decimal";
	}
	else if (choice==2){
		validChoice = true;
		print "Enter decimal number to convert: ";
		decimal = Integer.parseInt(System.console().readLine());
		println "is " + decimal2binary(decimal) + " in binary";
	}
	else{
		println "Invalid choice - please re-enter...";
	}
}
