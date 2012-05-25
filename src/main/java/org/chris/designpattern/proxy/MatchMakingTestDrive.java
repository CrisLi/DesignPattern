package org.chris.designpattern.proxy;

import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {

	public static void main(String[] args) {

		PersonBean person = new PersonBeanImpl();

		person.setGender("Male");
		person.setName("Chris");
		person.setHotOrNotRating(5);

		PersonBean ownerProxy = getOwnerProxy(person);
		ownerProxy.setInterests("Football");

		System.out.println("Name is: " + ownerProxy.getName());
		System.out.println("Interests: " + ownerProxy.getInterests());

		try {
			ownerProxy.setHotOrNotRating(10);
		} catch (Exception e) {
			System.out.println("Can’t set rating from owner proxy");
		}

		PersonBean nonOwnerProxy = getNonOwnerProxy(person);

		nonOwnerProxy.setHotOrNotRating(10);
		
		System.out.println("Hot or Not Rating: " + ownerProxy.getHotOrNotRating());

		try {
			nonOwnerProxy.setInterests("None");
		} catch (Exception e) {
			System.out.println("Can’t set intersets from non owner proxy");
		}

	}

	private static PersonBean getOwnerProxy(PersonBean person) {

		return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person
				.getClass().getInterfaces(), new OwnerInvocationHandler(person));
	}

	private static PersonBean getNonOwnerProxy(PersonBean person) {

		return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person
				.getClass().getInterfaces(), new NonOwnerInvocationHandler(person));
	}
}
