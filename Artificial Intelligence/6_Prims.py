INF = 9999999

N = int(input("Enter the number of vertices in the graph: "))

G = []
for i in range(N):
    row = []
    for j in range(N):
        weight = int(input(f"Enter the weight for edge {i}-{j} (or 0 if no edge): "))
        row.append(weight)
    G.append(row)

selected_node = [False] * N
no_edge = 0

start_vertex = int(input("Enter the starting vertex (0 to N-1): "))
selected_node[start_vertex] = True

print("Edge : Weight\n")
while no_edge < N - 1:
    minimum = INF
    a = 0
    b = 0

    for m in range(N):
        if selected_node[m]:
            for n in range(N):
                if (not selected_node[n]) and G[m][n]:
                    if minimum > G[m][n]:
                        minimum = G[m][n]
                        a = m
                        b = n

    if minimum != INF:
        print(f"{a}-{b}: {G[a][b]}")
        selected_node[b] = True
        no_edge += 1
