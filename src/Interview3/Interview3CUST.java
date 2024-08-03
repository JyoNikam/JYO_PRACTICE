package Interview3;
public class Interview3CUST {
	void getCustID(String name) {
		String output = "";
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isUpperCase(ch) && Character.isDigit(name.charAt(index + 1))
					&& Character.isDigit(name.charAt(index + 2)) && Character.isDigit(name.charAt(index + 3))
					&& Character.isDigit(name.charAt(index + 4)) && Character.isDigit(name.charAt(index + 5))
					&& Character.isDigit(name.charAt(index + 6)) && Character.isDigit(name.charAt(index + 7))) {
				output = output + ch + name.charAt(index + 1) + name.charAt(index + 2) + name.charAt(index + 3)
						+ name.charAt(index + 4) + name.charAt(index + 5) + name.charAt(index + 6)
						+ name.charAt(index + 7);
				System.out.println(output);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Interview3CUST interview3CUST = new Interview3CUST();
		interview3CUST.getCustID("Customer Ids are A1342526 and B5468263");
	}
}
