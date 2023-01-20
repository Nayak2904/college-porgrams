import javax.sound.sampled.SourceDataLine;

class SolarSystem{
	public void ss(){
		System.out.print("Solar System -> ");
	}
}
class Earth extends SolarSystem{
	public void er(){
		System.out.print("Earth -> ");
	}
}
class mars extends SolarSystem{
	public void mr(){
		System.out.print("Mars");
	}
}
class Satelite extends Earth{
	public void mo(){
		System.out.print("Moon is the satelite of earth.\n");
	}
}
public class Moon {

	public static void main(String[] args) {
	SolarSystem s = new SolarSystem();
	Earth e = new Earth();
	e.ss();
	e.er();
	Satelite n = new Satelite();
	n.mo();
	mars m = new mars();
	m.ss();
	m.mr();
		
	}
}