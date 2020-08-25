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
#include<iostream>
using namespace std;
int main()
{    int t;    
     cin>>t;
     while(t--)    
     {        
          int n,k,p;        
          cin>>n;        
          int a[n];
          cin>>k;
          for(int i=0;i<n;i++){
              cin>>a[i];}        
          k%=n;
          for(int i=0;i<n;i++){
               int l=a[(i+(n-k))%n];
               cout<<l<<" ";
          } cout<<"\n";
      }
return 0;
}
