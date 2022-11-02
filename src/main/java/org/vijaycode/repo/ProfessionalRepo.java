package org.vijaycode.repo;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.vijaycode.entity.Professional;

import java.util.List;

public interface ProfessionalRepo extends JpaRepository<Professional, Integer> {


    //reserved words
    //custom methods(SQL)
    //SQL queries

    //predefined methods  (T--Entity)
    //List<T> findAll(Sort sort);--Link
    //List<T> findAll();
    //Page<T> findAll(Pageable ref)--Link
    //Page<T> findAll(Pageable ref,SORT sort)--Link


//<T> save(T t)  -->Create and update
//Note: 1. Return <T> will have generated primary key,but T will not have primary key
//Note:2. If T will  have primary key and  we are using save method that time JPA will undersatnd that update operation need to perform.

    //<List<T> saveAll(List<T> ref)
    //Note: 1. Return <T> will have generated primary key,but T will not have primary key
    //Note:2. If T will  have primary key and  we are using save method that time JPA will undersatnd that update operation need to perform.

    //void delete( T t)
    //void deleteAll(List<T> ref)
    //void deleteById(primary key)

    //Note: if we are performing any delete operation that entity must have key.


    // boolean existsById(primaryKey)

    // long count()


// findById(primaryKey)

    //Optional<T> findByEmpId(Integer empId);
    //Optional<T> findAllByEmpId(Integer empId);


    //findAllByManagerNameAndProjectNumber(String managerName,Integer projectNumber);

    //findAllByManagerNameStartWith(Character input)

    @Query(value = "select * from professional  where age =:age", nativeQuery = true)
    List<Professional> getAllData(@Param("age") Integer age);

    @Query(value = "select * from professional  where age =?1", nativeQuery = true)
    List<Professional> getAllData1( Integer age);

    //table-1
    //table-2
    //table-3

    @Query(value = "join query", nativeQuery = true)
    List<Object[]> getAllDataNew();


}
