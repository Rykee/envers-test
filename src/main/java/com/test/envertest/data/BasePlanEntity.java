package com.test.envertest.data;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

@MappedSuperclass
@AllArgsConstructor
@SuperBuilder
@NoArgsConstructor
@Getter
@Audited
abstract class BasePlanEntity {

  @Id
  @Column(name = "id")
  @SequenceGenerator(name = "MySeqGen", sequenceName = "custom_plan_id_seq", schema = "test", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MySeqGen")
  private long id;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "program_id", nullable = false)
  @MapsId
  private ProgramEntity program;

  @Column(name = "enabled")
  @Setter
  private boolean enabled;

}
