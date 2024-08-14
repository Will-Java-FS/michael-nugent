"use strict";
class Movie {
    constructor(id, title, price, isAvailable) {
        this.returnDate = new Date();
        this.id = id;
        this.title = title;
        this.price = price;
        this.isAvailable = isAvailable;
    }
    checkout(days) {
        this.isAvailable = false;
        this.returnDate = new Date;
        this.returnDate.setDate(this.returnDate.getDate() + days);
    }
}
let movie1 = new Movie(1, 'The Avengers', 19.95, true);
console.log(movie1);
movie1.checkout(3);
console.log(movie1);
