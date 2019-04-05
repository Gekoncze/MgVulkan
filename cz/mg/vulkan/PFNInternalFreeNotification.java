package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class PFNInternalFreeNotification extends VulkanFunctionPointer {
    public PFNInternalFreeNotification(){
        super(new PFNvkInternalFreeNotification());
    }

    public PFNInternalFreeNotification(PFNvkInternalFreeNotification vk){
        super(vk);
    }

    @Override
    public PFNvkInternalFreeNotification getVk(){
        return (PFNvkInternalFreeNotification) super.getVk();
    }

    public PFNInternalFreeNotification(long value){
        super(value);
    }
}
