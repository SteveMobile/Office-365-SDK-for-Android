package com.microsoft.office365.test.integration.tests.filters;

import com.microsoft.office365.test.integration.framework.objectFiller.ObjectFiller;
import com.microsoft.office365.test.integration.framework.objectFiller.PropertyFilter;
import com.microsoft.office365.test.integration.framework.objectFiller.PropertyFilterContext;
import com.microsoft.services.outlook.Folder;

import java.util.UUID;


public class FolderFilter implements PropertyFilter {

    public boolean canHandle(PropertyFilterContext context) {
        if (context.getPropertyClass().equals(Folder.class)) {
            return true;
        }

        return false;
    }

    public Object handle(PropertyFilterContext context, ObjectFiller objectFiller) throws IllegalAccessException, InstantiationException {
        Object obj = null;

        if (context.getPropertyClass().equals(Folder.class)) {
            Folder folder = (Folder) context.getPropertyObject();
            folder.setDisplayName("Folder" + UUID.randomUUID().toString());
            obj = folder;
        }

        return obj;
    }
}
