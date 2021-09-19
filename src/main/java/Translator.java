import com.google.cloud.translate.Translate;
import com.google.cloud.translate.Translate.TranslateOption;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;

public class Translator {
    public static void main(String[] args) {
        Translate translate = TranslateOptions.getDefaultInstance().getService(); //1

        String textToTranslate = "Esto es un ejemplo para traducir";

        Translation translation = translate.translate(textToTranslate,
                TranslateOption.sourceLanguage("es"), //2
                TranslateOption.targetLanguage("en"));
        String translatedText = translation.getTranslatedText();

        System.out.println(translatedText);
    }
}