/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.ticketmanagerapi.dao;

import br.net.gvt.efika.mongo.dao.AbstractMongoDAO;
import br.net.gvt.efika.mongo.dao.MongoEndpointEnum;
import br.net.gvt.efika.ticketmanagerapi.model.entity.Ticket;

/**
 *
 * @author G0042204
 */
public class TicketDAOImpl extends AbstractMongoDAO<Ticket> implements TicketDAO{

    public TicketDAOImpl() {
        super(MongoEndpointEnum.MONGO.getIp(), "ticketManagerAPI", Ticket.class);
    }

}
