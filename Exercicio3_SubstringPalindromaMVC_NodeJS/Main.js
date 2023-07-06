const ModelPalindromo = require('./model/ModelPalindromo');
const ViewPalindromo = require('./view/ViewPalindromo');
const ControllerPalindromo = require('./controller/ControllerPalindromo');

const model = new ModelPalindromo();
const view = new ViewPalindromo();
const controller = new ControllerPalindromo(model, view);

controller.findLongestPalindrome();
