# 🗺️ Day 3 – Network Pathfinder Solution

## ✅ Shortest Path (BFS)
**A -> C -> F**

## ✅ DFS Path & Total Latency
**A -> B -> E -> F**  
**Total latency:** 6 ms

## 🧠 Explanation

- **Breadth-First Search (BFS)** was used to find the shortest path from A to F.  
  BFS checks all possible paths layer by layer, so it finds the path with the fewest hops.
- **Depth-First Search (DFS)** was used to find any valid path from A to F and calculate its total latency.  
  DFS explores each branch deeply before backtracking, so the path and latency may differ from BFS.

## 💻 Algorithms Used

- **BFS:** Ideal for shortest path (fewest edges).
- **DFS:** Good for finding any path and summing weights.

## 📊 Graph

- **A** → **B** (2), **C** (5)
- **B** → **D** (8), **E** (3)
- **C** → **E** (4), **F** (6)
- **D** → *null*
- **E** → **F** (1)
- **F** → *null*

---
