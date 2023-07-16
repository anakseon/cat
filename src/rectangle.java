
public class rectangle {
    private int width;
    private int height;

    public rectangle() {
        super();
        this.height = 10;
        this.width = 25;
    }

    public rectangle(int w, int h) {
        super();
        this.width = w;
        this.height = h;

    }

    public int getArea() {
        return width * height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
public static void calculateArea;{
        int i1 = width * height;
        return i1;
    }
    public static void calculatePerimeter;{
        int j = 2 * (width + height);
        return j;
    }
    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
