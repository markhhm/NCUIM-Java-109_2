import java.util.Scanner;

public class Test{

	public static void main(String[] args){

		//品項
		String a = "薯條(小)";
		String b = "麥香雞  ";
		String c = "可樂(小)";
		String d = "雪碧(小)";
		String e = "薯條(中)";
		String f = "薯餅    ";
		String g = "滿福堡  ";
		String h = "薯條(大)";
		String i = "大麥克  ";
		String j = "玉米濃湯";

		//價格
		int ap = 33;
		int bp = 44;
		int cp = 28;
		int dp = 28;
		int ep = 44;
		int fp = 30;
		int gp = 48;
		int hp = 55;
		int ip = 72;
		int jp = 40;

		String name[] = {a,b,c,d,e,f,g,h,i,j};//品項陣列

		int price[] = {ap,bp,cp,dp,ep,fp,gp,hp,ip,jp};//價格陣列

		String priceS[] = new String[10];

		for(int o = 0; o < price.length; o++){

			priceS[o] = String.valueOf(price[o]);

		}

		Scanner s = new Scanner(System.in);

		System.out.printf("%s%10s%13s\n\n","編號","品項","價格");
		for(int counter = 0; counter < name.length; counter++){

			System.out.printf("%-12d%s%10d\n",counter+1,name[counter],price[counter]);

		}

		int quit = 1;//判斷是否繼續購買
		int buy = 1;//餐點編號
		int type = 0;//單點or套餐
		int typeNumber = 0;//套餐種類
		String buylist[] = new String [100];//購買清單
		int buyNumber = 0;//購買編號
		int leveup = 0;//升級
		int drink = 0;//飲料類型
		int total = 0;//總金額

		while(quit != 2){

			System.out.print("\n選擇欲購買品項:");

			buy = s.nextInt();

			System.out.print("\n");

			if(buy == 2||buy == 7||buy == 9){

				System.out.print("1單點 2套餐:");

				type = s.nextInt();

				System.out.print("\n");

				if(type == 2){

					System.out.print("1 普通套餐 2 薯餅套餐 3 吃很堡套餐 : ");

					typeNumber = s.nextInt();

					System.out.print("\n");

					if(typeNumber == 1){

						System.out.print("是否升級薯條(大) 1是 2否 :");

						leveup = s.nextInt();

						System.out.print("\n");

						if(leveup == 1){

							int priceA = price[(buy - 1)] + 71;

							String spriceA = String.valueOf(priceA);

							System.out.print("請選擇飲料 1可樂 2雪碧 :");

							drink = s.nextInt();

							System.out.print("\n");

							if(drink == 1){
								buylist[buyNumber] = name[(buy - 1)] + "A餐      " + spriceA + "元\n         薯條(大)\n         可樂";
								buyNumber++;
								total += priceA;

							}else if(drink == 2){

								buylist[buyNumber] = name[(buy - 1)] + "A餐      " + spriceA + "元\n         薯條(大)\n         雪碧";
								buyNumber++;
								total += priceA;

							}

						}else if(leveup == 2){

							int priceA = price[(buy - 1)] + 60;

							String spriceA = String.valueOf(priceA);

							System.out.print("請選擇飲料 1可樂 2雪碧 :");

							drink = s.nextInt();

							System.out.print("\n");

							if(drink == 1){
 
								buylist[buyNumber] = name[(buy - 1)] + "A餐      " + spriceA + "元\n         薯條(中)\n         可樂";
								buyNumber++;
								total += priceA;

							}else if(drink == 2){

								buylist[buyNumber] = name[(buy - 1)] + "A餐      " + spriceA + "元\n         薯條(中)\n         雪碧";
								buyNumber++;
								total += priceA;

							}
						}
					}else if(typeNumber == 2){

						System.out.print("是否升級薯條 1升級薯條(中) 2升級薯條(大) 3否 : ");

						leveup = s.nextInt();

						System.out.print("\n");

						if(leveup == 1){

							int priceA = price[(buy - 1)] + 81;

							String spriceA = String.valueOf(priceA);

							System.out.print("請選擇飲料 1可樂 2雪碧 :");

							drink = s.nextInt();

							System.out.print("\n");

							if(drink == 1){

								buylist[buyNumber] = name[(buy - 1)] + "B餐      " + spriceA + "元\n         薯條(中)\n         薯餅\n         可樂";
								buyNumber++;
								total += priceA;

							}else if(drink == 2){

								buylist[buyNumber] = name[(buy - 1)] + "B餐      " + spriceA + "元\n         薯條(中)\n         薯餅\n         雪碧";
								buyNumber++;
								total += priceA;

							}

						}else if(leveup == 2){

							int priceA = price[(buy - 1)] + 92;

							String spriceA = String.valueOf(priceA);

							System.out.print("請選擇飲料 1可樂 2雪碧 :");

							drink = s.nextInt();

							System.out.print("\n");

							if(drink == 1){

								buylist[buyNumber] = name[(buy - 1)] + "B餐      " + spriceA + "元\n         薯條(大)\n         薯餅\n         可樂";
								buyNumber++;
								total += priceA;

							}else if(drink == 2){

								buylist[buyNumber] = name[(buy - 1)] + "B餐      " + spriceA + "元\n         薯條(大)\n         薯餅\n         雪碧";
								buyNumber++;
								total += priceA;

							}

						}else if(leveup == 3){

							int priceA = price[(buy - 1)] + 70;

							String spriceA = String.valueOf(priceA);

							System.out.print("請選擇飲料 1可樂 2雪碧 :");

							drink = s.nextInt();

							System.out.print("\n");

							if(drink == 1){

								buylist[buyNumber] = name[(buy - 1)] + "B餐      " + spriceA + "元\n         薯條(小)\n         薯餅\n         可樂";
								buyNumber++;
								total += priceA;

							}else if(drink == 2){

								buylist[buyNumber] = name[(buy - 1)] + "B餐      " + spriceA + "元\n         薯條(小)\n         薯餅\n         雪碧";
								buyNumber++;
								total += priceA;

							}

						}
					}else if(typeNumber == 3){


						int priceA = price[(buy - 1)] + 70;

						String spriceA = String.valueOf(priceA);

						System.out.print("請選擇飲料 1可樂 2雪碧 :");

						drink = s.nextInt();

						System.out.print("\n");

						if(drink == 1){

							buylist[buyNumber] = name[(buy - 1)] + "C餐      " + spriceA + "元\n         薯條(大)\n         可樂";
							buyNumber++;
							total += priceA;

						}else if(drink == 2){

							buylist[buyNumber] = name[(buy - 1)] + "C餐      " + spriceA + "元\n         薯條(大)\n         雪碧";
							buyNumber++;
							total += priceA;

						}
					}

				}else{

					buylist[buyNumber] = name[(buy - 1)] + "          " + priceS[(buy - 1)] + "元";
					buyNumber++;
					total += price[(buy - 1)];

				}

			}else{

				
					buylist[buyNumber] = name[(buy - 1)] + "          " + priceS[(buy - 1)] + "元";
					buyNumber++;
					total += price[(buy - 1)];

			}
			System.out.print("是否繼續購買?1是 2否 : ");

			quit = s.nextInt();

			System.out.print("\n");

		}

		System.out.println("餐點明細:");
		System.out.printf("%s%5s%14s\n\n","編號","品項","價格");

		for(int o = 0; o <buyNumber; o++){

			System.out.printf("%d     %s\n\n",(o+1),buylist[o]);

		}

		System.out.printf("總金額:%19d元",total);

	}
}