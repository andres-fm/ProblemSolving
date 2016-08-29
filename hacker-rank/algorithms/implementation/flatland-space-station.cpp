#include <vector>
#include <algorithm> 
#include <iostream>

using namespace std;
int main(){
    int n;
    int m;
    cin >> n >> m;
    vector<int> c(m);
    for(int i = 0; i < m; i++)
       cin >> c[i];
    sort(c.begin(), c.end());
    int max = 0;
    for(int i = 0; i < m-1; i++)
        if((c[i+1]-c[i])/2 > max)
            max = (c[i+1]-c[i])/2;
    if(c[0] > max)
        max = c[0];
    if(n-1 - c[m-1] > max)
        max = n-1 - c[m-1];
    cout << max;
    return 0;
}
