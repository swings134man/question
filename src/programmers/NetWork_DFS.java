package programmers;

/**
 * 
 * <pre>
 * </pre>
 * @Class   : 프로그래머스 - 네트워크 (DFS) 
 * @File    : NetWork_DFS.java
 * @Package : programmers
 * @author  : seokjunkang
 * @Date    : 2022. 7. 26. 오전 12:11:56
 */
public class NetWork_DFS {

	public static void main(String[] args) {

	}

	
	
	public int dfs(int i, int[][] computers, boolean[] visited) {
		
		if(visited[i]) {
			return 0;
		}
		
		visited[i] = true;
		
		for (int j = 0; j < computers[i].length; j++) {
			if(computers[i][j] == 1) {
				dfs(j, computers, visited);
			}
		}
		return 1;
	}
	
	
	public int solution(int n, int[][] computers) {
		 int answer = 0;
		 boolean[] visited = new boolean[n];
		 
		 for(int i =0; i<n; i++) {
			if(!visited[i]) {
				answer += dfs(i, computers, visited);
			}
		 }
		 
	     return answer;
	}

}
