let math = 80;
let science = 75;
let english = 85;
let total = math + science + english;
let average = total / 3;
let grade;
if (average >= 90) {
    grade = "A";
} else if (average >= 75) {
    grade = "B";
} else if (average >= 60) {
    grade = "C";
} else if (average >= 50) {
    grade = "D";
} else {
    grade = "F";
}
console.log("Total Marks: " + total);
console.log("Average: " + average);
console.log("Grade: " + grade);