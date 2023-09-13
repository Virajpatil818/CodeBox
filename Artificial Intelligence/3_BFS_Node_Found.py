graph = {}

visited = []
queue = []


def bfs(visited, graph, node, toFind):
    queue.append(node)

    while queue:
        m = queue.pop(0)
        visited.append(m)
        print(m, end=" ")

        if m == toFind:
            print("\nTarget Found in Graph")
            return

        for neighbour in graph[m]:
            if neighbour not in visited:
                queue.append(neighbour)


n = int(input("Enter Number of Nodes :"))
for i in range(0, n):
    k = (input("Enter node:"))
    v = []
    c = int(input("Enter number of adjacent nodes :"))
    for i in range(0, c):
        a = (input("Enter adjacent node:"))
        v.append(a)
    graph[k] = v
print(graph)

s = (input("Enter starting node:"))
toFind = input("Enter node to find :")
print("BFS traversal of a Graph")
bfs(visited, graph, s, toFind)
