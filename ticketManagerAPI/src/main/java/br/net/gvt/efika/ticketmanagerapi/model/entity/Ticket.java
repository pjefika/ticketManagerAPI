/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.ticketmanagerapi.model.entity;

import br.net.gvt.efika.mongo.model.entity.AbstractMongoEntity;
import br.net.gvt.efika.ticketmanagerapi.model.enuns.TicketStatusEnum;
import java.util.Date;
import java.util.List;

/**
 *
 * @author G0042204
 */
public class Ticket extends AbstractMongoEntity {

    private String key;

    private Layer layer;

    private Ticket destiny;

    private List<KeyValue> genericAttrs;

    private TicketConclusion conclusion;

    private TicketStatusEnum status;

    private Date creationDate;

    private Date treatmentDate;

    private Date conclusionDate;

    public Ticket() {
    }

    public Layer getLayer() {
        return layer;
    }

    public void setLayer(Layer layer) {
        this.layer = layer;
    }

    public List<KeyValue> getGenericAttrs() {
        return genericAttrs;
    }

    public void setGenericAttrs(List<KeyValue> genericAttrs) {
        this.genericAttrs = genericAttrs;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public TicketConclusion getConclusion() {
        return conclusion;
    }

    public void setConclusion(TicketConclusion conclusion) {
        this.conclusion = conclusion;
    }

    public TicketStatusEnum getStatus() {
        return status;
    }

    public void setStatus(TicketStatusEnum status) {
        this.status = status;
    }

    public Date getConclusionDate() {
        return conclusionDate;
    }

    public void setConclusionDate(Date conclusionDate) {
        this.conclusionDate = conclusionDate;
    }

    public Ticket getDestiny() {
        return destiny;
    }

    public void setDestiny(Ticket destiny) {
        this.destiny = destiny;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getTreatmentDate() {
        return treatmentDate;
    }

    public void setTreatmentDate(Date treatmentDate) {
        this.treatmentDate = treatmentDate;
    }

}
