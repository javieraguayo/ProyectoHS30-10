/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bushodevelopers.proyectohs30.ejb;

import com.bushodevelopers.proyectohs30.model.Base_Datos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author javie
 */
@Stateless
public class Base_DatosFacade extends AbstractFacade<Base_Datos> {

    @PersistenceContext(unitName = "com.bushoDevelopers_proyectoHS30-10_war_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Base_DatosFacade() {
        super(Base_Datos.class);
    }
    
}
