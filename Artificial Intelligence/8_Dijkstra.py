class Graph:
   def __init__(self, vertices):
       self.V = vertices
       self.graph = [[0 for column in range(vertices)] for row in range(vertices)]


   def printSolution(self, dist):
       print("Vertex \t Distance from Source")
       for node in range(self.V):
           print(node, "\t\t", dist[node])


   def minDistance(self, dist, sptSet):
       min_val = float("inf")
       min_index = -1
       for v in range(self.V):
           if dist[v] < min_val and sptSet[v] == False:
               min_val = dist[v]
               min_index = v


       return min_index


   def dijkstra(self, src):
       dist = [float("inf")] * self.V
       dist[src] = 0
       sptSet = [False] * self.V


       for _ in range(self.V):
           u = self.minDistance(dist, sptSet)
           sptSet[u] = True
           for v in range(self.V):
               if (
                   self.graph[u][v] > 0
                   and sptSet[v] == False
                   and dist[v] > dist[u] + self.graph[u][v]
               ):
                   dist[v] = dist[u] + self.graph[u][v]


       self.printSolution(dist)


V = int(input("Enter the number of vertices in the graph: "))
g = Graph(V)


print("Enter the adjacency matrix (enter 0 if there is no edge):")
for i in range(V):
   row = input().split()
   g.graph[i] = list(map(int, row))


src_vertex = int(input("Enter the source vertex (0 to {}): ".format(V - 1)))


g.dijkstra(src_vertex)
