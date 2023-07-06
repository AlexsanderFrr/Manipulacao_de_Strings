class DuplicateRemoveView {
    getInputString() {
      const readline = require('readline');
      const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
      });
  
      return new Promise((resolve, reject) => {
        rl.question('Digite uma frase: ', (inputString) => {
          rl.close();
          resolve(inputString);
        });
      });
    }
  
    displayOutputString(outputString) {
      console.log('Frase sem caracteres duplicados: ' + outputString);
    }
  }
  
  module.exports = DuplicateRemoveView;
  