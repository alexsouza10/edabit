const incrementNumber = (input: number): number => {
    const result = input + 1;
    return result;
}

const originalNumber: number = 5;
const incrementedNumber: number = incrementNumber(originalNumber);

console.log(`Original number ${originalNumber}`);
console.log(`Incremented number ${incrementedNumber}`);