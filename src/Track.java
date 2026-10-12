/**
 * Track.java
 * Represents a single music track in a streaming playlist.
 *
 * Name:        BORA AVCU
 * Student ID:  250444902
 * Date:        11.10.2026
 */
public class Track {

    private String title;
    private String artist;
    private int    durationSeconds;
    private boolean isExplicit;

    // Full Constructor
    public Track(String title, String artist, int durationSeconds, boolean isExplicit) {
        this.title = title;
        this.artist = artist;

        if (durationSeconds < 0) {
            System.out.println("Warning: Invalid duration. Setting to 0.");
            this.durationSeconds = 0;
        } else {
            this.durationSeconds = durationSeconds;
        }

        this.isExplicit = isExplicit;
    }

    // Title ve Artist Constructor.
    public Track(String title, String artist) {
        this(title, artist, 0, false);
    }

    // Sadece Title Constructor.
    public Track(String title) {
        this(title, "Unknown Artist", 0, false);
    }

    // Default Constructor.
    public Track() {
        this("Unknown Title", "Unknown Artist", 0, false);
    }

    // Gettersler.
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public boolean isExplicit() {
        return isExplicit;
    }

    // Girilen Zamanı Dakika ve Saniyeye Çevirme.
    public String getDurationFormatted() {
        int minutes = durationSeconds / 60;
        int seconds = durationSeconds % 60;
        return String.format("%d:%02d", minutes, seconds);
    }

    @Override
    public String toString() {
        String baseInfo = String.format("\"%s\" by %s [%s]", title, artist, getDurationFormatted());
        if (isExplicit) {
            return baseInfo + " [EXPLICIT]";
        }
        return baseInfo;
    }
}