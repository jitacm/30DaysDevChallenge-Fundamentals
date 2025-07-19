from collections import deque

graph = {
    'A': ['B', 'C'],
    'B': ['D', 'E'],
    'C': ['E', 'F'],
    'D': [],
    'E': ['F'],
    'F': []
}

def bfs_shortest_path(start, goal):
    readed_node = set()
    queue = deque([[start]])
    # print(queue , graph , readed_node)
    while queue:
        path = queue.popleft()
        node = path[-1]

        if node == goal:
            return path

        if node not in readed_node:
            print(readed_node)
            for neighbor in graph.get(node, []):
                print(neighbor)
                new_path = list(path)
                new_path.append(neighbor)
                queue.append(new_path)
            readed_node.add(node)

    return None

path = bfs_shortest_path('A', 'F')
print("Shortest path (by hops):" ,path)
