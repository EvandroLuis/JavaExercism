class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
			String number = String.valueOf(numberToCheck);
			int power = number.length();

			int sum = 0;
			for (char c : number.toCharArray()) {
				int num = Character.getNumericValue(c);
				sum += Math.pow(num, power);
			}

			return numberToCheck == sum;
		}


	}
