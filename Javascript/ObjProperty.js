/* There are two different ways to access an object property.

You can use person.property or person["property"].
Object Properties
The name:values pairs in JavaScript objects are called properties:

Property	Property Value
firstName	John
lastName	Doe
age	        50
eyeColor	blue

Accessing Object Properties
You can access object properties in two ways:

objectName.propertyName

objectName["propertyName"]
Example1
person.lastName;

*/

var person ={ name:"sainath",lastname:"hiwale", adress:"bangalore", mobile:"9548233145"};
var dummy= person.lastname;
console.log(dummy);

console.log(person);

