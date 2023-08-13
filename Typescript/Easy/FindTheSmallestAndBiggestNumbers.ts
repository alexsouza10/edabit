const findMin = (numbers: number[]): number => {
    if (numbers.length === 0) {
        throw new Error("This Array is empty.");
    }

    let min = numbers[0];
    for (const num of numbers) {
        if (num < min) {
            min = num;
        };
    };
    return min;
};

const findMax = (numbers: number[]): number => {
    if (numbers.length === 0) {
        throw new Error("This Array is empty.");
    }

    let max = numbers[0];
    for (const num of numbers) {
        if (num > max) {
            max = num;
        };
    };
    return max;
};

const myArray: number[] = [50, 2, 300, 5000, -100, 22, 1720, 9, 2930];
const minValue = findMin(myArray);
const maxValue = findMax(myArray);

console.log(`The smallest number is: ${minValue}`);
console.log(`The biggest number is: ${maxValue}`);
