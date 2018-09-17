package martak.jjdd4sprint0.task12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reader {

    private Logger LOG = LoggerFactory.getLogger(Reader.class);

    private List<String> words = new ArrayList<>();

    public void readFile() {

        try {

            FileReader fileReader = new FileReader("resources/input.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.lines().collect(Collectors.joining());
            words.addAll(Arrays.asList(line.split(",")));

        } catch (FileNotFoundException e) {
            LOG.warn("File not found");

        }
    }

    public void displayWords() {
        System.out.println(words
                .stream()
                .sorted()
                .collect(Collectors.joining("\n")));
    }

    public static void main(String[] args) {
        Reader fileReader = new Reader();
        fileReader.readFile();
        fileReader.displayWords();
    }

}
