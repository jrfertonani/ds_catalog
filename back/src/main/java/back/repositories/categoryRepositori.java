package back.repositories;

import back.domain.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface categoryRepositori extends JpaRepository<Category, Long> {
}
