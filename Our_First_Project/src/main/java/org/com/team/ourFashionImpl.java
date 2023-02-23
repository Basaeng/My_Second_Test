package org.com.team;

import org.com.domain.Member;

public class ourFashionImpl implements ourFashion {

    Member member = new Member();

    @Override
    public Member clothes(Member member) {
        System.out.println(member.toString());
        return member;
    }

    @Override
    public String favorite(String pieces) {
        return pieces;
    }
}
