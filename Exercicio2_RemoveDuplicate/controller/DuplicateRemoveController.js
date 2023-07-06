class DuplicateRemoveController {
    constructor(model, view) {
      this.model = model;
      this.view = view;
    }
  
    async removeDuplicateCharacters() {
      const inputString = await this.view.getInputString();
      const outputString = this.model.removeDuplicateCharacters(inputString);
      this.view.displayOutputString(outputString);
    }
  }
  
  module.exports = DuplicateRemoveController;
  