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
public class Layer extends AbstractMongoEntity {

    private String name;
    
    private Layer destiny;

    private TicketConclusionCategory conclusionCategory;

    public Layer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Layer getDestiny() {
        return destiny;
    }

    public void setDestiny(Layer destiny) {
        this.destiny = destiny;
    }

    public TicketConclusionCategory getConclusionCategory() {
        return conclusionCategory;
    }

    public void setConclusionCategory(TicketConclusionCategory conclusionCategory) {
        this.conclusionCategory = conclusionCategory;
    }

    
    
}
