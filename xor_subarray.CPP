/*

Problem Logic Breakdown
When the number of values is even, the resulting subarrays are as follows:
Test case #1: {1,2,3,4}
1⊕2⊕3⊕4⊕(1⊕2)⊕(2⊕3)⊕(3⊕4)⊕(1⊕2⊕3)⊕(2⊕3⊕4)⊕(1⊕2⊕3⊕4)
Notice that 1 occurs an even number of times, as does 2, 3, and 4. XORing any number an even number of times produces 0 as a result.
When the number of values is odd, the resulting subarrays are as follows:
Test case #2: {1,2,3}
1⊕2⊕3⊕(1⊕2)⊕(2⊕3)⊕(1⊕2⊕3)
Notice that every even index (0, 2) occurs an odd number of times and that every odd index (1) occurs an even number of times. Recall that XORing a number by itself produces 0 for any even number of XOR operations.

//Logic of the probelm and problem break down.
*/

#include <cstdio>

int main() {
    int T;
    scanf("%d", &T);

    while(T--) {
        int N;
        scanf("%d", &N);

        int nums[N];
        int result;

        for(int i = 0; i < N; i++) scanf("%d", &nums[i]);

        if(N % 2 == 0) {
            result = 0;
        } else {
            result = nums[0];
            for(int idx = 2; idx < N; idx += 2) {
            	result ^= nums[idx];
            }
        }

        printf("%d", result);
        if(T != 0) puts("");
    }
}
