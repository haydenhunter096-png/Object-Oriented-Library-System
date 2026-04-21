import java.util.HashMap;

public class Library {
    private HashMap<String, LibraryItem> items = new HashMap<>();
    private HashMap<String, Member> members = new HashMap<>();

    public void addItem(LibraryItem item) {
        items.put(item.getId(), item);
    }

    public void addMember(Member member) {
        members.put(member.id, member);
    }

    public void checkout(String itemId, String memberId) {
        LibraryItem item = items.get(itemId);
        Member member = members.get(memberId);

        if (item == null || member == null) return;
        if (!item.isAvailable() || !member.canBorrow()) return;

        item.setAvailable(false);
        member.addLoan();
    }

    public void returnItem(String itemId, String memberId) {
        LibraryItem item = items.get(itemId);
        Member member = members.get(memberId);

        if (item == null || member == null) return;

        item.setAvailable(true);
        member.removeLoan();
    }
}