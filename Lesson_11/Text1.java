package class cars.models;

	public class Nissan extends car  {
		/**
		 *Default constructor.
		 */
		public Nissan(){
			System.out.println("");
			//set the name to Nissan
			name="Nissan";
			//set the number of wheels to 4
			numberOfWheels=4;
			//set the number of doors to 5
			numberOfDoors=5;
		}

		/**
		 *Parameterized
		 */
		public Nissan(String model){
			subModel=model;
		}

		public void runVeryFast(){
			consumeFuel();
			consumeFuel();
		}



}


