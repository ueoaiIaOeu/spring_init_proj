package org.example.repositories;


import org.example.entity.MyData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyDataRepository extends JpaRepository<MyData, Long> {
}
