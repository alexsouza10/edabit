/*Is the Number Less than or Equal to Zero?
Create a function that takes a number as its only argument and returns true if it's less than or equal to zero, otherwise return false.

Examples
lessThanOrEqualToZero(5) ➞ false

lessThanOrEqualToZero(0) ➞ true

lessThanOrEqualToZero(-2) ➞ true
*/

const lessThanOrEqualToZero = (a) => {
    return a <= 0;
}

console.log(lessThanOrEqualToZero(5)); //Output: false
console.log(lessThanOrEqualToZero(0)); //Output: true
console.log(lessThanOrEqualToZero(-2)); //Output: true