#include <stdio.h>

#define V 5
#define INF 999999

// Extract vertex with minimum distance
int extractMin(int dist[], int visited[])
{
    int min = INF, min_index = -1;

    for (int v = 0; v < V; v++)
    {
        if (!visited[v] && dist[v] <= min)
        {
            min = dist[v];
            min_index = v;
        }
    }
    return min_index;
}

void dijkstra(int graph[V][V])
{
    int dist[V], visited[V];

    // Initialize
    for (int i = 0; i < V; i++)
    {
        dist[i] = INF;
        visited[i] = 0;
    }

    dist[0] = 0; // Source vertex

    for (int count = 0; count < V - 1; count++)
    {
        int u = extractMin(dist, visited);

        if (u == -1)
            break;

        visited[u] = 1;

        // Relax edges
        for (int j = 0; j < V; j++)
        {
            if (graph[u][j] > 0 && !visited[j])
            {
                if (dist[j] > dist[u] + graph[u][j])
                {
                    dist[j] = dist[u] + graph[u][j];
                }
            }
        }
    }

    // Print results
    printf("Vertex \t Distance from Source\n");
    for (int i = 0; i < V; i++)
    {
        printf("%d \t %d\n", i, dist[i]);
    }
}

int main()
{
    int graph[V][V] = {
        {0, 2, 0, 1, 0},
        {2, 0, 3, 2, 0},
        {0, 3, 0, 0, 1},
        {1, 2, 0, 0, 3},
        {0, 0, 1, 3, 0}
    };

    dijkstra(graph);

    return 0;
}
