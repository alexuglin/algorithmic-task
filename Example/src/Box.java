public class Box {

    private int width;
    private int height;
    private int depth;

    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Box)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Box box = (Box) obj;
        return this.width == box.width && this.height == box.height && this.depth == box.depth;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + Integer.hashCode(this.width);
        result = 37 * result + Integer.hashCode(this.height);
        return 37 * result + Integer.hashCode(this.depth);
    }

}
