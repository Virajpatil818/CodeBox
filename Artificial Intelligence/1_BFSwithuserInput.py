graph = {}

visited = []  # List for visited nodes.
queue = []  # Initialize a queue


def bfs(visited, graph, node):  # function for BFS
    visited.append(node)
    queue.append(node)

    while queue:  # Creating loop to visit each node
        m = queue.pop(0)
        print(m, end=" ")

        for neighbour in graph[m]:
            if neighbour not in visited:
                visited.append(neighbour)
                queue.append(neighbour)


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

print("BFS traversal of a Graph")
bfs(visited, graph, s)
