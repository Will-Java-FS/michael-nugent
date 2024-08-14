
export function classDecorator(constructor: Function){
    console.log("This class decorator was called from: ", constructor.name);
}