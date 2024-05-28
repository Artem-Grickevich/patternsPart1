package prototype;


public class Cookbook extends Book {
    public int difficultyLevel;


    public Cookbook(Cookbook cookbook) {
        super(cookbook);
        if(cookbook != null) {
            this.difficultyLevel = cookbook.difficultyLevel;
        }
    }

    @Override
    public Book clone() {
        return new Cookbook(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cookbook cookbook = (Cookbook) o;
        return difficultyLevel == cookbook.difficultyLevel;
    }
}
