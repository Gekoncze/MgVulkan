package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class PFNInternalAllocationNotification extends VulkanFunctionPointer {
    public PFNInternalAllocationNotification(){
        super(new PFNvkInternalAllocationNotification());
    }

    public PFNInternalAllocationNotification(PFNvkInternalAllocationNotification vk){
        super(vk);
    }

    @Override
    public PFNvkInternalAllocationNotification getVk(){
        return (PFNvkInternalAllocationNotification) super.getVk();
    }

    public PFNInternalAllocationNotification(long value){
        super(value);
    }
}
