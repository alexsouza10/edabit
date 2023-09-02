class Circle {
    private radius: number;

    constructor(radius: number) {
        this.radius = radius;
    }

    getArea(): number {
        return Math.PI * Math.pow(this.radius, 2);
    }

    getPerimeter(): number {
        return 2 * Math.PI * this.radius;
    }
}

const circle1 = new Circle(11);
console.log(circle1.getArea());

const circle2 = new Circle(4.44);
console.log(circle2.getPerimeter());