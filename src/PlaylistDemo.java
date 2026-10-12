/**
 * PlaylistDemo.java
 * Driver program to test the Track class.
 *
 * Name:        BORA AVCU
 * Student ID:  250444902
 * Date:        11.10.2026
 */

public class PlaylistDemo {

    public static void main(String[] args) {

        System.out.println("=== Playlist Track Demo ===\n");

        // Default Constructorlar
        System.out.println("Default Track:");
        Track defaultTrack = new Track();
        System.out.println(defaultTrack.toString() + "\n");

        // Sadece Title Constructor
        System.out.println("Title-only track:");
        Track titleTrack = new Track("Neon Lights");
        System.out.println(titleTrack.toString() + "\n");

        // Title ve artist constructoru
        System.out.println("Title + Artist Track:");
        Track titleArtistTrack = new Track("Ocean Drive", "Midnight Pulse");
        System.out.println(titleArtistTrack.toString() + "\n");

        // Full constructor
        System.out.println("Full Track (non-explicit):");
        Track fullTrack = new Track("Raindrop Waltz", "Clara Voss", 210, false);
        System.out.println(fullTrack.toString() + "\n");

        // Invalid duration Testi
        System.out.println("Invalid Duration Test:");
        Track invalidTrack = new Track("Broken Clock", "Static Noise", -15, false);
        System.out.println(invalidTrack.toString() + "\n");

        // Getter Testi
        System.out.println("Getter Test:");
        Track getterTrack = new Track("Stardust", "Stellar Echo", 242, true);
        System.out.println("Title:    " + getterTrack.getTitle());
        System.out.println("Artist:   " + getterTrack.getArtist());
        System.out.println("Duration: " + getterTrack.getDurationFormatted());
        System.out.println("Explicit: " + getterTrack.isExplicit());
    }
}