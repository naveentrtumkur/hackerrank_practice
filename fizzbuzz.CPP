class Solution {
public:
    vector<string> fizzBuzz(int n) {
        
        int i=1;
        vector<string> fiz;
        for(i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
               fiz.push_back("FizzBuzz"); 
                //break;
            }
            else if(i%3==0)
            {
                fiz.push_back("Fizz");
                //break;
            }
            else if(i%5==0)
            {
                fiz.push_back("Buzz"); 
            }
            else
            fiz.push_back(to_string(i));
        }
        return fiz;
        
    }
};
