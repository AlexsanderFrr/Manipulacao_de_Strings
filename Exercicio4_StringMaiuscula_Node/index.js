const readlineSync = require('readline-sync');

const capitalizeSentences = (inputString) => {
  const sentences = inputString.split('. ');
  const capitalizedSentences = sentences.map((sentence) => {
    const firstLetter = sentence.charAt(0).toUpperCase();
    const restOfSentence = sentence.slice(1);
    return `${firstLetter}${restOfSentence}`;
  });
  return capitalizedSentences.join('. ');
};

const inputString = readlineSync.question('Digite uma frase: ');
const outputString = capitalizeSentences(inputString);
console.log(outputString);
