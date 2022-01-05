# 5-7 5-8 5-10~ check! 



# 5-1
생략

# 5-2
생략

# 5-3

public class Hello {

	public static void main(String[] args) {

		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
		}
		
		System.out.println(sum);
	}
}

# 5-4

public class Hello {

	public static void main(String[] args) {

		int[][] arr = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
		};
		
		int total = 0;
		float average = 0;
		
		int i = 0, j =0;
		
		for (i = 0; i < arr.length; i++)
		{
			for (j = 0; j < arr[i].length; j++)
			{
				total += arr[i][j];
			}
		}
		
		average = total / (float)(i*j);
		
		System.out.println(total);
		System.out.println(average);
		
	}
}

# 5-5
  
import java.util.Arrays;

public class Hello {

	public static void main(String[] args) {

		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
		for (int i = 0; i < ballArr.length; i++) {
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
			
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}
		
		ball3 = Arrays.copyOf(ballArr, 3);
		
		for (int i = 0; i < ball3.length; i++)
		{
			System.out.print(ball3[i]);
		}
	}
}

# 5-6

public class Hello {

	public static void main(String[] args) {

		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println(money);
		
		for (int i = 0; i < coinUnit.length; i++)
		{
			int coin = (money / coinUnit[i]);
			money %= coinUnit[i];
			
			System.out.println(coin);
		}
	}
}

# 5-7

# 5-8

public class Hello {

	public static void main(String[] args) {

		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		int[] counter = new int[4];
		
		for(int i=0; i < answer.length;i++) {
			counter[answer[i]-1] += 1; 
		}
		
		for(int i=0; i < counter.length;i++) {
		
			System.out.print(counter[i] + "*".repeat(counter[i])); // .repeat(숫자) 이건 새로 배운 문법임 다른 방법은 그냥 이중 for문 쓰면 될 것 같다.
			
			System.out.println();
		}

	}
}

# 5-9
import java.util.Arrays;

public class Hello {
	public static void main(String[] args) {
		char[][] star = {
		{'*','*',' ',' ',' '},
		{'*','*',' ',' ',' '},
		{'*','*','*','*','*'},
		{'*','*','*','*','*'}
		};
		
		char[][] result = new char[star[0].length][star.length];
		
		System.out.println(star[0]);
		//System.out.println(Arrays.deepToString(result));
		
		for(int i=0; i < star.length;i++) {
			for(int j=0; j < star[i].length;j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		for(int i=0; i < star.length;i++) { // 0~4
			for(int j=0; j < star[i].length;j++) { // 0~5
				int idx = star.length-1-i;
				result[j][idx] = star[i][j]; // 그림을 그려 좌표간의 관계식을 유추하면 된다.
			}
		}
		
		for(int i=0; i < result.length;i++) {
			for(int j=0; j < result[i].length;j++) {
				System.out.print(result[i][j]);
			}
		
		System.out.println();
		}
	}
}

# 5-10
