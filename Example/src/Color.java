public enum Color {

    RED("Красный"){
        @Override
        public void printDescription() {
            System.out.println("!!!" +getDescription());
        }
    },
    BLUE("Синий"){
        @Override
        public void printDescription() {
            System.out.println(getDescription());
        }
    },
    YELLOW("Желтый"){
        @Override
        public void printDescription() {
            System.out.println(getDescription());
        }
    },
    GREEN("Зеленый"){
        @Override
        public void printDescription() {
            System.out.println(getDescription());
        }
    };

    private  final String description;

    Color(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract void printDescription();
}
