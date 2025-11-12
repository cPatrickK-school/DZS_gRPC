/**
 * Simulates warehouse data for testing purposes.
 */
public class WarehouseSimulation {

	/**
	 * Generates a random double within the specified range.
	 *
	 * @param inMinimum the minimum value
	 * @param inMaximum the maximum value
	 * @return the random double
	 */
	private double getRandomDouble(int inMinimum, int inMaximum) {
		double number = (Math.random() * ((inMaximum - inMinimum) + 1)) + inMinimum;
		double rounded = Math.round(number * 100.0) / 100.0;
		return rounded;
	}

	/**
	 * Generates a random integer within the specified range.
	 *
	 * @param inMinimum the minimum value
	 * @param inMaximum the maximum value
	 * @return the random integer
	 */
	private int getRandomInt(int inMinimum, int inMaximum) {
		double number = (Math.random() * ((inMaximum - inMinimum) + 1)) + inMinimum;
		Long rounded = Math.round(number);
		return rounded.intValue();
	}

	/**
	 * Generates warehouse data for the specified warehouse ID.
	 *
	 * @param inID the warehouse ID
	 * @return the generated warehouse data
	 */
	public WarehouseData getData(String inID) {
		WarehouseData data = new WarehouseData();
		data.setWarehouseID(inID);
		data.setWarehouseName(SimulationsPool.standorte[getRandomInt(0, SimulationsPool.standorte.length - 2)] + " Warehouse");
		data.setWarehouseAddress(SimulationsPool.addresses[getRandomInt(0, SimulationsPool.addresses.length - 2)]);
		data.setWarehousePostalcode(SimulationsPool.zipCodes[getRandomInt(0, SimulationsPool.zipCodes.length - 2)]);
		data.setWarehouseCity(SimulationsPool.standorte[getRandomInt(0, SimulationsPool.standorte.length - 2)]);
		data.setWarehouseCountry("Austria");

		data.getProducts().add(new Product(getRandomInt(0, 100), "Apple", "A01", "Food", "kg"));
		data.getProducts().add(new Product(getRandomInt(0, 100), "Banana", "B01", "Food", "kg"));
		data.getProducts().add(new Product(getRandomInt(0, 100), "Toothpaste", "T01", "Hygiene", "pcs"));
		data.getProducts().add(new Product(getRandomInt(0, 100), "Shampoo", "S01", "Hygiene", "pcs"));
		return data;
	}
}