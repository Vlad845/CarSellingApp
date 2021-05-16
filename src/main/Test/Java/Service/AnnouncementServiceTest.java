package Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.internal.org.objectweb.asm.TypeReference;
import model.Announcement;
import org.junit.jupiter.api.Test;
import services.AnnouncementService;
import services.UserService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnnouncementServiceTest {

    @Test
    public void testLoadUsersFromFile() throws Exception {
        AnnouncementService.loadAnnouncementsFromFile();
        assertNotNull(AnnouncementService.announcements);
        assertEquals(14, AnnouncementService.announcements.size());
    }
    @Test
    public void addAnnouncement() throws Exception {
        AnnouncementService.loadAnnouncementsFromFile();
        AnnouncementService.addAnnouncement("test", "testPass", "432","432","432","432","432","432","432","432");
        assertNotNull(AnnouncementService.announcements);
        assertEquals(14, AnnouncementService.announcements.size());
    }
//    @Test
//    public void testAddOneUserIsPersisted() throws Exception {
//        AnnouncementService.loadAnnouncementsFromFile();
//        AnnouncementService.addAnnouncement("test", "testPass", "432","432","432","432","432","432","432","432");
//        List<Announcement> announcements = new ObjectMapper().readValue(AnnouncementService. ANNOUNCEMENTS_PATH.toFile(), new TypeReference<List<Announcement>>() {
//        });
//        assertNotNull(announcements);
//        assertEquals(1,announcements.size());
//    }
}