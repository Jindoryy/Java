# Arrays Class

1. 배열의 배교와 출력 - equals(), toString()

- equals()는 1차원 배열, deepEquals()는 다차원 배열에 사용된다.
```
    String[][] str2D = new String[][] {{"aaa", "bbb"},{"AAA","BBB"}};
    String[][] str2D2 = new String[][] {{"aaa", "bbb"},{"AAA","BBB"}};

    System.out.println(Arrays.equals(str2D, str2D2)); // false
    System.out.println(Arrays.deepEquals(str2D, str2D2)); // true
```


- toString()은 1차원 배열, deepToString()은 다차원 배열에 사용된다.
```
    int[] arr = {0,1,2,3,4};
    int[][] arr2D = {{11, 12}, {21, 22}};
		
    System.out.println(Arrays.toString(arr)); // [0, 1, 2, 3, 4]
    System.out.println(Arrays.deepToString(arr2D)); // [[11, 12], [21, 22]]
```


2. 배열의 복사 - copyOf(), copyOfRange()

- copyOf()는 배열 전체를, copyOfRange()는 배열의 일부를 복사해서 반환한다.
```
    int[] arr = {0,1,2,3,4};
    int[] arr2 = Arrays.copyOf(arr, arr.length); // arr2=[0,1,2,3,4]
    int[] arr3 = Arrays.copyOf(arr, 7); // arr3=[0,1,2,3,4,0,0]
    int[] arr4 = Arrays.copyOfRange(arr, 2, 4); // arr4=[2,3] -> 4는 불포함
    int[] arr5 = Arrays.copyOfRange(arr, 0, 7); // arr5=[0,1,2,3,4,0,0]
```


3. 배열의 정렬 - sort()

- 배열을 정렬할때는 sort()를 사용한다
```
    int[] arr = {3, 2, 0, 1, 4};
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr)); // [0, 1, 2, 3, 4]
```
