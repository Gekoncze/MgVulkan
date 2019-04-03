package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkInternalAllocationNotification.html">khronos documentation</a>
 **/
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
