package pt.iade.unimanager_db.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "cursos")
public class Course {
    @Id @GeneratedValue (strategy= GenerationType.IDENTITY)
    @Column(name="cur_id") private int id;
    @Column(name="cur_nome") private String name;
    @OneToMany @JoinColumn(name="pla_cur_id")
    @JsonIgnoreProperties("course")
    private List<Plan> plans;

      public Course() {}

      public int getId() {
          return id;
      }

      public void setId(int id) {
          this.id = id;
      }

      public String getName() {
          return name;
      }

      public void setName(String name) {
          this.name = name;
      }

      public List<Plan> getPlans() {
          return plans;
      }

      public void setPlans(List<Plan> plans) {
          this.plans = plans;
      }

      
  







    }
