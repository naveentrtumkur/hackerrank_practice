//Compare triplets values.

#include <bits/stdc++.h>

using namespace std;

vector < int > solve(int a0, int a1, int a2, int b0, int b1, int b2){
    // Complete this function
    vector <int> res(2,0);
    if(a0<b0)
        res[1]++;
    else if(a0>b0)
        res[0]++;
    if(a1<b1)
        res[1]++;
    else if(a1>b1)
        res[0]++;
    if(a2<b2)
        res[1]++;
    else if(a2>b2)
        res[0]++;
    return res;
}

int main() {
    int a0;
    int a1;
    int a2;
    cin >> a0 >> a1 >> a2;
    if(!(1<=a0 && a0<=100 && 1<=a1 && a1<=100 && 1<=a2 && a2 <=100))
       {
        cout << "Input value should be between 1 and 100" << endl;
        return 0;
       }
    int b0;
    int b1;
    int b2;
    cin >> b0 >> b1 >> b2;
       if(!(1<= b0 && b0 <=100 && 1<=b1 && b1<=100 && 1<=b2 && b2 <=100))
       {
        cout << "Input value should be between 1 and 100" << endl;
        return 0;
       }
       
    vector < int > result = solve(a0, a1, a2, b0, b1, b2);
    for (ssize_t i = 0; i < result.size(); i++) {
        cout << result[i] << (i != result.size() - 1 ? " " : "");
    }
    cout << endl;
    

    return 0;
}


