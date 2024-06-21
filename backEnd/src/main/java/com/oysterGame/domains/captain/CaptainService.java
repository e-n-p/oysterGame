package com.oysterGame.domains.captain;

import com.oysterGame.domains.AbstractService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CaptainService extends AbstractService<Captain, Long> {

    public CaptainService(JpaRepository<Captain, Long> repository) {
        super(repository);
    }

    @Override
    public Captain update(Captain updateEntity, Long id) {
        Captain foundCap = getById(id);
        foundCap.setLicence(updateEntity.getLicence());
        foundCap.setExperience(updateEntity.getExperience());
        foundCap.setName(updateEntity.getName());
        foundCap.setBoat(updateEntity.getBoat());

        return this.repository.save(foundCap);
    }
}
