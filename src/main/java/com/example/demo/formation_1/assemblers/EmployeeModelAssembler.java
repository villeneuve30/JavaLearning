package com.example.demo.formation_1.assemblers;

import com.example.demo.formation_1.controllers.EmployeeController;
import com.example.demo.formation_1.entities.Employee;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class EmployeeModelAssembler implements RepresentationModelAssembler<Employee, EntityModel<Employee>> {
    @Override
    public EntityModel<Employee> toModel(Employee employee) {
        return EntityModel.of(employee,
                WebMvcLinkBuilder.linkTo(methodOn(EmployeeController.class).one(employee.getId())).withSelfRel(),
                linkTo(methodOn(EmployeeController.class).all()).withRel("employees"));
    }

    @Override
    public CollectionModel<EntityModel<Employee>> toCollectionModel(Iterable<? extends Employee> entities) {
        return RepresentationModelAssembler.super.toCollectionModel(entities);
    }
}
