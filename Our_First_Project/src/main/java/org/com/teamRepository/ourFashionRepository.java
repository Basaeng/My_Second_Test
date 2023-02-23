package org.com.teamRepository;

import org.com.domain.Color;
import org.com.domain.Member;

import java.util.Optional;

public interface ourFashionRepository {

    Member save(Member member);
    Member clothes(Member member);
    Color favorite(Member member);

    public Optional<Member> findByColor(Color color);
}
