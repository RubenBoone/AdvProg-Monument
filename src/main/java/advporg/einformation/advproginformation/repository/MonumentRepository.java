package advporg.einformation.advproginformation.repository;

import advporg.einformation.advproginformation.model.Monument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;

public interface MonumentRepository extends MongoRepository<Monument, String> {
    Monument findMonumentByMonuCode(String monuCode);
    List<Monument> findMonumentByBuildYear(String buildYear);
    List<Monument> findAllByOrderByBuildYearDesc();
    List<Monument> findAllByOrderByBuildYearAsc();
}
