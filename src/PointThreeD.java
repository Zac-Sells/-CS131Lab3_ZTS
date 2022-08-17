public class PointThreeD {

	private double xPoint;
	private double yPoint;
	private double zPoint;
	
	public PointThreeD() {
		super();
	}
	
	public PointThreeD(double x, double y, double z) {
		super();
		this.xPoint = x;
		this.yPoint = y;
		this.zPoint = z;
	}

	public double getxPoint() {
		return xPoint;
	}

	public void setxPoint(double xPoint) {
		this.xPoint = xPoint;
	}

	public double getyPoint() {
		return yPoint;
	}

	public void setyPoint(double yPoint) {
		this.yPoint = yPoint;
	}

	public double getzPoint() {
		return zPoint;
	}

	public void setzPoint(double zPoint) {
		this.zPoint = zPoint;
	}

	@Override
	public String toString() {
		return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
	}
	
	
}