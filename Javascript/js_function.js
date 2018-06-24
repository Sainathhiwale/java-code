/* JavaScript Function Syntax
A JavaScript function is defined with the function keyword, followed by a name, followed by parentheses ().

Function names can contain letters, digits, underscores, and dollar signs (same rules as variables).

The parentheses may include parameter names separated by commas:
(parameter1, parameter2, ...)

The code to be executed, by the function, is placed inside curly brackets: {}

function name(parameter1, parameter2, parameter3) {
    code to be executed
}

Function parameters are listed inside the parentheses () in the function definition.

Function arguments are the values received by the function when it is invoked.

Inside the function, the arguments (the parameters) behave as local variables.

*/

var sum =myFunction(10,10);// // Function is called, return value will end up in sum
console.log(sum);

function myFunction(num1,num2)
{
  return num1+num2;// Function returns the product of num1 and num2
}



