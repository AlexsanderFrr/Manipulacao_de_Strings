const DuplicateRemoveModel = require('./model/DuplicateRemoveModel');
const DuplicateRemoveView = require('./view/DuplicateRemoveView');
const DuplicateRemoveController = require('./controller/DuplicateRemoveController');

const model = new DuplicateRemoveModel();
const view = new DuplicateRemoveView();
const controller = new DuplicateRemoveController(model, view);

controller.removeDuplicateCharacters();
