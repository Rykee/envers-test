package com.test.envertest.data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "program", schema = "test")
@Audited
@EntityListeners(AuditingEntityListener.class)
public class ProgramEntity {

  @Id
  @Column(name = "id")
  @SequenceGenerator(name = "ProgramSequenceGen", sequenceName = "program_id_seq", schema = "test", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ProgramSequenceGen")
  private long id;

  @OneToOne(mappedBy = "program", cascade = CascadeType.ALL, optional = false)
  private MyCustomPlan customPlan;

}
