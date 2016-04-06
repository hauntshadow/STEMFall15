import java.util.LinkedList;
public class ActualRooms 
{
    public static final Room r1 = new Room("a1", "A room in level 1\nThe starting point in level 1", new Room[4]);
    public static final Room r2 = new Room("a2", "A room in level 1\n", new Room[4]);
    public static final Room r3 = new Room("a3", "A room in level 1\n", new Room[4]);
    public static final Room r4 = new Room("a4", "A room in level 1\n", new Room[4]);
    public static final Room r5 = new Room("a5", "A room in level 1\n", new Room[4]);
    public static final Room r6 = new Room("a6", "A room in level 1\n", new Room[4]);
    public static final Room r7 = new Room("a7", "A room in level 1\n", new Room[4]);
    public static final Room r8 = new Room("a8", "A room in level 1\n", new Room[4]);
    public static final Room r9 = new Room("a9", "A room in level 1\nThe ending point in level 1", new Room[4]);
    public static final Room r10 = new Room("b1", "A room in level 2\nThe starting point in level 2", new Room[4]);
    public static final Room r11 = new Room("b2", "A room in level 2\n", new Room[4]);
    public static final Room r12 = new Room("b3", "A room in level 2\n", new Room[4]);
    public static final Room r13 = new Room("b4", "A room in level 2\n", new Room[4]);
    public static final Room r14 = new Room("b5", "A room in level 2\n", new Room[4]);
    public static final Room r15 = new Room("b6", "A room in level 2\n", new Room[4]);
    public static final Room r16 = new Room("b7", "A room in level 2\n", new Room[4]);
    public static final Room r17 = new Room("b8", "A room in level 2\n", new Room[4]);
    public static final Room r18 = new Room("b9", "A room in level 2\n", new Room[4]);
    public static final Room r19 = new Room("b10", "A room in level 2\n", new Room[4]);
    public static final Room r20 = new Room("b11", "A room in level 2\n", new Room[4]);
    public static final Room r21 = new Room("b12", "A room in level 2\n", new Room[4]);
    public static final Room r22 = new Room("b13", "A room in level 2\n", new Room[4]);
    public static final Room r23 = new Room("b14", "A room in level 2\n", new Room[4]);
    public static final Room r24 = new Room("b15", "A room in level 2\n", new Room[4]);
    public static final Room r25 = new Room("b16", "A room in level 2\nThe ending point in level 2", new Room[4]);
    public static final Room r26 = new Room("c1", "A room in level 3\nThe starting point in level 3", new Room[4]);
    public static final Room r27 = new Room("c2", "A room in level 3\n", new Room[4]);
    public static final Room r28 = new Room("c3", "A room in level 3\n", new Room[4]);
    public static final Room r29 = new Room("c4", "A room in level 3\n", new Room[4]);
    public static final Room r30 = new Room("c5", "A room in level 3\n", new Room[4]);
    public static final Room r31 = new Room("c6", "A room in level 3\n", new Room[4]);
    public static final Room r32 = new Room("c7", "A room in level 3\n", new Room[4]);
    public static final Room r33 = new Room("c8", "A room in level 3\n", new Room[4]);
    public static final Room r34 = new Room("c9", "A room in level 3\n", new Room[4]);
    public static final Room r35 = new Room("c10", "A room in level 3\n", new Room[4]);
    public static final Room r36 = new Room("c11", "A room in level 3\n", new Room[4]);
    public static final Room r37 = new Room("c12", "A room in level 3\n", new Room[4]);
    public static final Room r38 = new Room("c13", "A room in level 3\n", new Room[4]);
    public static final Room r39 = new Room("c14", "A room in level 3\n", new Room[4]);
    public static final Room r40 = new Room("c15", "A room in level 3\n", new Room[4]);
    public static final Room r41 = new Room("c16", "A room in level 3\n", new Room[4]);
    public static final Room r42 = new Room("c17", "A room in level 3\n", new Room[4]);
    public static final Room r43 = new Room("c18", "A room in level 3\n", new Room[4]);
    public static final Room r44 = new Room("c19", "A room in level 3\n", new Room[4]);
    public static final Room r45 = new Room("c20", "A room in level 3\n", new Room[4]);
    public static final Room r46 = new Room("c21", "A room in level 3\n", new Room[4]);
    public static final Room r47 = new Room("c22", "A room in level 3\n", new Room[4]);
    public static final Room r48 = new Room("c23", "A room in level 3\n", new Room[4]);
    public static final Room r49 = new Room("c24", "A room in level 3\n", new Room[4]);
    public static final Room r50 = new Room("c25", "A room in level 3\nThe ending point in level 3", new Room[4]);
    
