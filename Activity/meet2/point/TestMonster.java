public class TestMonster {
	public static void main(String[] args) {
		//create instances of three monsters (m1,m2,m3) and initialize their fields
		Monster m1 = new Monster();
		m1.name = "Golem";
        m1.hp = 1000;
        m1.mp = 300;
        m1.item = "Diamond";
        
		Monster m2 = new Monster();
		m2.name = "Slime";
        m2.hp = 300;
        m2.mp = 200;
        m2.item = "Slime Condensate";

		Monster m3 = new Monster();
		m3.name = "Dark Knight";
        m3.hp = 2000;
        m3.mp = 1000;
        m3.item = "Sword of Darkness";
		
		//declare an array monsters with type Monster and size = 3
		Monster[] monsters = new Monster[3];

		//initialize the array with m1,m2,m3
		monsters[0] = m1;
		monsters[1] = m2;
		// monsters[2] = m3;
		
		//print all monsters in the array
		for(int i = 0; i < monsters.length; i++) {
			System.out.println("A monster has appeared! " + monsters[i].name + " HP:" + monsters[i].hp + " MP:" + monsters[i].mp);
		}
	}	
}