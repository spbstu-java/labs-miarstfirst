package Dictionary;

import Errors.FileReadException;
import Errors.InvalidFileFormatException;
import FileExtended.FileExtended;

import java.util.Map;

public class Dictionary {

    private Map<String, String> dictionaryFileContent;

    public Dictionary(String path) {
        uploadFile(path);
    }

    /**
     * читаем и сохраняем данные из файла
     */
    private void uploadFile(String path){
        try {
            FileExtended file = new FileExtended(path, ".txt");
            dictionaryFileContent = file.getFileContent();
        } catch (FileReadException | InvalidFileFormatException e){
            System.out.println("ОШИБКА!!! " + e.getMessage());
            System.exit(1);
        }
    }

    /**
     * на основе сохраненных данных и полученной строки
     * из консоли формируем и возвращаем новую строку
     */
    public String translate(String systemInput) {
        String result = systemInput;
        String systemInputLower = systemInput.toLowerCase();

        for (Map.Entry<String, String> entry : dictionaryFileContent.entrySet()) {
            String key = entry.getKey().trim().toLowerCase();
            String value = entry.getValue().trim();

            int index = systemInputLower.indexOf(key);
            if (index >= 0) {

                String before = result.substring(0, index);
                String after = result.substring(index + key.length());
                result = before + value + after;

                systemInputLower = result.toLowerCase();

            }
        }

        return result;
    }
}



// CUte dog Look to tHe wiNdow, dog look forwArd