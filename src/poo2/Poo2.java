package poo2;

public class Poo2 {

	public static void main(String[] args) {
		Person jeanMichel = new Person("Jean","Michel");
		Person victorHugo = new Person("Victor","Hugo");

		for (int i = 0; i < 10; i++) {
			jeanMichel.ramasserPomme(new Apple());
		}

		jeanMichel.echangePomme(victorHugo, 1);

		jeanMichel.mangerPomme();
		victorHugo.mangerPomme();

		jeanMichel.tatin();

		for (int i = 0; i < 4; i++) {
			jeanMichel.ramasserPomme(new Apple());
		}

		jeanMichel.tatin();

		for (int i = 0; i < 4; i++) {
			victorHugo.ramasserPomme(new Apple());
		}

		victorHugo.echangePomme(jeanMichel, 4);
	}

}
