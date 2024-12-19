
public class Activity3 {
	
	 private static final double EARTH_ORBITAL_PERIOD = 31557600; 
	    private static final double MERCURY_ORBITAL_PERIOD = 0.2408467 * EARTH_ORBITAL_PERIOD; 
	    private static final double VENUS_ORBITAL_PERIOD = 0.61519726 * EARTH_ORBITAL_PERIOD; 
	    private static final double MARS_ORBITAL_PERIOD = 1.8808158 * EARTH_ORBITAL_PERIOD; 
	    private static final double JUPITER_ORBITAL_PERIOD = 11.862615 * EARTH_ORBITAL_PERIOD; 
	    private static final double SATURN_ORBITAL_PERIOD = 29.447498 * EARTH_ORBITAL_PERIOD; 
	    private static final double URANUS_ORBITAL_PERIOD = 84.016846 * EARTH_ORBITAL_PERIOD; 
	    private static final double NEPTUNE_ORBITAL_PERIOD = 164.79132 * EARTH_ORBITAL_PERIOD;
	    
	    public static void main(String[] args) {
	    	long ageInSeconds = 1000000000L;
	    	
	    	 System.out.println("Age in seconds: " + ageInSeconds);
	         
	         System.out.println("Age on Earth: " + calculateAge(ageInSeconds, EARTH_ORBITAL_PERIOD) + " years");
	         System.out.println("Age on Mercury: " + calculateAge(ageInSeconds, MERCURY_ORBITAL_PERIOD) + " years");
	         System.out.println("Age on Venus: " + calculateAge(ageInSeconds, VENUS_ORBITAL_PERIOD) + " years");
	         System.out.println("Age on Mars: " + calculateAge(ageInSeconds, MARS_ORBITAL_PERIOD) + " years");
	         System.out.println("Age on Jupiter: " + calculateAge(ageInSeconds, JUPITER_ORBITAL_PERIOD) + " years");
	         System.out.println("Age on Saturn: " + calculateAge(ageInSeconds, SATURN_ORBITAL_PERIOD) + " years");
	         System.out.println("Age on Uranus: " + calculateAge(ageInSeconds, URANUS_ORBITAL_PERIOD) + " years");
	         System.out.println("Age on Neptune: " + calculateAge(ageInSeconds, NEPTUNE_ORBITAL_PERIOD) + " years");
	    }
	         
	         public static double calculateAge(long ageInSeconds, double orbitalPeriodInSeconds) {
	             return ageInSeconds / orbitalPeriodInSeconds;
	    }

}
