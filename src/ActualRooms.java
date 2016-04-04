import java.util.LinkedList;
public class ActualRooms 
{
    public static final Room r1 = new Room("a1", "A room in level 1\nThe starting point in level 1", new LinkedList<Room>());
    public static final Room r2 = new Room("a2", "A room in level 1\n", new LinkedList<Room>());
    public static final Room r3 = new Room("a3", "A room in level 1\n", new LinkedList<Room>());
    public static final Room r4 = new Room("a4", "A room in level 1\n", new LinkedList<Room>());
    public static final Room r5 = new Room("a5", "A room in level 1\n", new LinkedList<Room>());
    public static final Room r6 = new Room("a6", "A room in level 1\n", new LinkedList<Room>());
    public static final Room r7 = new Room("a7", "A room in level 1\n", new LinkedList<Room>());
    public static final Room r8 = new Room("a8", "A room in level 1\n", new LinkedList<Room>());
    public static final Room r9 = new Room("a9", "A room in level 1\nThe ending point in level 1", new LinkedList<Room>());
    public static final Room r10 = new Room("b1", "A room in level 2\nThe starting point in level 2", new LinkedList<Room>());
    public static final Room r11 = new Room("b2", "A room in level 2\n", new LinkedList<Room>());
    public static final Room r12 = new Room("b3", "A room in level 2\n", new LinkedList<Room>());
    public static final Room r13 = new Room("b4", "A room in level 2\n", new LinkedList<Room>());
    public static final Room r14 = new Room("b5", "A room in level 2\n", new LinkedList<Room>());
    public static final Room r15 = new Room("b6", "A room in level 2\n", new LinkedList<Room>());
    public static final Room r16 = new Room("b7", "A room in level 2\n", new LinkedList<Room>());
    public static final Room r17 = new Room("b8", "A room in level 2\n", new LinkedList<Room>());
    public static final Room r18 = new Room("b9", "A room in level 2\n", new LinkedList<Room>());
    public static final Room r19 = new Room("b10", "A room in level 2\n", new LinkedList<Room>());
    public static final Room r20 = new Room("b11", "A room in level 2\n", new LinkedList<Room>());
    public static final Room r21 = new Room("b12", "A room in level 2\n", new LinkedList<Room>());
    public static final Room r22 = new Room("b13", "A room in level 2\n", new LinkedList<Room>());
    public static final Room r23 = new Room("b14", "A room in level 2\n", new LinkedList<Room>());
    public static final Room r24 = new Room("b15", "A room in level 2\n", new LinkedList<Room>());
    public static final Room r25 = new Room("b16", "A room in level 2\nThe ending point in level 2", new LinkedList<Room>());
    public static final Room r26 = new Room("c1", "A room in level 3\nThe starting point in level 3", new LinkedList<Room>());
    public static final Room r27 = new Room("c2", "A room in level 3\n", new LinkedList<Room>());
    public static final Room r28 = new Room("c3", "A room in level 3\n", new LinkedList<Room>());
    public static final Room r29 = new Room("c4", "A room in level 3\n", new LinkedList<Room>());
    public static final Room r30 = new Room("c5", "A room in level 3\n", new LinkedList<Room>());
    public static final Room r31 = new Room("c6", "A room in level 3\n", new LinkedList<Room>());
    public static final Room r32 = new Room("c7", "A room in level 3\n", new LinkedList<Room>());
    public static final Room r33 = new Room("c8", "A room in level 3\n", new LinkedList<Room>());
    public static final Room r34 = new Room("c9", "A room in level 3\n", new LinkedList<Room>());
    public static final Room r35 = new Room("c10", "A room in level 3\n", new LinkedList<Room>());
    public static final Room r36 = new Room("c11", "A room in level 3\n", new LinkedList<Room>());
    public static final Room r37 = new Room("c12", "A room in level 3\n", new LinkedList<Room>());
    public static final Room r38 = new Room("c13", "A room in level 3\n", new LinkedList<Room>());
    public static final Room r39 = new Room("c14", "A room in level 3\n", new LinkedList<Room>());
    public static final Room r40 = new Room("c15", "A room in level 3\n", new LinkedList<Room>());
    public static final Room r41 = new Room("c16", "A room in level 3\n", new LinkedList<Room>());
    public static final Room r42 = new Room("c17", "A room in level 3\n", new LinkedList<Room>());
    public static final Room r43 = new Room("c18", "A room in level 3\n", new LinkedList<Room>());
    public static final Room r44 = new Room("c19", "A room in level 3\n", new LinkedList<Room>());
    public static final Room r45 = new Room("c20", "A room in level 3\n", new LinkedList<Room>());
    public static final Room r46 = new Room("c21", "A room in level 3\n", new LinkedList<Room>());
    public static final Room r47 = new Room("c22", "A room in level 3\n", new LinkedList<Room>());
    public static final Room r48 = new Room("c23", "A room in level 3\n", new LinkedList<Room>());
    public static final Room r49 = new Room("c24", "A room in level 3\n", new LinkedList<Room>());
    public static final Room r50 = new Room("c25", "A room in level 3\nThe ending point in level 3", new LinkedList<Room>());
    
    public void setLinkLevel1()
    {
        r1.getAdjRooms().add(r2);
        r1.getAdjRooms().add(r4);
        r2.getAdjRooms().add(r1);
        r2.getAdjRooms().add(r3);
        r2.getAdjRooms().add(r5);
        r3.getAdjRooms().add(r2);
        r3.getAdjRooms().add(r6);
        r4.getAdjRooms().add(r1);
        r4.getAdjRooms().add(r5);
        r4.getAdjRooms().add(r7);
        r5.getAdjRooms().add(r2);
        r5.getAdjRooms().add(r4);
        r5.getAdjRooms().add(r6);
        r5.getAdjRooms().add(r8);
        r6.getAdjRooms().add(r3);
        r6.getAdjRooms().add(r5);
        r6.getAdjRooms().add(r9);
        r7.getAdjRooms().add(r4);
        r7.getAdjRooms().add(r8);
        r8.getAdjRooms().add(r5);
        r8.getAdjRooms().add(r7);
        r8.getAdjRooms().add(r9);
        r9.getAdjRooms().add(r6);
        r9.getAdjRooms().add(r8);
    }
    public void setLinkLevel2()
    {
        
    }
    public void setLinkLevel3()
    {
        
    }
}
