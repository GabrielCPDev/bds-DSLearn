package com.gabriel.dslearnbds.observers;

import com.gabriel.dslearnbds.entities.Deliver;

public interface DeliverRevisionObserver {

	void onSaveRevision(Deliver deliver);
}
