/*
Find the Perimeter of a Rectangle
Create a function that takes length and width and finds the perimeter of a rectangle.

Examples
findPerimeter(6, 7) ➞ 26

findPerimeter(20, 10) ➞ 60

findPerimeter(2, 9) ➞ 22
*/

const findPerimeter = (length, width) => {
    return 2 * (length + width)
}

console.log(findPerimeter(6, 7))  //Output: 26

console.log(findPerimeter(20, 10)) //Output: 60

console.log(findPerimeter(2, 9)) //Output: 22