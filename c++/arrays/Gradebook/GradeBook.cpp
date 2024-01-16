// This program stores grades of students for one course

#include <iostream>
#include <iomanip>
#include "GradeBook.h"
using namespace std;

GradeBook::GradeBook(string name, const int gradesArray[]){
    setCourseName(name);

    for (int i = 0; i < numberOfStudents; i++){
        grades[i] = gradesArray[i];
    }
}

void GradeBook::setCourseName(string name){
    courseName = name;
}

string GradeBook::getCourseName(){
    return courseName;
}

void GradeBook::displayMessage(){
    cout << "Welcome to Gradebook for " << getCourseName() << endl;
}

void GradeBook::processGrades(){
    outputGrades();
    /// display average of all grades and minimum and maximum grades
   cout << "\nClass average is " << setprecision( 2 ) << fixed << getAverage() << "\nLowest grade is " << getMinimum() << "\nHighest grade is " << getMaximum() << endl;
}

int GradeBook::getMinimum(){
    int minGrade = 100;

    for(int i =0; i < numberOfStudents; i++){
        if(grades[i] < minGrade){
          minGrade = grades[i];  
        }        
    }
    return minGrade;
}

int GradeBook::getMaximum(){
    int maxGrade = 0;

    for(int i =0; i < numberOfStudents; i++){
        if(grades[i] > maxGrade){
          maxGrade = grades[i];  
        }        
    }
    return maxGrade;
}

double GradeBook::getAverage(){
    int total = 0;
    for(int i =0; i < numberOfStudents; i++){
        total += grades[i];            
    }
    return static_cast <double> (total)/numberOfStudents;
}
// Display grades
void GradeBook::outputGrades(){
    
    cout<< "The Grades are:\n " << endl;

    for(int i = 0 ; i < numberOfStudents; i++){
        cout << "Student " << setw(2) << i + 1 << setw(4) << grades[i] << endl;
    }
}

int main()
{
// array of student grades
int gradesArray[ GradeBook::numberOfStudents ] = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };

GradeBook myGradeBook("CS101 Introduction to C++ Programming", gradesArray );
myGradeBook.displayMessage();
myGradeBook.processGrades();
}




