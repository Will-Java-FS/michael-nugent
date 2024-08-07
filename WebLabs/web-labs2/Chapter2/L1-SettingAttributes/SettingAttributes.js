let image = document.getElementById("image");
let input = document.getElementById("input");
let button = document.getElementById("button");
button.onclick = setImageSrc;

/**
 * TODO: This function will run when the button is clicked. set the src property of 'image' to the current value of
 * the input box. This works in the same way as modifying 'innerText'.
 */
function setImageSrc() {
    //    code here
    // image.src = "https://ia801201.us.archive.org/14/items/Chrysanthemum_20160913/Chrysanthemum.jpg"
    // console.log("Hello")
    const inputText = input.value;
    image.src = inputText;
}
/**
 * Did you notice that the variables at the top of the script were declared with 'let' instead of 'var'? That's
 * because JS actually has 3 ways to declare variables: var, let, const. Var doesn't have block scoping - meaning, when
 * a 'var' variable is declared within an if statement or for loop, it's actually accessible outside of its code block.
 * This was fixed in version JavaScript version ES6, when 'let' was introduced, which features block scoping. 'const'
 * is for unchangeable variables.
 *
 * We're going to be using 'let' from now on. 'var' is only relevant for very old browsers which are running old
 * versions of JavaScript.
 */