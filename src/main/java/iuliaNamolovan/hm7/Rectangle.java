package main.java.iuliaNamolovan.hm7;

class Rectangle extends Shape {
    double Width;
    double Height;

    Rectangle(String c, String FS, double w, double h) {
        super(c, FS);
        this.Width = w;
        this.Height = h;
    }

    public String toString() {
        return "Rectangle{" +
                "Color='" + color + '\'' +
                ", FS=" + FillingdStatus +
                ", Widht=" + Width +
                ", Height=" + Height +
                '}';
    }
}
