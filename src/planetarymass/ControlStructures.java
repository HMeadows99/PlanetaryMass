/**
 * 
 */
package planetarymass;

import java.util.Scanner;

/**
 * @author h.meadows
 *Mr.Hardman
 *assignment 4, program 1
 *11/15/2016
 */
public class ControlStructures {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("please enter your weight");
		double userWeight = userInput.nextDouble();
		
		System.out.println("Please enter a Celestial body to calculate your weight on");
		String celestialbody = userInput.next();
		
		if(celestialbody.equalsIgnoreCase("mercury")){
		
			double userSpaceWeight = (userWeight * 0.38);
			
			System.out.println("your weight on mercury is " +  userSpaceWeight + " pounds");
		}
		if(celestialbody.equalsIgnoreCase("venus")){
			
			double userSpaceWeight = (userWeight * 0.91);
			
			System.out.println("your weight on venus is " +  userSpaceWeight + " pounds");
		}
		if(celestialbody.equalsIgnoreCase("earth")){
			
			double userSpaceWeight = (userWeight * 1);
			
			System.out.println("your weight on earth is " +  userSpaceWeight + " pounds");
		}
		if(celestialbody.equalsIgnoreCase("moon")){
			
			double userSpaceWeight = (userWeight * 0.165);
			
			System.out.println("your weight on the moon is " +  userSpaceWeight + " pounds");
		}
		if(celestialbody.equalsIgnoreCase("mars")){
			
			double userSpaceWeight = (userWeight * 0.38);
			
			System.out.println("your weight on mars is " +  userSpaceWeight + " pounds");
		}
		if(celestialbody.equalsIgnoreCase("jupiter")){
			
			double userSpaceWeight = (userWeight * 2.34);
			
			System.out.println("your weight on jupiter is " +  userSpaceWeight + " pounds");
		}
		if(celestialbody.equalsIgnoreCase("saturn")){
			
			double userSpaceWeight = (userWeight * 1.06);
			
			System.out.println("your weight on saturn is " +  userSpaceWeight + " pounds");
		}
		if(celestialbody.equalsIgnoreCase("uranus")){
			
			double userSpaceWeight = (userWeight * 0.92);
			
			System.out.println("your weight on uranus is " +  userSpaceWeight + " pounds");
		}
		if(celestialbody.equalsIgnoreCase("neptune")){
			
			double userSpaceWeight = (userWeight * 1.19);
			
			System.out.println("your weight on neptune is " +  userSpaceWeight + " pounds");
		}
		if(celestialbody.equalsIgnoreCase("pluto")){
			
			double userSpaceWeight = (userWeight * 0.06);
			
			System.out.println("your weight on pluto is " +  userSpaceWeight + " pounds");
			
			userInput.close();
		}
	}

}
