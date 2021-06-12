import java.util.Scanner;

public class Order {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		SinglePoint single = new SinglePoint();

		System.out.printf("%s%10s%13s\n\n", "編號", "品項", "價格");

		for (int counter = 1; counter <= 10; counter++) {

			single = new SinglePoint(counter);

			System.out.printf("%-12d%s%10d\n", single.getNo(), single.getName(), single.getPrice());

		}

		int quit = 1;// 是否繼續購買
		int buy = 0;// 購買商品品項
		int type = 0;// 單點or套餐
		int typeNumber = 0;// A,B,C餐
		int setcount = 0;// 套餐數量
		int total = 0;// 總金額

		int Singlecount[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };// 單點各餐點數量
		int Setcount[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };// 套餐各餐點數量

		SinglePoint singlelist[] = { new SinglePoint(1), new SinglePoint(2), new SinglePoint(3), new SinglePoint(4),
				new SinglePoint(5), new SinglePoint(6), new SinglePoint(7), new SinglePoint(8), new SinglePoint(9),
				new SinglePoint(10), };// 單點項目
		SetMeal setlist[] = { new SetMeal(2, 1), new SetMeal(2, 2), new SetMeal(2, 3), new SetMeal(7, 1),
				new SetMeal(7, 2), new SetMeal(7, 3), new SetMeal(9, 1), new SetMeal(9, 2), new SetMeal(9, 3) };// 套餐項目
		while (quit != 2) {

			System.out.print("\n選擇欲購買品項:");

			buy = s.nextInt();

			System.out.print("\n");

			switch (buy) {

				case 1:
					Singlecount[(buy - 1)]++;
					break;
				case 2:
					System.out.print("1單點 2套餐:");
					type = s.nextInt();

					System.out.print("\n");

					if (type == 1) {

						Singlecount[(buy - 1)]++;

					} else if (type == 2) {

						System.out.print("1.普通套餐 2.薯餅套餐 3.吃很堡套餐");
						typeNumber = s.nextInt();

						System.out.print("\n");

						for (int i = 1; i <= 3; i++) {

							if (typeNumber == i) {

								Setcount[(i - 1)]++;
							}
						}
					}
					break;
				case 3:
					Singlecount[(buy - 1)]++;
					break;
				case 4:
					Singlecount[(buy - 1)]++;
					break;
				case 5:
					Singlecount[(buy - 1)]++;
					break;
				case 6:
					Singlecount[(buy - 1)]++;
					break;
				case 7:
					System.out.print("1單點 2套餐:");
					type = s.nextInt();

					System.out.print("\n");

					if (type == 1) {

						Singlecount[(buy - 1)]++;

					} else if (type == 2) {

						System.out.print("1 普通套餐 2 薯餅套餐 3 吃很堡套餐 : ");
						typeNumber = s.nextInt();

						System.out.print("\n");

						for (int i = 1; i <= 3; i++) {

							if (typeNumber == i) {

								Setcount[(i + 2)]++;
							}
						}
					}
					break;
				case 8:
					Singlecount[(buy - 1)]++;
					break;
				case 9:
					System.out.print("1單點 2套餐:");
					type = s.nextInt();

					System.out.print("\n");

					if (type == 1) {

						Singlecount[(buy - 1)]++;

					} else if (type == 2) {

						System.out.print("1 普通套餐 2 薯餅套餐 3 吃很堡套餐");
						typeNumber = s.nextInt();

						System.out.print("\n");

						for (int i = 1; i <= 3; i++) {

							if (typeNumber == i) {

								Setcount[(i + 5)]++;
							}
						}
					}
					break;
				case 10:
					Singlecount[(buy - 1)]++;
					break;
			}

			System.out.print("是否繼續購買?1是 2否 : ");

			quit = s.nextInt();

		}

		System.out.printf("\n%s%12s%8s\n\n", "品項", "數量", "價格");

		for (int i = 0; i < 9; i++) {

			if (Setcount[i] > 0) {

				System.out.println(
						setlist[i] + "    x" + Setcount[i] + "       " + setlist[i].getPrice() * Setcount[i] + "元\n");

				total += setlist[i].getPrice() * Setcount[i];
			}
		}

		for (int i = 0; i < 10; i++) {

			if (Singlecount[i] > 0) {

				System.out.println(singlelist[i] + "  x" + Singlecount[i] + "        "
						+ singlelist[i].getPrice() * Singlecount[i] + "元\n");

				total += singlelist[i].getPrice() * Singlecount[i];
			}
		}

		System.out.printf("\n總金額:                 %d元", total);

	}
}