// This program sorts an array's values into an ascending order.

#include <iostream>
#include <iomanip>
using namespace std;


void insertSort(int [], int); // declaration

int main() {

const int arraySize = 10; // size of array a
int data[ arraySize ] = { 66, 56, 4, 10, 100, 51, 87, 30, 5, 52 };
int element; // temporary variable to hold element

// Output un-sorted array
cout << "Unsorted array:\n";
for ( int i = 0; i < arraySize; i++ )
    cout << setw( 4 ) << data[ i ];

// Sort Array
for ( int counter = 1; counter < arraySize; counter++ )
{
    element = data[counter]; // store the value in the current element
    int location = counter; // initialize location to place element
    
    // Search for the location where to put the element
    while ( ( location > 0 ) && ( data[location - 1] > element ) )
    {
        data[location] = data[location - 1];
        location--;
    } // end while
    data[location] = element; // place element to location
} // end for

// Output sorted array
cout << "\nSorted array:\n";
for( int i = 0; i < arraySize; i++ )
    cout << setw( 4 ) << data[ i ];
cout << endl;

}//endmain