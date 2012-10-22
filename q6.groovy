class Point{
	double x;
	double y;
	
	double distanceTo(Point that){
		return Math.sqrt(Math.pow(this.x-that.x,2)+Math.pow(this.y-that.y,2));
	}
	
	double distanceToOrigin(){
		Point origin = new Point();
		origin.x = 0;
		origin.y = 0;
		return this.distanceTo(origin);
	}
	
	void moveTo(double newX, double newY){
		this.x = newX;
		this.y = newY;
	}
	
	void moveTo(Point destination){
		this.x = destination.x;
		this.y = destination.y;
	}
	
	Point clone(){
		return this; // does this work??????
	}
	
	Point opposite(){
		Point opposite = new Point();
		opposite.x = -1 * this.x;
		opposite.y = -1 * this.y;
		return opposite;
	}
}
	
Point tester = new Point();
tester.x = 3;
tester.y = 4;

Point overThere = new Point();
overThere.x = -1;
overThere.y = 1;

println "Point starts at (3,4)"
println "Distance to (-1,1) is " + tester.distanceTo(overThere);
println "Distance to origin is " + tester.distanceToOrigin();
println "Moving to (5,6)...";
tester.moveTo(5,6);
println "Point is now at (" + tester.x + "," + tester.y + ")";
println "Moving point to (-1,1)..."
tester.moveTo(overThere);
println "Point is now at (" + tester.x + "," + tester.y + ")";
println "Cloning Point..."
Point clone = new Point();
clone = tester.clone();
println "Clone is now at (" + clone.x + "," + clone.y + ")";
println "Making a clone of the opposite point...";
Point opposite = new Point();
opposite = tester.opposite();
println "Opposite clone is now at (" + opposite.x + "," + opposite.y + ")";
