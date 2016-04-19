import java.util.LinkedList;
public class ActualRooms 
{
    public static final Room r1 = new Room("Cryogenic Chamber", "The room where astronauts are stored during long flights.\n", new Room[4]);
    public static final Room r2 = new Room("Lavoraty", "There is generally only one use for this room, but knows, the crash may have jostled some things around.\n", new Room[4]);
    public static final Room r3 = new Room("Broom Closet", "In hindsight, it was probably not necessary to bring this many brooms...\n", new Room[4]);
    public static final Room r4 = new Room("Food Storage", "All the food you could ever imagine...\n\n\nIn one heap of ashes.\n", new Room[4]);
    public static final Room r5 = new Room("Analysis Room", "This is where the science happens.\n", new Room[4]);
    public static final Room r6 = new Room("Lounge", "You could just stay in here forever... There's a comfy couch.\n", new Room[4]);
    public static final Room r7 = new Room("Cockpit", "This room is where the pilots sit while the computer pilots the ship.\n", new Room[4]);
    public static final Room r8 = new Room("Hangar", "There is an assortment of broken vehicles around you.\n", new Room[4]);
    public static final Room r9 = new Room("Airlock", "The last room before you can go outside.\n", new Room[4]);
    public static final Room r10 = new Room("Tundra Entry Point", "Brrr...this place is kinda chilly.\n", new Room[4]);
    public static final Room r11 = new Room("Alpha Glacier NW", "The largest glacier on all of Mars. NW point.\n", new Room[4]);
    public static final Room r12 = new Room("Alpha Glacier N", "The largest glacier on all of Mars. N point.\n", new Room[4]);
    public static final Room r13 = new Room("Alpha Glacier NE", "The largest glacier on all of Mars. NE point.\n", new Room[4]);
    public static final Room r14 = new Room("Xevien Base Camp West", "A strange base camp that was abandoned...wonder why?\n", new Room[4]);
    public static final Room r15 = new Room("Xevien Base Camp East", "A strange base camp that was abandoned...wonder why?\n", new Room[4]);
    public static final Room r16 = new Room("Alpha Glacier S", "The largest glacier on all of Mars. S point.\n", new Room[4]);
    public static final Room r17 = new Room("Alpha Glacier SE", "The largest glacier on all of Mars. SE point.\n", new Room[4]);
    public static final Room r18 = new Room("Bostrous Plains NW", "Flatlands that are barren. Looks like no one's been here in a while. NW point.\n", new Room[4]);
    public static final Room r19 = new Room("Bostrous Plains NE", "Flatlands that are barren. Looks like no one's been here in a while. NE point.\n", new Room[4]);
    public static final Room r20 = new Room("Phenic Mountain Base", "The base of a really steep mountain. This climb looks impossible...\n", new Room[4]);
    public static final Room r21 = new Room("Phenic Mountain Base", "The base of a really steep mountain. This climb looks impossible...\n", new Room[4]);
    public static final Room r22 = new Room("Bostrous Plains SW", "Flatlands that are barren. Looks like no one's been here in a while. SW point.\n", new Room[4]);
    public static final Room r23 = new Room("Bostrous Plains SE", "Flatlands that are barren. Looks like no one's been here in a while. SE point.\n", new Room[4]);
    public static final Room r24 = new Room("Phenic Mountain Base", "The base of a really steep mountain. This climb looks impossible...\n", new Room[4]);
    public static final Room r25 = new Room("Phenic Mountain Camp", "An abandoned camp on the side of Phenic Mountain. The ending point in level 2\n", new Room[4]);
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
        
        return new Level(rooms, null, null, "Airlock");
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
        r26.setAdjRooms(new Room[]{r27, r31});
        r27.setAdjRooms(new Room[]{r26, r28, r32});
        r28.setAdjRooms(new Room[]{r27, r29, r33});
        r29.setAdjRooms(new Room[]{r28, r30, r34});
        r30.setAdjRooms(new Room[]{r29, r35});
        r31.setAdjRooms(new Room[]{r26, r32, r36});
        r32.setAdjRooms(new Room[]{r27, r31, r33, r37});
        r33.setAdjRooms(new Room[]{r28, r32, r34, r38});
        r34.setAdjRooms(new Room[]{r29, r33, r35, r39});
        r35.setAdjRooms(new Room[]{r30, r34, r40});
        r36.setAdjRooms(new Room[]{r31, r37, r41});
        r37.setAdjRooms(new Room[]{r32, r36, r38, r42});
        r38.setAdjRooms(new Room[]{r33, r37, r39, r43});
        r39.setAdjRooms(new Room[]{r34, r38, r40, r44});
        r40.setAdjRooms(new Room[]{r35, r39, r45});
        r41.setAdjRooms(new Room[]{r36, r42, r46});
        r42.setAdjRooms(new Room[]{r37, r41, r43, r47});
        r43.setAdjRooms(new Room[]{r38, r42, r44, r48});
        r44.setAdjRooms(new Room[]{r39, r43, r45, r49});
        r45.setAdjRooms(new Room[]{r40, r44, r50});
        r46.setAdjRooms(new Room[]{r41, r47});
        r47.setAdjRooms(new Room[]{r42, r46, r48});
        r48.setAdjRooms(new Room[]{r43, r47, r49});
        r49.setAdjRooms(new Room[]{r44, r48, r50});
        r50.setAdjRooms(new Room[]{r45, r49});
        
        return new Level(rooms, null, null, "c25");
    }
}
