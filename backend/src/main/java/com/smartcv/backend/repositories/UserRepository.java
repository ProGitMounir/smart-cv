package com.smartcv.backend.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import com.smartcv.backend.models.Users;

public interface UserRepository extends JpaRepository<Users, UUID> {
    
}
