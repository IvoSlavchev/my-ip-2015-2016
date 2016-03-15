package org.elsysbg.ip.todo.services;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.elsysbg.ip.todo.entities.Member;

@Singleton
public class AuthenticationService {
	private final MembersService membersService;

	@Inject
	public AuthenticationService(MembersService membersService) {
		this.membersService = membersService;
	}

	public Member getCurrentlyLoggedInMember() {
		final List<Member> members = membersService.getMembers();
		return members.get(0);
	}
}