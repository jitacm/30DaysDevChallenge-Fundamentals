# 🔗 Network Path Finder using BFS and DFS

This Python program simulates a **directed, weighted graph** (like a computer network of servers) and helps you:

- 🔹 Find the **shortest path (in hops)** using **Breadth-First Search (BFS)**
- 🔸 Find a **valid path and its latency** using **Depth-First Search (DFS)**
- 📋 Automatically **displays the adjacency list** before analysis

---

## 🧠 Algorithms Used

- **Breadth-First Search (BFS):** Finds the shortest path from start to target node based on number of edges (hops).
- **Depth-First Search (DFS):** Finds any valid path and calculates total latency (sum of edge weights).

---

## ✅ Features

- 🖱️ Interactive graph creation
- 🔡 Case-insensitive input (A and a are the same)
- 🚫 Handles invalid nodes and wrong formats
- 📋 Displays adjacency list before processing
- 📊 Outputs:
  - Shortest path and hop count (BFS)
  - Valid path and total latency (DFS)

---

## 🔧 Logic (Simplified)

1. **Graph Structure:**
   - The graph is stored as a dictionary (adjacency list).
   - Each node connects to a list of other nodes with weights (latency).
   - Example:
     ```python
     "A": [("B", 2), ("C", 5)]
     ```
2. **BFS (Shortest in Hops):**
   - Checks all nearby nodes first (level by level).
   - Finds the shortest path by number of steps, not weight.
   - Useful to know the fewest connections to reach the target.
3. **DFS (Valid Path + Latency):**
   - Goes deep into the graph before backtracking.
   - Finds any path to the target and adds up the total weight (latency).
   - First valid path found is returned.
4. **Adjacency List Display:**
   - After user input, the graph is printed.
   - Helps you see all connections clearly before finding paths.

---

## 📥 How to Use

1. **Run the program:**
   ```bash
   python network_path_finder.py
   ```

2. **Follow the prompts:**
   - Enter number of nodes
   - Enter node names (space-separated)
   - Add connections (FROM TO WEIGHT)
   - Enter start and target nodes

### 📌 Input Format

- **Nodes:** Single-letter names like `A B C D`
- **Connections:** Enter one per line as `FROM TO WEIGHT` (e.g., `A B 4`)
- Type `done` to stop adding connections

---

## 🧪 Sample Input & Output

### 📝 Input
```
Enter number of nodes: 6
Enter node names: A B C D E F
Enter connection: A B 2
Enter connection: A C 5
Enter connection: B D 8
Enter connection: B E 3
Enter connection: C E 4
Enter connection: C F 6
Enter connection: E F 1
Enter connection: done
Enter starting node: A
Enter target node: F
```

### 📋 Display (Adjacency List)
```
A -> B (weight: 2), C (weight: 5)
B -> D (weight: 8), E (weight: 3)
C -> E (weight: 4), F (weight: 6)
D -> null
E -> F (weight: 1)
F -> null
```

### 🟩 Output
```
🔹 Shortest path (by hops): A -> C -> F
🔹 Number of hops: 2

🔸 Valid path (DFS): A -> B -> E -> F
🔸 Total latency: 6 ms
```

---

## ⚠️ Notes

- All inputs are case-insensitive.
- Program exits safely if start or end nodes are not found.
- Edge weights must be integers.


