const convert = (x: number, y: number): number => x * y;

const min: number = 5;
const sec: number = 60;

const resul: number = convert (min, sec);
console.log(`After conversion ${min} minutes are equivalent to ${resul} seconds`);