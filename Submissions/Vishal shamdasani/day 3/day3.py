from collections import deque

# A -> B (weight: 2), C (weight: 5)
# B -> D (weight: 8), E (weight: 3)
# C -> E (weight: 4), F (weight: 6)
# D -> null
# E -> F (weight: 1)
# F -> null

tree={"A":[("B",2),("C",5)],"B":[("D",8),("E",3)],"C":[("E",4),("F",6)],"D":[], "E":[("F",1)],"F":[]}

def bfs(start, goal,tree):
    queue = deque([(start,[start])])
    visited= set()
    while queue:
        current,path=queue.popleft()
        if current == goal:
            return path
        visited.add(current)
        for i,j in tree[current]:
            if i not in visited:
                queue.append((i,path+[i]))
print(bfs("A","F",tree))

def dfs(start, goal, tree,path,cost=0):
    if not path:
        path=[start]
    if start == goal:
        return path, cost
    for node, weight in tree[start]:
        if node not in path:
            search=dfs(node, goal,tree,path+[node],cost+weight)
            if search:
                return search
    return None

print(dfs("A","F",tree,[]))

