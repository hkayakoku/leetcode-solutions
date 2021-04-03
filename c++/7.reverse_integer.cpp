class Solution {
public:
    int reverse(int x) {
    
        
    if(x == std::numeric_limits<int>::min())
        return 0;
        
    int isNeg = x < 0 ? -1 : 1;
	x *= isNeg;

	
	std::queue<char> dStack;

	while(x != 0)
	{
		int digit = x - (x / 10) * 10;
		dStack.push(digit);
		x = x / 10;	
	}

	int reversed = 0;

	for(int i = dStack.size(); i >= 1; i--)
	{
		double factor = pow(10.0, static_cast<double>(i - 1));

		if(reversed + factor * dStack.front() > 
		std::numeric_limits<int>::max())
		{
			return 0;
		}

		reversed += factor * dStack.front();
		dStack.pop();
	}

	return reversed * isNeg;
    }
};