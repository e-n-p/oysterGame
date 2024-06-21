package com.oysterGame.domains.huts;

import com.oysterGame.domains.AbstractService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class HutService extends AbstractService<Hut, Long> {

    public HutService(JpaRepository<Hut, Long> repository) {
        super(repository);
    }

    @Override
    public Hut update(Hut updateEntity, Long id) {
        Hut foundHut = getById(id);
        foundHut.setName(updateEntity.getName());
        foundHut.setPrice(updateEntity.getPrice());
        foundHut.setBoats(updateEntity.getBoats());
        foundHut.setLocation(updateEntity.getLocation());
        return this.repository.save(foundHut);
    }
}
