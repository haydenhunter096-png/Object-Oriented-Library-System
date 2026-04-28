// import HashMap class for managing 
import java.util.HashMap;
// This class represents the library system, 
// managing library items and members
public class Library {
    private final HashMap<String, LibraryItem> items = new HashMap<>();
    private final HashMap<String, Member> members = new HashMap<>();
    
    public void addItem(LibraryItem item) {
        items.put(item.getId(), item);
    } // end addItem

    public void addMember(Member member) {
        members.put(member.getId(), member);
    } // end addMember

    public void removeItem(String itemId) {
        LibraryItem removed = items.remove(itemId);

        if (removed != null) {
            System.out.println("Removed item: " + removed.getTitle());
        } else {
            System.out.println("Item not found.");
        } // end if-else
    } // end removeItem

    public void checkout(String itemId, String memberId) {
        LibraryItem item = items.get(itemId);
        Member member = members.get(memberId);

        if (item == null || member == null) return;
        if (!item.isAvailable() || !member.canBorrow()) return;

        item.setAvailable(false);
        member.addLoan();
    } // end checkout

    public void returnItem(String itemId, String memberId) {
        LibraryItem item = items.get(itemId);
        Member member = members.get(memberId);

        if (item == null || member == null) return;

        item.setAvailable(true);
        member.removeLoan();
    } // end returnItem

    public void printInventory() {
        System.out.println("Library inventory:");
        items.values().forEach(item ->
            System.out.printf(" - %s: %s [%s]%n",
                item.getId(),
                item.getTitle(),
                item.isAvailable() ? "Available" : "Checked out")
        );
    } // end printInventory
} // class end