
function isLeapYear(year: number): boolean {

    //Guard: not evenly divisible by 4
    if (year % 4 !== 0) return false;

    //Guard: evenly divisible by 100, but not also by 400
    if (year % 100 === 0 && year % 400 !== 0) return false;

    return true;
}


let testYears: number[] = [1997, 1900, 2000, 1996, 1886, 2024, 0];

testYears.forEach(year =>
    console.log(year, isLeapYear(year))
);