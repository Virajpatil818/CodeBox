def get_graph_input():
    graph = {}
    while True:
        node = input("Enter a node (or type 'exit' to finish): ").strip()
        if node == 'exit':
            break
        neighbors = input(f"Enter neighbors for node {node} separated by spaces: ").split()
        graph[node] = neighbors
    return graph


def dfs(visited, graph, node):
    if node not in visited:
        print(node)
        visited.add(node)
        for neighbour in graph[node]:
            dfs(visited, graph, neighbour)


def main():
    graph = get_graph_input()
    visited = set()
    start_node = input("Enter the starting node for DFS: ")
    print("Following is the Depth-First Search:")
    dfs(visited, graph, start_node)


if __name__ == "__main__":
    main()
