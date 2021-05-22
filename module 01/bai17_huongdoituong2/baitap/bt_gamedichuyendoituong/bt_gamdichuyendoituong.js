function Hero(image, top, left, size, speed) {
    this.image = image;
    this.top = top;
    this.left = left;
    this.size = size;
    this.speed = speed;
    this.getHeroElement = function () {
        return '<img width="' + this.size + '"' +
            ' height="' + this.size + '"' +
            ' src="' + this.image + '"' +
            ' style="top: ' + this.top + 'px; left:' + this.left + 'px; position:absolute;" />';
    };

    this.moveRight = function () {
        this.left += this.speed;
        console.log('ok: ' + this.left);
    };

    this.moveLeft = function () {
        this.left -= this.speed;
        console.log('ok: ' + this.left);

    };

    this.moveUp = function () {
        this.top -= this.speed;
        console.log('ok: ' + this.top);

    };

    this.moveDown = function () {
        this.top += this.speed;
        console.log('ok: ' + this.top);
    };

    this.startLeft = function () {
        this.moveLeft();
        document.getElementById('game').innerHTML = this.getHeroElement();
    };
    this.startRight = function () {
        this.moveRight();
        document.getElementById('game').innerHTML = this.getHeroElement();
    };
    this.startUp = function () {
        this.moveUp();
        document.getElementById('game').innerHTML = this.getHeroElement();
    };
    this.startDown = function () {
        this.moveDown();
        document.getElementById('game').innerHTML = this.getHeroElement();
    };
}

let speed = parseInt(prompt("nhập tốc độ muốn đi :"));
var hero = new Hero('ronaldo.jpg', 20, 20, 200, speed);
document.getElementById('game').innerHTML = hero.getHeroElement();

function moveSelection(evt) {
    switch (evt.keyCode) {
        case 37:
            hero.startLeft();
            break;
        case 39:
            hero.startRight();
            break;
        case 38:
            hero.startUp();
            break;
        case 40:
            hero.startDown();
            break;
    }
}

function docReady() {
    window.addEventListener('keydown', moveSelection);
}

window.onload = docReady();