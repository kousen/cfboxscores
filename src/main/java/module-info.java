module com.oreilly.cfboxscores {
    requires gson;
    requires jsoup;
    requires okhttp;
    exports com.oreilly;
    exports com.oreilly.json;
    opens com.oreilly.json;
}