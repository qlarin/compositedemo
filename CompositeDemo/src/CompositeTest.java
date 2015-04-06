
public class CompositeTest {

	public static void main(String[] args){
		
		Person mod1 = new Person("Tomasz", "Kowalski", 22, "5star player");
		Person mod2 = new Person("Karol", "Nowak", 23, "4star player");
		
		Person player1 = new Person("Stan", "Mark", 19, "soldier rank 5");
		Person player2 = new Person("Ilia", "Erving", 27, "soldier rank 3");
		Person player3 = new Person("Sophie", "Mark", 17, "soldier rank 5");
		
		Person guildMaster = new Person("Michael", "Glory", 35, "Commander");
		
		guildMaster.add(mod1);
		guildMaster.add(mod2);
		
		mod1.add(player1);
		mod2.add(player2);
		mod2.add(player3);
		
		System.out.println(guildMaster);
		
		for(Person p : guildMaster.getListOfPersons()){
			System.out.println(p);
			
			for(Person player : p.getListOfPersons()){
				System.out.println(player);
			}
		}
	}
}
