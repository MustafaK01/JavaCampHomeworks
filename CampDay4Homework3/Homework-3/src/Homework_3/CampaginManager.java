package Homework_3;

public class CampaginManager implements CampaginService {

	@Override
	public void add(Campagin campagin) {
		System.out.println(campagin.getCampaginName()+" is added.");
	}

	@Override
	public void update(Campagin campagin) {
		System.out.println(campagin.getCampaginName()+"is updated.");
	}

	@Override
	public void delete(Campagin campagin) {
		System.out.println(campagin.getCampaginName()+"is deleted.");
	}

	
}
