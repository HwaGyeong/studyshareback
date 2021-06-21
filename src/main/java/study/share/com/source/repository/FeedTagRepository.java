package study.share.com.source.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.share.com.source.model.feed.FeedTag;

public interface FeedTagRepository extends JpaRepository<FeedTag,Long> {
}
