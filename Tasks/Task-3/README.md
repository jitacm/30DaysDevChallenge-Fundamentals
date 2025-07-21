# 🧩 Day 3 Task – Network Pathfinder

Welcome to **Day 3** of the 30 Days Dev Challenge - Fundamentals!
Today's task will challenge your understanding of graph traversal algorithms. You'll need to navigate a network to find specific paths using both Breadth-First and Depth-First Search.

## 📝 Task Description

You are given a **directed, weighted graph** representing a computer network. The nodes are servers, and the weighted edges represent the latency (in ms) between them.

**Graph Representation (Adjacency List):**
* **A** -> **B** (weight: 2), **C** (weight: 5)
* **B** -> **D** (weight: 8), **E** (weight: 3)
* **C** -> **E** (weight: 4), **F** (weight: 6)
* **D** -> *null*
* **E** -> **F** (weight: 1)
* **F** -> *null*

The **starting node is `A`** and the **target node is `F`**.

Your task is to:

1.  **Implement** graph traversal algorithms to explore the network.
2.  **Find the shortest path** in terms of the number of hops (edges) from `A` to `F`.
3.  **Find any valid path** from `A` to `F` using a different traversal method and calculate its total weight (latency).
4.  Submit your findings and a brief explanation.

## 🧠 How to Navigate the Network (Algorithm Hints)

You can use any graph traversal algorithm, but here are two common approaches perfect for this task:

* **Breadth-First Search (BFS):**
    * BFS explores the graph layer by layer. It visits all neighbors of a node before moving on to the next level.
    * This property makes it ideal for finding the **shortest path in terms of the number of edges**.
    * It typically uses a **queue** data structure to keep track of the nodes to visit next.

* **Depth-First Search (DFS):**
    * DFS explores as far as possible down one branch before backtracking. It goes deep first.
    * This algorithm is excellent for finding if a path exists between two nodes and can easily be adapted to list the nodes in that path.
    * It typically uses a **stack** data structure (or recursion, which uses the call stack).

## 📂 Submission Format

Inside your folder `/submissions/your_username/Task-3/`, include:

* `solution.txt` or `README.md`
    Containing:
    * ✅ The **shortest path** from A to F (sequence of nodes, e.g., A -> C -> F).
    * ✅ A **path found using the other algorithm** and its **total weight**.
    * 🧠 A short **explanation** of which algorithm you used for each task and why.

## 🏆 Points

* Completing this task successfully earns you **10 points**.

## ⚠️ Rules

* 🚫 Do **not** use ChatGPT or any AI tools to solve or generate code.
* ✅ You may use any of the allowed languages: **Python, C/C++, Java, or JavaScript**.
* 🧠 Implement the logic yourself — no copying or plagiarism.
* 📅 Submit your solution before the deadline to earn your points.

Good luck on Day 3! Keep the momentum going. 🗺️✨