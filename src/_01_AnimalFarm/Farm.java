package _01_AnimalFarm;

import java.util.ArrayList;
import java.util.Random;

public class Farm {
public static void main(String[] args) {
ArrayList<Animal> farm = new ArrayList<Animal>();
Random r = new Random();

for (int i = 0; i < 6; i++) {
	int ran = r.nextInt(4);
	
	if (ran == 0) {
		farm.add(new WhaleShark());
	}else if (ran == 1) {
		farm.add(new Piranha());
	}else if (ran == 2) {
		farm.add(new Sheep());
	}else {
		farm.add(new Vaquita());
	}
}

for (int i = 0; i < farm.size(); i++) {
	farm.get(i).makeNoise();
	farm.get(i).walk();
}
}
}
