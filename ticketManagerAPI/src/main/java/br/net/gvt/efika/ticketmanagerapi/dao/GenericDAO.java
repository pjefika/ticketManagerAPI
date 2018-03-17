/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.ticketmanagerapi.dao;

/**
 *
 * @author G0042204
 * @param <T>
 */
public interface GenericDAO<T> {

    public T save(T t) throws Exception;

}
