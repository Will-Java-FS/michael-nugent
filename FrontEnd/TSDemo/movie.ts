class Movie {

    id: number;
    title: string;
    price: number;
    isAvailable: boolean;
    returnDate: Date = new Date();

    constructor(id: number, title: string, price: number, isAvailable: boolean) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    checkout(days: number): void {
        this.isAvailable = false;
        this.returnDate = new Date;
        this.returnDate.setDate(this.returnDate.getDate() + days);
    }
}

let movie1 = new Movie(1, 'The Avengers', 19.95, true);

console.log(movie1);
movie1.checkout(3);
console.log(movie1);