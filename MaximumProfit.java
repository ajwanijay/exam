package exam;

import java.util.ArrayList;

public class MaximumProfit {

	public static void main(String args[]) {

		MaximumProfit m = new MaximumProfit();
		System.out.println(m.maxProfit(new int[] { 10, 9, 1, 3, 10, 20, 6, 10 }));

	}

	public int maxProfit(int[] arr) {

		int max = 0;

		ArrayList<Integer> priceList = new ArrayList<>();

		for (int i = 0; i < arr.length; i++)
			priceList.add(arr[i]);

		int i = 0;
		while (i < (priceList.size() - 1)) {

			while (i < priceList.size() - 1 && priceList.get(i + 1) <= priceList.get(i))
				++i;

			if (i >= priceList.size())
				break;

			max -= priceList.get(i++);

			while (i < priceList.size() && priceList.get(i) >= priceList.get(i - 1))
				++i;

			max += priceList.get(i - 1);

		}

		return max;
	}

}
