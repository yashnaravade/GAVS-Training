// a simple program to read user input and convert it to uppercase and lowercase

import readlineSync from "readline-sync";

// Function to ask questions
function play(question, answer) {
  let userAnswer = readlineSync.question(question);
  if (userAnswer.toUpperCase() === answer.toUpperCase()) {
    console.log("You are right!");
    score++;
  } else {
    console.log("You are wrong!");
  }
  console.log("Your score is: " + score);
  console.log("\n");
}

let userName = readlineSync.question("What's your name? ");
console.log("Hi " + userName + "!");
console.log("Welcome to the quiz!");
console.log("Let's see how well you know Yash!");
let score = 0;

console.log("\nLet's begin!");

// Array of objects with questions and answers
let questions = [
  {
    question: "Where do I live? ",
    answer: "Pune",
  },
  {
    question: "What is my favorite color? ",
    answer: "Black",
  },
  {
    question: "What is my favorite food? ",
    answer: "Chicken",
  },
  {
    question: "What is my favorite sport? ",
    answer: "Cricket",
  },
  {
    question: "What is my favorite IPL team? ",
    answer: "CSK",
  },
];

// Loop to ask questions
for (let i = 0; i < questions.length; i++) {
  play(questions[i].question, questions[i].answer);
}

// Array of high scores
let highScores = [
  {
    name: "Yash",
    score: 5,
  },
  {
    name: "Gaurav",
    score: 4,
  },
];

// Display high scores
console.log("\nCheck out the high scores:");
for (let i = 0; i < highScores.length; i++) {
  console.log(highScores[i].name + ": " + highScores[i].score);
}

console.log(
  "\nIf you have beaten the high score, send me a screenshot and I'll update it!\n"
);

console.log("Thanks for playing the quiz!\n");
