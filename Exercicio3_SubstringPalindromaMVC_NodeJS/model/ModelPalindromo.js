class ModelPalindromo {
    findLongestPalindrome(inputString) {
      let longestPalindrome = '';
      let maxLength = 0;
      
      // Verifica todas as substrings possíveis
      for (let i = 0; i < inputString.length; i++) {
        for (let j = i + 1; j <= inputString.length; j++) {
          let substring = inputString.substring(i, j);
          
          // Verifica se a substring é um palíndromo e se seu comprimento é maior que o maior encontrado até o momento
          if (this.isPalindrome(substring) && substring.length > maxLength) {
            longestPalindrome = substring;
            maxLength = substring.length;
          }
        }
      }
      
      return longestPalindrome ? longestPalindrome : 'Não há palíndromos na frase fornecida';
    }
    
    isPalindrome(str) {
      const reversedStr = str.split('').reverse().join('');
      return str === reversedStr;
    }
  }
  
  module.exports = ModelPalindromo;
  