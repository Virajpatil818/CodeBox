class Graph:
    def __init__(self, vertices):
        self.num_vertices = vertices
        self.edges = []

    def add_edge(self, u, v, weight):
        self.edges.append([u, v, weight])

    def find(self, parent, node):
        if parent[node] == node:
            return node
        return self.find(parent, parent[node])

    def union(self, parent, rank, x, y):
        root_x = self.find(parent, x)
        root_y = self.find(parent, y)

        if rank[root_x] < rank[root_y]:
            parent[root_x] = root_y
        elif rank[root_x] > rank[root_y]:
            parent[root_y] = root_x
        else:
            parent[root_y] = root_x
            rank[root_x] += 1

    def kruskal_algorithm(self):
        result = []
        i, num_edges = 0, 0
        self.edges = sorted(self.edges, key=lambda item: item[2])
        
        parent = list(range(self.num_vertices))
        rank = [0] * self.num_vertices

        while num_edges < self.num_vertices - 1:
            u, v, weight = self.edges[i]
            i += 1
            root_u = self.find(parent, u)
            root_v = self.find(parent, v)

            if root_u != root_v:
                num_edges += 1
                result.append([u, v, weight])
                self.union(parent, rank, root_u, root_v)

        print("Minimum Spanning Tree:")
        for u, v, weight in result:
            print("Edge: {} - {}  Weight: {}".format(u, v, weight))


num_vertices = int(input("Enter the number of vertices in the graph: "))
graph = Graph(num_vertices)

print("Enter the edges (format: source destination weight):")
for _ in range(num_vertices - 1):
    u, v, weight = map(int, input().split())
    graph.add_edge(u, v, weight)

graph.kruskal_algorithm()
