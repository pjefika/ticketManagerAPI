/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.ticketmanagerapi.model.service;

import br.net.gvt.efika.ticketmanagerapi.model.entity.Ticket;
import java.util.List;

/**
 *
 * @author G0042204
 */
public interface TicketService {
    
    public List<Ticket> listar() throws Exception;
    
}
