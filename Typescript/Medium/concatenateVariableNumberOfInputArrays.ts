//Create a function that concatenates n input arrays, where n is variable.

const concat = <T>(...arrays: T[][]): T[] => arrays.flat();
  
  const result1 = concat([1, 2, 3], [4, 5], [6, 7]);
  console.log(result1); // [1, 2, 3, 4, 5, 6, 7]
  
  const result2 = concat([1], [2], [3], [4], [5], [6], [7]);
  console.log(result2); // [1, 2, 3, 4, 5, 6, 7]
  
  const result3 = concat([1, 2], [3, 4]);
  console.log(result3); // [1, 2, 3, 4]
  
  const result4 = concat([4, 4, 4, 4, 4]);
  console.log(result4); // [4, 4, 4, 4, 4]