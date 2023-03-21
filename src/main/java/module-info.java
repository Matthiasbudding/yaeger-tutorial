module waterworld {
    requires hanyaeger;

    exports com.github.hanyaeger;

    opens audio;
    opens backgrounds;
    opens sprites;
    exports com.github.hanyaeger.entities;
    exports com.github.hanyaeger.tutorial.entities.button;
}
