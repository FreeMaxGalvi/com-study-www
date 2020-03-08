package com.study.nds.repository;

import com.study.nds.domain.Sensor;
import org.springframework.data.repository.CrudRepository;

public interface SensorRepository extends CrudRepository<Sensor, Long> {
}
