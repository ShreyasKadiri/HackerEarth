/*
// Sample code to perform I/O:

#include <iostream>

using namespace std;

int main() {
	int num;
	cin >> num;										// Reading input from STDIN
	cout << "Input number is " << num << endl;		// Writing output to STDOUT
}

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
*/

// Write your code here
#include <iostream>
#include<algorithm>
#include<climits>
using namespace std;

int main() {
	int t;
	cin >>t;
	while(t--){
		int n;
		cin>>n;
		int a[n];
		for(int i=0; i<n; i++){
			cin>>a[i];}

		int result=INT_MAX; 
        sort(a,a+n); 
      for(int i=0; i<n-1; i++){ 
        result=min(result,a[i]^a[i+1]); 
    } 
		cout<<result<<endl;
	}	

}
