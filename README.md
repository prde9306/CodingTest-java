# CodingTest - Java
## ✋ BOJ(백준)
1. BackTracking
2. BaseDataStructure
3. DFS/BFS
4. DynamicProgramming
5. Search/Sort
   * BOJ_2750, 2751 Arrays.sort()로 못푼다. Arrays.sort는 dual-pivot Quicksort알고리즘 이용(평균 시간 복잡도 O(nlogn) 최악의 경우 O(n^2)) - Collections.sort()로 해결해야 한다. 
   * Collections.sort() 은 Timsort이다. Timsort 의 경우 합병 및 삽입정렬 알고리즘을 사용한다. 이렇게 두 가지가 섞여있는 정렬 알고리즘을 hybrid sorting algorithm 이라고 하는데, 합병정렬(Merge Sort)의 경우 최선, 최악 모두 O(nlogn)  을 보장하고. 삽입정렬(Insertion sort)의 경우 최선의 경우는 O(n) , 최악의 경우는 O(n2) 이다. 그리고 두 정렬 모두 안정 정렬(stable sort)이기 때문에 Timsort를 hybrid stable sorting algorithm이라고도 한다.
즉, 합병정렬의 최악의 경우와 삽입정렬의 최선의 경우를 짬뽕한 알고리즘이 Timsort 라는 것이다.

***
## ✋ LeetCode
1. Easy
2. Medium
3. Hard
***

## ✋ Programmers
1. DFS/BFS
2. DynamicProgramming
3. ExhaustiveSearch
4. Greedy
5. Stack/Queue
***

## 💻 Inflearn(강의)
1. Chap 01 : charAt(i), toCharArray(), toUpperCase 사용법 철저히 알기
2. 
3. Chap 03 TwoPointer
   * 알고리즘 O(N^2) -> O(N)으로 
   * 연속 부분 증가수열 if 후에 while쓴는 메커니즘
4. Chap 04 HashMap
   * slidingWindow 로 푸는 방법, HashMap 메소드 활용법(equals로 객체비교 가능), TreeSet 활용법
5. Chap 05 Stack,Queue 
   * charAt(i) String에서 적절하게 활용
6. Chap 06 Sorting, Searching
   * 선택정렬, 버블정렬, 삽입정렬, 퀵정렬, 병합정렬 개념
7. Chap 07 DFS, BFS 기초 
8. Chap 08 DFS, BFS 
   * 부분집합 DFS 
   * else안에 for문 +DFS- 명확히 Stack으로 그려서 확인/ 중복순열
   * 이미 갔던 길 가지 않게 끔 ch[]배열 생성해서
   * 메모이제이션 조합 풀이방식 암기 
   * 
9. Chap 09 Greedy  
   * 객체정렬하는 방식, PriorityQueue 사용법 명확히 
10. Chap 10
    * 피보나치 관련
    * 거스름 돈 : DFS, 냅색 알고리즘 구분해서 알기
