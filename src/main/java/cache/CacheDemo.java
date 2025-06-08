package cache;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.*;

@Entity
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class CacheDemo {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		protected Long Id;
		protected String fullname;
		
		public Long getId() {
			return Id;
		}
		
		public String getFullName() {
			return fullname;
		}
		public void setFullName(String fullname) {
			this.fullname = fullname;
		}
}
