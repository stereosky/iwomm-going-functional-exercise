import java.util.ArrayList;
import java.util.List;

public class MemberService {

    private static List<Member> allMembers = new ArrayList<>();

    public static void populateMembers() {
        // TODO Special function that fetches IWOMM members from a third-party
    }

    public static List<Member> fetchAllMembers() {
        return allMembers;
    }

    public static List<String> getAttendingMemberNames() {
        List<String> list = new ArrayList<>();
        for (Member member : MemberService.fetchAllMembers()) {
            if (member.getAttendingEvent()) {
                list.add(member.getName());
            }
        }
        return list;
    }

    public static List<String> getAttendingMemberFavouriteProgrammingLanguage() {
        List<String> list = new ArrayList<>();
        for (Member member : MemberService.fetchAllMembers()) {
            if (member.getAttendingEvent()) {
                list.add(member.getFavouriteProgrammingLanguage());
            }
        }
        return list;
    }

    public static List<String> getAttendingMemberFavouriteBeverage() {
        List<String> list = new ArrayList<>();
        for (Member member : MemberService.fetchAllMembers()) {
            if (member.getAttendingEvent()) {
                list.add(member.getFavouriteBeverage());
            }
        }
        return list;
    }

    public static List<String> getAttendingMemberFavouriteTaco() {
        List<String> list = new ArrayList<>();
        for (Member member : MemberService.fetchAllMembers()) {
            if (member.getAttendingEvent()) {
                list.add(member.getFavouriteTaco());
            }
        }
        return list;
    }
}
