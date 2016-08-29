#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int T;
    cin >> T;
    for(int t = 0; t < T; t++){
        int n, k;
        cin >> n >> k;
        int permutation[n+1] = {0};
        bool possible = true;
        for(int i = 1; i <= n; i++){
            if(i-k > 0 && permutation[i-k] == 0)
                permutation[i-k] = i;
            else if(i+k <= n && permutation[i+k] == 0)
                 permutation[i+k] = i;
            else{
                cout << -1;
                possible = false;
                break;
            }
        }
        if(possible)
            for(int i = 1; i <= n; i++)
                cout << permutation[i] << " ";
        cout << endl;
    }
    return 0;
}

