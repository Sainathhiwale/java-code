// js scope local and global varible

var name = 'sai';// global varible which i declare outside the function that known as global varible

function myFunction(num1,num2)// declare varible inside function that is local varible and accessing with function body
{
   return num1+num2;
}






/* js scope

JavaScript Function Scope
In JavaScript there are two types of scope:

Local scope
Global scope
JavaScript has function scope: Each function creates a new scope.

Scope determines the accessibility (visibility) of these variables.

Variables defined inside a function are not accessible (visible) from outside the function.

Local JavaScript Variables
Variables declared within a JavaScript function, become LOCAL to the function.

Local variables have local scope: They can only be accessed within the function.

// code here can NOT use carName

function myFunction() {
    var carName = "Volvo";

    // code here CAN use carName

}

Global JavaScript Variables
A variable declared outside a function, becomes GLOBAL.

A global variable has global scope: All scripts and functions on a web page can access it. 

var carName = " Volvo";

// code here can use carName

function myFunction() {

    // code here can also use carName 

}

*/
