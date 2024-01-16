// This program performs linear search in an array

#include <iostream>
using namespace std;

int linearSearch(const int [], int, int); // declaration

int main(){
   
    const int arraySize = 100;
    int a[arraySize];
    int searchKey;
    
    // Fill an array at run time
    for (int counter = 0; counter < arraySize ; counter++){
        a[counter] = 3 * counter;
    }
    
    cout << "Enter integer search key: ";
    cin >> searchKey;
    
    // Search an array with searchKey
    int element = linearSearch(a, searchKey, arraySize);
    
    if (element != -1){
        cout << "Found value in element " << element << endl;
    }else{
        cout << "Value not found" << endl;
    }
   
}

int linearSearch(const int array[], int key, int sizeOfArray){
    
    for (int location = 0; location < sizeOfArray ; location++){
        if(array[location] == key){ // if found
            return location; // return location of the key
        }
    }
    return -1; // If not found
}