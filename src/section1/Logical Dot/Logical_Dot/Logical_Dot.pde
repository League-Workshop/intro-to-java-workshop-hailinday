

void setup() {
  
  size(600,600);
  
}

void draw() {
 /*
  fill(#ff0000);
  */
  ellipse(300,300,150,150);
  if (mousePressed) {
    fill(#00ff00);
  } else {
    fill(#0000ff);
  
  }
}
