package coffeemachine;


import coffeemachine.formatter.CoffeeSpecFirstPageRenderer;
import coffeemachine.formatter.Confidentiality;
import cucumber.api.junit.Cucumber;
import cucumber.contrib.formatter.pdf.PdfFormatter;
import org.junit.runner.RunWith;

import java.io.File;
import java.io.FileNotFoundException;

import static coffeemachine.formatter.CoffeeSpecStyles.*;

@RunWith(Cucumber.class)
@Cucumber.Options(
        format = {"coffeemachine.FeatureTest$ConfiguredFormatter:target/coffeemachine"}
)
public class FeatureTest {

    public static class ConfiguredFormatter extends PdfFormatter {
        public ConfiguredFormatter(File reportDir) throws FileNotFoundException {
            super(reportDir, defaultConfiguration()
                    .withPrimaryColor(PRIMARY_COLOR)
                    .withStepDataTableHeaderFont(STEP_DATA_TABLE_HEADER_FONT)
                    .withStepDataTableHeaderBackground(STEP_DATA_TABLE_HEADER_BACKGROUND)
                    .withStepDataTableContentFont(STEP_DATA_TABLE_CONTENT_FONT)
                    .withMainTitleFont(MAIN_TITLE_FONT)
                    .withSubTitleFont(SUB_TITLE_FONT)
                    .withDefaultFont(DEFAULT_FONT)
                    .withChapterTitleFont(CHAPTER_TITLE_FONT)
                    .withSectionTitleFont(SECTION_TITLE_FONT)
                    .withTableHeaderFont(TABLE_HEADER_FONT)
                    .withTableContentFont(TABLE_CONTENT_FONT)
                    .withFirstPageContentProvider(new CoffeeSpecFirstPageRenderer(Confidentiality.C2))
                    .withPageHeader(pageHeaderC2())
                    .withPageFooterTemplateText("Coffee Machine - Specification")
                    .withPageFooterFont(DEFAULT_FONT)
                    .withMetaInformationsResources(FeatureTest.class, "00-meta.properties")
                            // override some of the previous meta infomations
                    .withTitle("COFFEE MACHINE\n" +
                            "FUNCTIONAL SPECIFICATIONS \n" +
                            "INTERNATIONAL ANALYSIS AND REQUIREMENTS")
                    .withSubject("COFFEE MACHINE 2014 International Alignment")
                    .withPreambuleResource(FeatureTest.class, "00-preambule.md"));
        }
    }
}
