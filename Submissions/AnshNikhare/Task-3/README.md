# 🧩 Day 3 Task – Network Pathfinder

## ✅ The shortest path from A to F (in terms of hops)
A -> B -> E -> F

This path has 3 hops (edges), which is the minimum possible.

## ✅ A path found using DFS and its total weight
DFS path: A -> C -> F  
Total latency (weight): 11 ms

## 🧠 Explanation

### 1. **BFS for Shortest Path (by hops)**  
I used **Breadth-First Search (BFS)** to find the shortest path in terms of the number of edges.  
BFS explores all nodes level by level, so the first time we reach the target node `F`, we are guaranteed to have the fewest number of hops.  
This makes BFS ideal for this task.

### 2. **DFS for Any Valid Path and Weight Calculation**  
I used **Depth-First Search (DFS)** to explore one possible path from `A` to `F`.  
DFS goes deep into the graph and finds the path `A -> C -> F`.  
The total weight is calculated as:  
- A → C: 5 ms  
- C → F: 6 ms  
→ Total: **11 ms**

Although this is not the lowest-latency path (another path like A→B→E→F has weight 2+3+1=6), DFS is not designed to find the minimum-weight path — only a valid one.

> Note: For minimum-weight path, Dijkstra's algorithm would be more appropriate.

## 🏁 Summary
- **Shortest path (hops):** A → B → E → F
- **DFS path (latency):** A → C → F (total: 11 ms)
- Algorithms chosen based on their strengths: BFS for shortest hops, DFS for path existence and exploration.
