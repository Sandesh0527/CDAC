package assignment5;

class InstanceCounter {
	 private static int instanceCount = 0;
	
	 static {
	 System.out.println("InstanceCounter class loaded.");
	 }
	
	 public InstanceCounter() {
	 instanceCount++;
	 }
	
	 public static int getInstanceCount() {
	 return instanceCount;
	 }
	 @Override
	 public String toString() {
	 return "InstanceCounter with instance count: " + instanceCount;
	 }
	}