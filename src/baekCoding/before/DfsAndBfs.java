package baekCoding.before;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 
 * <pre>
 * </pre>
 * @Class   : 백준 DFS, BFS 로 탐색 결과 출력 
 * @File    : DfsAndBfs.java
 * @Package : baekCoding
 * @author  : seokjunkang
 * @Date    : 2022. 7. 20. 오후 5:46:57
 */
public class DfsAndBfs {

	static int[][] arr;
	static boolean[] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt(); // 정점의 개수
		int n = sc.nextInt(); // 간선의 개수
		int v = sc.nextInt(); // 탐색을 시작할 정점 번호
		
		// 인접행렬 생성
		arr = new int[n+1][n+1]; 	// index를 1부터 맞추기 위해 n+1 
		for(int i =0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		
		
	} //main
	
	//dfs 깊이우선 (재귀)
	public static void dfs(int v) {
		visited[v] = true;
		System.out.println(v + " - ");
		
		if(v == arr.length) {
			return ;
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[v][i] == 1 && visited[i] == false) {
				dfs(i);
			}
		}
	}
	
	//너비우선탐색(큐)
    public static void bfs(int V) {
        Queue<Integer> que = new LinkedList<Integer>();

        que.add(V);
        visited[V] = true;
        System.out.print(V + " ");

        while(!que.isEmpty()) {
            int temp = que.poll();
            for(int i = 1; i < arr.length; i++) {
                if(arr[temp][i] == 1 && visited[i] == false) {
                    que.add(i);
                    visited[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }

}
