class ControllerPalindromo {
    constructor(model, view) {
      this.model = model;
      this.view = view;
    }
    
    async findLongestPalindrome() {
      const inputString = await this.view.getInputString();
      const outputString = this.model.findLongestPalindrome(inputString);
      this.view.displayOutputString(outputString);
    }
  }
  
  module.exports = ControllerPalindromo;
  