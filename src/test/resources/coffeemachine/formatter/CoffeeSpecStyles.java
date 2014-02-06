package coffeemachine.formatter;

import com.itextpdf.text.*;

/**
 *
 */
public class CoffeeSpecStyles {
    public static final BaseColor PRIMARY_COLOR = new BaseColor(170, 135, 120);

    public static final Font DEFAULT_FONT = FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK);
    public static final Font MAIN_TITLE_FONT = FontFactory.getFont("Arial", 16, Font.NORMAL, PRIMARY_COLOR);
    public static final Font CHAPTER_TITLE_FONT = FontFactory.getFont("Arial", 13, Font.BOLD, PRIMARY_COLOR);
    public static final Font SECTION_TITLE_FONT = FontFactory.getFont("Arial", 12, Font.NORMAL, PRIMARY_COLOR);
    public static final Font SUB_TITLE_FONT = FontFactory.getFont("Arial", 20, Font.NORMAL, BaseColor.BLACK);
    public static final Font TABLE_HEADER_FONT = FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK);
    public static final Font TABLE_CONTENT_FONT = FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK);
    public static final Font STEP_DATA_TABLE_HEADER_FONT = FontFactory.getFont(FontFactory.COURIER, 9, Font.BOLD, BaseColor.BLACK);
    public static final Font STEP_DATA_TABLE_CONTENT_FONT = FontFactory.getFont(FontFactory.COURIER, 9, Font.NORMAL, BaseColor.BLACK);
    public static final BaseColor STEP_DATA_TABLE_HEADER_BACKGROUND = new BaseColor(249,225,219);

    public static Phrase pageHeaderC2() {
        Phrase phrase = new Phrase();
        phrase.add(new Chunk("C2", DEFAULT_FONT));
        phrase.add(new Chunk(" | ", FontFactory.getFont("Arial", 9, Font.BOLD, PRIMARY_COLOR)));
        phrase.add(new Chunk("CONFIDENTIAL", DEFAULT_FONT));
        return phrase;
    }
}