    public Level getLevel1()
    {
        Room[] rooms = {r1, r2, r3, r4, r5, r6, r7, r8, r9};
        r1.setAdjRooms(new Room[]{r2, r4});
        r2.setAdjRooms(new Room[]{r1, r3, r5});
        r3.setAdjRooms(new Room[]{r2, r6});
        r4.setAdjRooms(new Room[]{r1, r5, r7});
        r5.setAdjRooms(new Room[]{r2, r4, r6, r8});
        r6.setAdjRooms(new Room[]{r3, r5, r9});
        r7.setAdjRooms(new Room[]{r4, r8});
        r8.setAdjRooms(new Room[]{r5, r7, r9});
        r9.setAdjRooms(new Room[]{r6, r8});
        
        return new Level(rooms, null, null, "a9");
    }
    public Level getLevel2()
    {
        Room[] rooms = {r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25};
        r10.setAdjRooms(new Room[]{r11, r14});
        r11.setAdjRooms(new Room[]{r10, r12, r15});
        r12.setAdjRooms(new Room[]{r11, r13, r16});
        r13.setAdjRooms(new Room[]{r12, r17});
        r14.setAdjRooms(new Room[]{r10, r15, r18});
        r15.setAdjRooms(new Room[]{r11, r14, r16, r19});
        r16.setAdjRooms(new Room[]{r12, r15, r17, r20});
        r17.setAdjRooms(new Room[]{r13, r16, r21});
        r18.setAdjRooms(new Room[]{r14, r19, r22});
        r19.setAdjRooms(new Room[]{r15, r18, r20, r23});
        r20.setAdjRooms(new Room[]{r16, r19, r21, r24});
        r21.setAdjRooms(new Room[]{r17, r20, r25});
        r22.setAdjRooms(new Room[]{r18, r23});
        r23.setAdjRooms(new Room[]{r19, r22, r24});
        r24.setAdjRooms(new Room[]{r20, r23, r25});
        r25.setAdjRooms(new Room[]{r21, r24});
        
        return new Level(rooms, null, null, "b16");
    }
    public Level getLevel3()
    {
        Room[] rooms = {r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41,
                r42, r43, r44, r45, r46, r47, r48, r49, r50};
        r26.setAdjRooms(new Room[]{});
        r27.setAdjRooms(new Room[]{});
        r28.setAdjRooms(new Room[]{});
        r29.setAdjRooms(new Room[]{});
        r30.setAdjRooms(new Room[]{});
        r31.setAdjRooms(new Room[]{});
        r32.setAdjRooms(new Room[]{});
        r33.setAdjRooms(new Room[]{});
        r34.setAdjRooms(new Room[]{});
        r35.setAdjRooms(new Room[]{});
        r36.setAdjRooms(new Room[]{});
        r37.setAdjRooms(new Room[]{});
        r38.setAdjRooms(new Room[]{});
        r39.setAdjRooms(new Room[]{});
        r40.setAdjRooms(new Room[]{});
        r41.setAdjRooms(new Room[]{});
        r42.setAdjRooms(new Room[]{});
        r43.setAdjRooms(new Room[]{});
        r44.setAdjRooms(new Room[]{});
        r45.setAdjRooms(new Room[]{});
        r46.setAdjRooms(new Room[]{});
        r47.setAdjRooms(new Room[]{});
        r48.setAdjRooms(new Room[]{});
        r49.setAdjRooms(new Room[]{});
        r50.setAdjRooms(new Room[]{});
        
        return new Level(rooms, null, null, "c25");
    }
}
