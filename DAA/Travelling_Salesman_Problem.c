#include <stdio.h>

#define MAXN 15
#define INF 999999

int n;
int d[MAXN][MAXN];
int dp[MAXN][1 << MAXN];

// g(i, S): minimum cost starting from city i visiting all cities in set S
int g(int i, int S)
{
    // Base case
    if (S == 0)
        return d[i][0];

    // Already computed
    if (dp[i][S] != -1)
        return dp[i][S];

    int minCost = INF;

    // Try all cities in set S
    for (int k = 0; k < n; k++)
    {
        if (S & (1 << k)) // if city k is in set
        {
            int cost = d[i][k] + g(k, S & ~(1 << k));

            if (cost < minCost)
                minCost = cost;
        }
    }

    return dp[i][S] = minCost;
}

int main()
{
    printf("Enter number of cities: ");
    scanf("%d", &n);

    printf("Enter cost matrix:\n");
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            scanf("%d", &d[i][j]);

    // Initialize dp with -1
    for (int i = 0; i < n; i++)
        for (int mask = 0; mask < (1 << n); mask++)
            dp[i][mask] = -1;

    int S = 0;

    // Add all cities except starting city (0)
    for (int i = 1; i < n; i++)
        S |= (1 << i);

    int result = g(0, S);

    printf("Given Cost Matrix:\n");
    for (int i = 0; i < n; i++)
    {
        printf("|");
        for (int j = 0; j < n; j++)
            printf(" %d ", d[i][j]);
        printf("|\n");
    }

    printf("Minimum travelling cost: %d\n", result);

    return 0;
}
