type abilities = {
    strength: number,
    dexterity: number,
    constitution: number,
    intelligence: number,
    wisdom: number,
    charisma: number,
}

class Character {

    abilities: abilities = {
        strength: 0,
        dexterity: 0,
        constitution: 0,
        intelligence: 0,
        wisdom: 0,
        charisma: 0
    }

    hitpoints: number = 0;

    constructor() {

        for (const key in this.abilities) {
            if (key in this.abilities) {
                this.abilities[key as keyof abilities] = this.generateStat();
            }
        }

        this.hitpoints = 10 + this.constitutionModifier();
    }

    constitutionModifier(): number {
        let modifier = this.abilities.constitution - 10;
        modifier /= 2;
        return Math.floor(modifier);
    }

    generateStat = () => {
        //four die rolls
        const rolls: number[] = [...Array(4)].map(() => this.diceRoll(6));

        //Sort dice, remove lowest, return sum
        return rolls.sort((a, b) => a - b)
            .splice(0, 1) //remove 1 element at index 0 (lowest value)
            .reduce((accumulator, currentValue) => accumulator + currentValue, 0)
    }

    diceRoll = (sides: number): number => {
        return Math.floor(Math.random() * sides) + 1;
    }
    toString(): string {
        const properties: { [key: string]: any } = {};

        // Get all properties that are not functions (i.e., exclude methods)
        for (const key of Object.keys(this)) {
            const value = (this as any)[key];
            if (typeof value !== 'function') {
                properties[key] = value;
            }
        }

        return `Character ${JSON.stringify(properties, null, 2)}`;
    }
}


const myDDChar = new Character();
console.log(myDDChar);