class DuplicateRemoveModel {
    removeDuplicateCharacters(inputString) {
      const uniqueCharacters = [...new Set(inputString)];
      return uniqueCharacters.join('');
    }
  }
  
  module.exports = DuplicateRemoveModel;
  