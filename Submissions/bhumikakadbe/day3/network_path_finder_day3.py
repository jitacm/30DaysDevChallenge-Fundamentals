# 📌 IMPORTANT:
# Before running this program and entering inputs, please read the accompanying README file
# to understand:
#   - The input format (nodes, edges, and weights)
#   - How to define connections
#   - Example usage
#
# This will help you avoid input errors and make the most of the program.



from collections import deque

# Function to take user input and build the graph
def build_graph():
    graph = {}
    n = int(input("Enter number of nodes: "))
    
    print("Enter node names (e.g., A B C D):")
    nodes = input().upper().split()  # Case-insensitive node names

    for node in nodes:
        graph[node] = []
    
    print("\nEnter connections in format: FROM TO WEIGHT")
    print("Type 'done' when finished.")

    while True:
        entry = input("Enter connection: ").strip()
        if entry.lower() == 'done':
            break
        try:
            u, v, w = entry.upper().split()
            w = int(w)
            if u in graph:
                graph[u].append((v, w))
            else:
                print(f"⚠️ Node '{u}' not found in node list.")
        except:
            print("❌ Invalid input. Please enter in format: FROM TO WEIGHT (e.g., A B 3)")
    
    return graph

# BFS to find shortest path in hops
def bfs_shortest_path(graph, start, end):
    queue = deque([[start]])
    visited = set()

    while queue:
        path = queue.popleft()
        node = path[-1]

        if node == end:
            return path

        if node not in visited:
            visited.add(node)
            for neighbor, _ in graph.get(node, []):
                new_path = list(path)
                new_path.append(neighbor)
                queue.append(new_path)
    return None

# DFS to find any path with total weight
def dfs_find_path(graph, start, end, path=None, total_weight=0):
    if path is None:
        path = []
    path = path + [start]
    if start == end:
        return (path, total_weight)
    for neighbor, weight in graph.get(start, []):
        if neighbor not in path:
            result = dfs_find_path(graph, neighbor, end, path, total_weight + weight)
            if result:
                return result
    return None

# --- MAIN PROGRAM ---
# 📌 Reminder for the user
print("📢 Please read the README file before entering input for proper format and examples.")

graph = build_graph()

# 📋 Show adjacency list
print("\n📋 Adjacency List of the Graph:")
for node, neighbors in graph.items():
    if neighbors:
        print(f"{node} -> {', '.join([f'{v} (weight: {w})' for v, w in neighbors])}")
    else:
        print(f"{node} -> null")

# Take input for start and end node
start_node = input("\nEnter starting node: ").strip().upper()
end_node = input("Enter target node: ").strip().upper()

# ✅ Check if nodes exist
if start_node not in graph or end_node not in graph:
    print("❌ Invalid start or end node. Please check your input.")
    exit()

# Run BFS
shortest_path = bfs_shortest_path(graph, start_node, end_node)
if shortest_path:
    print("\n🔹 Shortest path (by hops):", " -> ".join(shortest_path))
    print("🔹 Number of hops:", len(shortest_path) - 1)
else:
    print("\n❌ No path found using BFS.")

# Run DFS
dfs_result = dfs_find_path(graph, start_node, end_node)
if dfs_result:
    path, latency = dfs_result
    print("\n🔸 Valid path (DFS):", " -> ".join(path))
    print("🔸 Total latency:", latency, "ms")
else:
    print("\n❌ No path found using DFS.")
