PImage mustache;
PImage friend;
PImage hat;
void setup() {
friend = loadImage("don.jpg");
size(800, 600);
friend.resize(width,height);
mustache = loadImage("mustache.png");
mustache.resize(150,150);
hat = loadImage("hat.png");
}

void draw() {
background(friend);
//image(mustache, 385, 250);
if (mousePressed) {
image(mustache, mouseX, mouseY);
if (mouseButton == RIGHT) {
image(hat, 375, 100);
}
}
}
