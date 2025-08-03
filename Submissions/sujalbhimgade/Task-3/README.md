# 🧩 Network Pathfinder in Java

A basic Java program that finds paths in a network graph using two strategies: fewest connections (hops) and total connection weight (latency).

## 📌 Features

- Represent a network as a human-readable adjacency map
- Find the shortest path by hop count (BFS)
- Find a sample path with total latency (DFS)
- Easy to modify or expand for real-world learning

---

## ✅ Example Output

=== Network Path Finder ===

Fewest edge counts path: [A, B, E, F]  
Total edge counts: 3  

Example path with total weight: [A, C, F]  
Total weight: 11ms

---

## ⚙️ How It Works

- The network is modeled as a `Map` where each node points to its neighbors and their connection weights.
- To find the path with the fewest hops:
  - A **Breadth-First Search (BFS)** is performed from the source to the destination.
- To find a path with total weight:
  - A **Depth-First Search (DFS)** is used, tracking cumulative latency along the way.
- Both methods return the first valid path they find for simplicity.