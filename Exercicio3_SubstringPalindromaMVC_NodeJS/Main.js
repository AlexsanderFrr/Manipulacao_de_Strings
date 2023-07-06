const PalindromeModel = require('./model/ModelPalindromo');
const PalindromeView = require('./view/ViewPalindromo');
const PalindromeController = require('./controller/ControllerPalindromo');

const model = new ModelPalindromo();
const view = new ViewPalindromo();
const controller = new ControllerPalindromo(model, view);

controller.findLongestPalindrome();
