package phamminhquoc.demo.repository;

import  phamminhquoc.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {
}
