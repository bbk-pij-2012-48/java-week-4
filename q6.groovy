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
	
