class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph = new List[numCourses];
        Arrays.setAll(graph, i -> new ArrayList<>());
        int[] inDegree = new int[numCourses];

        for (int[] p : prerequisites) {
            graph[p[1]].add(p[0]);
            inDegree[p[0]]++;
        }

        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) queue.offer(i);
        }

        int[] order = new int[numCourses];
        int count = 0;

        while (!queue.isEmpty()) {
            int course = queue.poll();
            order[count++] = course;
            for (int next : graph[course]) {
                if (--inDegree[next] == 0) {
                    queue.offer(next);
                }
            }
        }

        return count == numCourses ? order : new int[0];
    }
}   
