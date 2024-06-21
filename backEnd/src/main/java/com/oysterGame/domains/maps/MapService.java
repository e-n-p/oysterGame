package com.oysterGame.domains.maps;

import com.oysterGame.domains.AbstractService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class MapService extends AbstractService<Map, Long> {

    public MapService(JpaRepository<Map, Long> repository) {
        super(repository);
    }

    @Override
    public Map update(Map updateEntity, Long id) {
        Map foundMap = getById(id);
        foundMap.setMap(updateEntity.getMap());
        foundMap.setHeight(updateEntity.getHeight());
        foundMap.setHeight(updateEntity.getHeight());
        return this.repository.save(foundMap);
    }
}
