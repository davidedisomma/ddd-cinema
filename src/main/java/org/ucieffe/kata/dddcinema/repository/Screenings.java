package org.ucieffe.kata.dddcinema.repository;

import org.ucieffe.kata.dddcinema.model.Date;
import org.ucieffe.kata.dddcinema.model.Screening;

import java.util.List;

public interface Screenings {

    List<Screening> availableOn(Date date);
}
