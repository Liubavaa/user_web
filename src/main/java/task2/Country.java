package task2;

public enum Country {
    Ukraine, USA, Poland;
    public String toString(){
        return switch (this) {
            case Ukraine -> "Ukraine";
            case USA -> "USA";
            case Poland -> "Poland";
        };
    }
}
