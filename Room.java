
	 public class Room {
	        int number;
	        String name;
	        int bed;
	        double rentRate;
	        int days;

	        public Room(int number, String name, int bed, double rentRate, int days) {
	            this.number = number;
	            this.name = name;
	            this.bed = bed;
	            this.rentRate = rentRate;
	            this.days = days;
	        }

	        public String toString() {
	            String m = "Guest name: " + name + "\n";
	            m += "Room number: " + number + "\n";
	            m += "Room beds: " + bed + "\n";
	            m += "Rate: " + rentRate + "\n";
	            m += "Rented for: " + days + " days";
	            return m;
	        }

	        public double calculateTotal() {
	            return rentRate * days;
	        }

	        public void addBed() {
	            if (bed == 1) {
	                bed = 2;
	            } else {
	                System.out.println("Cannot add a bed");
	            }
	        }
	 

	    public static void main(String[] args) {
	        Room r1 = new Class().new Room(123, "Blake", 1, 123.50, 5);
	        System.out.println(r1);
	        System.out.println(r1.calculateTotal());
	        r1.addBed();
	        System.out.println(r1);
	        r1.addBed();
	    }
	}