let array1: number[] = [1, 5000, 128, 25, 10, 32, 12, 5];
let array2: number[] = [22, 2, 15, 300, 1500, 78, 6, 35];

let combine = [...array1, ...array2].sort((a, b) => a - b);

console.log(combine);
