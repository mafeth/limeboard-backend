package net.cuodex.limeboard.repository;

import net.cuodex.limeboard.entity.LimeBoard;
import net.cuodex.limeboard.entity.LimeUser;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Repository
public interface LimeboardRepository extends JpaRepository<LimeBoard, Serializable> {

    @Override
    List<LimeBoard> findAll();

    @Override
    Optional<LimeBoard> findById(Serializable serializable);

    @Override
    <S extends LimeBoard> Optional<S> findOne(Example<S> example);
}
