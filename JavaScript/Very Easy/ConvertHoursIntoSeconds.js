const howManySeconds = (num, conv, numConv) => {
    conv = 60 
    numConv = 60
    return num * conv * numConv
}

console.log(howManySeconds(2)) //Output: 7200