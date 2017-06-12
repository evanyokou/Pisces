package com.yh.web.repo

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.NoRepositoryBean
import org.springframework.data.repository.PagingAndSortingRepository
import java.io.Serializable

/**
 * Created by Ypc on 2017/06/12.
 */
@NoRepositoryBean
interface BaseRepo<T, ID : Serializable> :JpaRepository<T,ID>,PagingAndSortingRepository<T,ID> {

}