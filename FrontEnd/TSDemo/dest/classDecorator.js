"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.classDecorator = classDecorator;
function classDecorator(constructor) {
    console.log("This class decorator was called from: ", constructor.name);
}
