// This program print 2D arrays
// Function Implementation

#include <iostream>
using namespace std;

void printArray(const int [][3]); // declaration
const int rows = 2;
const int columns = 3;

int main(){
    
    // braces represent rows
    int array1[rows][columns] = {{1,2,3},{4,5,6}};
    int array2[rows][columns] = {{6,7},{8}};
    int array3[rows][columns] = {1,2,3,4,5};

    cout << "Array 1: " << endl;
    printArray(array1);

    cout << "Array 2: " << endl;
    printArray(array2);

    cout << "Array 3: " << endl;
    printArray(array3);

   return 0;
}

void printArray(const int arr[][columns]){
    // rows
    for (int r =0 ; r < rows; r++){
        // columns
        for (int c = 0; c < columns; c++ ){
            cout << arr[r][c] << " ";
        }
        cout << endl;
    }
}