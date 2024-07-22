package DenisGrimaliuc.task1707;


class Main {

    int x = 5;
    int y = 5;

    Main(int x1, int y1) {
        x = x1;
        y = y1;
    }

    public int sum() {
        return x + y;
    }

    public int max() {
        return Math.max(x, y);
    }

    public int min() {
        return Math.min(x, y);
    }

}

