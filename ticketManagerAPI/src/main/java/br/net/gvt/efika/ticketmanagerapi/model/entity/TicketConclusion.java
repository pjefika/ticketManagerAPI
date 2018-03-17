/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.ticketmanagerapi.model.entity;

import br.net.gvt.efika.mongo.model.entity.AbstractMongoEntity;

/**
 *
 * @author G0042204
 */
public class TicketConclusion extends AbstractMongoEntity {

    private String name;

    private TicketConclusionCategory category;

    public TicketConclusion() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TicketConclusionCategory getCategory() {
        return category;
    }

    public void setCategory(TicketConclusionCategory category) {
        this.category = category;
    }

}
