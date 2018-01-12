// Utopian tree problem where the growth is different in different seasons.
/*
The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height. Each summer, its height increases by 1 meter.

Laura plants a Utopian Tree sapling with a height of 1 meter at the onset of spring. How tall will her tree be after growth cycles?

Input Format

The first line contains an integer, , the number of test cases. 
 subsequent lines each contain an integer, , denoting the number of cycles for that test case.

Constraints 
 


Output Format

For each test case, print the height of the Utopian Tree after  cycles. Each height must be printed on a new line.

Sample Input

3
0
1
4
Sample Output

1
2
7

*/

#include <bits/stdc++.h>

using namespace std;

int utopianTree(int n) {
    // Complete this function
    int sum = 1;
    for(int i=0;i<n;i++)
    {
        if(i%2==0)
            sum  =  sum * 2;
        else
            sum = sum + 1;
    }
    return sum;
}

int main() {
    int t;
    cin >> t;
    for(int a0 = 0; a0 < t; a0++){
        int n;
        cin >> n;
        int result = utopianTree(n);
        cout << result << endl;
    }
    return 0;
}


