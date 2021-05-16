package services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import exceptions.CouldNotWriteAnnouncementException;
import model.Announcement;
import org.apache.commons.io.FileUtils;
import exceptions.CouldNotWriteUsersException;
import exceptions.UsernameAlreadyExistsException;
import model.User;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Objects;

public class BuyedService {

    public static List<Announcement> announcements;
    private static final Path ANNOUNCEMENTS_PATH = FileSystemService.getPathToFile("config", "buyed.json");

    public static void loadAnnouncementsFromFile() throws IOException {

        if (!Files.exists(ANNOUNCEMENTS_PATH)) {
            FileUtils.copyURLToFile(services.BuyedService.class.getClassLoader().getResource("buyed.json"), ANNOUNCEMENTS_PATH.toFile());
        }

        ObjectMapper objectMapper = new ObjectMapper();

        announcements = objectMapper.readValue(ANNOUNCEMENTS_PATH.toFile(), new TypeReference<List<Announcement>>() {
        });

    }

    public static void addAnnouncement(String u,String b, String c, String e,String m,String hp, String yf,String w)  {

        announcements.add(new Announcement(u,b, c, e,m,hp,yf,w,hp,hp));
        persistAnnouncement();
    }

    private static void persistAnnouncement() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(ANNOUNCEMENTS_PATH.toFile(), announcements);
        } catch (IOException e) {
            throw new CouldNotWriteAnnouncementException();
        }
    }
}


