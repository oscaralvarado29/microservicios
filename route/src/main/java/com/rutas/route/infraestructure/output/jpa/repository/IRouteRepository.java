package com.rutas.route.infraestructure.output.jpa.repository;

import com.rutas.route.infraestructure.output.jpa.entity.RouteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IRouteRepository extends JpaRepository<RouteEntity, Long> {
    Optional<RouteEntity> findByRouteName(String routeName);
    void deleteByRouteName(String routeName);
}
