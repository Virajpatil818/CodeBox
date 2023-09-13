def dfs(visited, graph, node, goal):
    if node == goal:
        print(node)
        print("Node Found")
        return
    if node not in visited:
        print(node)
        visited.add(node)
        for neighbour in graph[node]:
            dfs(visited, graph, neighbour, goal)


graph = {}
n = int(input("How many nodes you want to Enter:"))
for i in range(0, n):
    k = (input("Enter node:"))
    v = []
    c = int(input("Enter number of adjacent nodes"))
    for i in range(0, c):
        a = (input("Enter adjacent node:"))
        v.append(a)
    graph[k] = v
print(graph)

s = (input("Enter starting node:"))
goal = input("Enter node to find :")

visited = set()

print("DFS traversal of a Graph")
dfs(visited, graph, s, goal)
