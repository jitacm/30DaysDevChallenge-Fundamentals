from collections import deque

network = {
    'A': [('B', 2), ('C', 5)],
    'B': [('D', 8), ('E', 3)],
    'C': [('E', 4), ('F', 6)],
    'D': [],
    'E': [('F', 1)],
    'F': []
}
# bfs search 
def bfs_path(graph, start, goal):
    """Find shortest path (fewest hops) using BFS."""
    q = deque()
    q.append((start, [start]))
    seen = set()
    while q:
        curr, path = q.popleft()
        if curr == goal:
            return path
        seen.add(curr)
        for nxt, _ in graph[curr]:
            if nxt not in seen:
                q.append((nxt, path + [nxt]))
    return []

#dfs search
def dfs_path(graph, start, goal, path=None, latency=0):
    """Find any path using DFS, return path and total latency."""
    if path is None:
        path = [start]
    if start == goal:
        return path, latency
    for nxt, weight in graph[start]:
        if nxt not in path:
            found = dfs_path(graph, nxt, goal, path + [nxt], latency + weight)
            if found:
                return found
    return None

shortest = bfs_path(network, 'A', 'F')

dfs_result = dfs_path(network, 'A', 'F')
if dfs_result:
    dfs_path, dfs_latency = dfs_result
else:
    dfs_path, dfs_latency = [], 0

print("Shortest path from A to F (BFS):", " -> ".join(shortest))
print("A valid path from A to F (DFS):", " -> ".join(dfs_path))
print("Total latency of DFS path:", dfs_latency)